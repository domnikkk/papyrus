/*****************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   CEA LIST - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrus.views.properties.runtime;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.papyrus.views.properties.contexts.Section;

/**
 * A proxy for {@link Section}s that distinguishes multiple occurrences of the same instance via an arbitrary discriminator.
 */
class SectionDiscriminator implements InvocationHandler {
	private static final Class<?>[] PROXY_INTERFACES = { Section.class, EObject.class, InternalEObject.class };

	private final Section section;
	private final Object discriminator;

	SectionDiscriminator(Section section, Object discriminator) {
		this.section = section;
		this.discriminator = discriminator;
	}

	static Section discriminate(Section section, Object discriminator) {
		return (Section) Proxy.newProxyInstance(section.getClass().getClassLoader(), PROXY_INTERFACES, new SectionDiscriminator(section, discriminator));
	}

	static Object getDiscriminator(Section section) {
		Object result = null;

		if (Proxy.isProxyClass(section.getClass())) {
			InvocationHandler handler = Proxy.getInvocationHandler(section);
			if (handler instanceof SectionDiscriminator) {
				result = ((SectionDiscriminator) handler).discriminator;
			}
		}

		return result;
	}

	static boolean isDiscriminated(Section section) {
		boolean result = false;

		if ((section != null) && Proxy.isProxyClass(section.getClass())) {
			InvocationHandler handler = Proxy.getInvocationHandler(section);
			result = handler instanceof SectionDiscriminator;
		}

		return result;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;

		if (method.getDeclaringClass() == Object.class) {
			// Don't delegate equals(), hashCode(), and monitor protocol
			if (method.getName().equals("equals")) { //$NON-NLS-1$
				if ((args[0] != null) && Proxy.isProxyClass(args[0].getClass())) {
					result = this.equals(Proxy.getInvocationHandler(args[0]));
				} else {
					result = proxy == args[0];
				}
			} else if (method.getName().equals("hashCode")) { //$NON-NLS-1$
				result = this.hashCode();
			} else {
				result = method.invoke(this, args);
			}
		} else {
			result = method.invoke(section, args);
		}

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = obj == this;
		if (!result && (obj instanceof SectionDiscriminator)) {
			SectionDiscriminator other = (SectionDiscriminator) obj;
			result = other.section == this.section && other.discriminator.equals(this.discriminator);
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + discriminator.hashCode();
		result = prime * result + section.hashCode();
		return result;
	}

}
