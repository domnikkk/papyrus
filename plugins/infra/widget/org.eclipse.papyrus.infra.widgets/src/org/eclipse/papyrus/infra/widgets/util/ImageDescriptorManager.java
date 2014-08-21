/**
 *
 */
package org.eclipse.papyrus.infra.widgets.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;

/**
 * Manager for ImageDescriptor by keys
 */
public class ImageDescriptorManager {

	protected Map<ImageDescriptor, String> imageDescriptor2Key = new HashMap<ImageDescriptor, String>();

	protected int value;

	public void reset() {
		imageDescriptor2Key.clear();
	}

	public String getKey(ImageDescriptor descriptor) {
		String key = null;
		if (!imageDescriptor2Key.containsKey(descriptor)) {
			key = computeKey(descriptor);
			imageDescriptor2Key.put(descriptor, key);
		} else {
			key = imageDescriptor2Key.get(descriptor);
		}
		return key;
	}

	protected String computeKey(ImageDescriptor descriptor) {
		return "" + descriptor.hashCode();
	}


}
