package org.eclipse.papyrus.mwe2.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.Workflow;
import org.eclipse.xtext.xbase.lib.StringExtensions;

import com.google.common.collect.ForwardingList;
import com.google.common.collect.Lists;

public class XtendWorkflow extends Workflow {

  protected List<Object> getBeans() {
		return Lists.newArrayList();
	}

	protected List<IWorkflowComponent> getComponents() {
		return getChildren();
	}

	protected <T> T autoInject(T t) {
		Class<?> tClass = t.getClass();
		for (Field field : getClass().getFields()) {
			String name = field.getName();
			Class<?> type = field.getType();
			try {
				Method setter = tClass.getMethod(
						"set" + StringExtensions.toFirstUpper(name), type);
				field.setAccessible(true);
				setter.setAccessible(true);
				setter.invoke(t, field.get(this));
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// no problem
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return t;
	}

	protected <T> T getInstance(Class<T> clazz) {
		T t = null;
		try {
			t = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		if (t != null)
			t = autoInject(t);
		return t;
	}
}