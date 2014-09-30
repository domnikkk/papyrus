/**
 * Copyright (c) 2014 CEA LIST.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *  CEA LIST - Initial API and implementation
 */

function xyLayout(parent) {
	var children = getChildren(parent);
	var n = children.length;
	for (var i=0; i<n; i++) {
		var child = children[i];
		var x = +child.getAttribute("x");
		var y = +child.getAttribute("y");
		var width = +child.getAttribute("width");
		var height = +child.getAttribute("height");
		var prefSize = getPreferredSize(child);
		width = Math.max(width, prefSize.width);
		height = Math.max(height, prefSize.height);
		setBounds(child, x, y, width, height);
	}
}

function getPreferredSize_xyLayout(parent) {
	var bounds = new Rectangle(0, 0, 0, 0);
	var children = getChildren(parent);
	for (var i=0; i<children.length; i++) {
		var childBounds = getBounds(children[i]);
		var prefSize = getPreferredSize(children[i]);
		childBounds.width = Math.max(childBounds.width, prefSize.width);
		childBounds.height = Math.max(childBounds.height, prefSize.height);
		var right = Math.max(bounds.x + bounds.width, childBounds.x + childBounds.width);
		var bottom = Math.max(bounds.y + bounds.height, childBounds.y + childBounds.height);
		bounds.x = Math.max(bounds.x, childBounds.x);
		bounds.y = Math.max(bounds.y, childBounds.y);
		bounds.width = right - bounds.x;
		bounds.height = bottom - bounds.y;
	}
	return new Dimension(bounds.width, bounds.height);
}

function stackLayout(parent) {
	var x = +parent.getAttribute("x");
	var y = +parent.getAttribute("y");
	var width = +parent.getAttribute("width");
	var height = +parent.getAttribute("height");
	
	if (parent.tagName == "svg") {
		x = 0;
		y = 0;
	}

	var children = getChildren(parent);
	var n = children.length;
	for (var i=0; i<n; i++) {
		setBounds(children[i], x, y, width, height);
	}
}

function getPreferredSize_stackLayout(parent) {
	var prefSize = new Dimension(0, 0);
	var children = getChildren(parent);
	for (var i=0; i<children.length; i++) {
		var childSize = getPreferredSize(children[i]);
		prefSize.width = Math.max(prefSize.width, childSize.width);
		prefSize.height = Math.max(prefSize.height, childSize.height);
	}
	return prefSize;
}

function flowLayout(parent, horizontal) {
	var x = +parent.getAttribute("x");
	var y = +parent.getAttribute("y");
	var width = +parent.getAttribute("width");
	var height = +parent.getAttribute("height");

	if (parent.tagName == "svg") {
		x = 0;
		y = 0;
	}

    var children = getChildren(parent);
	var n = children.length;
	for (var i=0; i<n; i++) {
		var prefSize = getPreferredSize(children[i]);
		if (horizontal) {
			var childWidth = prefSize.width;
			setBounds(children[i], x, y, childWidth, height);
			x += childWidth;
		} else {
			var childHeight = prefSize.height;
			setBounds(children[i], x, y, width, childHeight);
			y += childHeight;
		}
	}
}

function getPreferredSize_flowLayout(parent, horizontal) {
	var prefSize = new Dimension(0, 0);
	var children = getChildren(parent);
	for (var i=0; i<children.length; i++) {
		var childSize = getPreferredSize(children[i]);
		if (horizontal) {
			prefSize.width += childSize.width;
			prefSize.height = Math.max(prefSize.height, childSize.height);
		} else {
			prefSize.width = Math.max(prefSize.width, childSize.width);
			prefSize.height += childSize.height;
		}
	}
	return prefSize;
}
