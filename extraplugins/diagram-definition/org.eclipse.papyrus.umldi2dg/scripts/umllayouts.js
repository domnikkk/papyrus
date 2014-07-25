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

function flowLayout(parent, horizontal, insets) {
	var x = +parent.getAttribute("x")+insets;
	var y = +parent.getAttribute("y")+insets;
	var width = +parent.getAttribute("width")-2*insets;
	var height = +parent.getAttribute("height")-2*insets;

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

function Rectangle(x, y, width, height) {
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
}

function Point(x, y) {
	this.x = x;
	this.y = y;
}

function Dimension(width, height) {
	this.width = width;
	this.height = height;
}

function getChildren(parent) {
	var children = [];
	var elements = parent.childNodes;
	for (var i=0; i<elements.length; i++) {
		var element = elements.item(i);
		if (element.tagName != "script" && element.tagName != "defs" && element.nodeType != 3)
			children.push(element);
	}
	return children;
}

function validate(parent) {
	layout(parent);
	var children = getChildren(parent);
	for (var i=0; i<children.length; i++)
		validate(children[i]);
}

function layout(parent) {
	var lm = parent.getAttribute("layout");
	if (lm != null && lm.length>0)
		eval(lm);
}

function getPreferredSize(parent) {
	var lm = parent.getAttribute("layout");
	if (lm != null && lm.length>0) {
		var prefSize = eval("getPreferredSize_"+lm);
		return prefSize;
	} 
	var bbox = parent.getBBox();
	return new Dimension(bbox.width, bbox.height);
}

function getBounds(element) {
	var bbox = element.getBBox();
	return new Rectangle(bbox.x, bbox.y, bbox.width, bbox.height);
}

function setBounds(element, x, y, width, height) {
	
	if (element.tagName == "rect")
		setRectBounds(element, x, y, width, height);
	else if (element.tagName == "svg")
		setSvgBounds(element, x, y, width, height);
	else if (element.tagName == "g")
		setGBounds(element, x, y, width, height);
	else if (element.tagName == "circle")
		setCircleBounds(element, x, y, width, height);
	else if (element.tagName == "text")
		setTextBounds(element, x, y, width, height);
}

function setSvgBounds(element, x, y, width, height) {
	element.setAttribute("x", x);
	element.setAttribute("y", y);
	element.setAttribute("width", width);
	element.setAttribute("height", height);
}

function setGBounds(element, x, y, width, height) {
	element.setAttribute("x", x);
	element.setAttribute("y", y);
	element.setAttribute("width", width);
	element.setAttribute("height", height);
}

function setRectBounds(element, x, y, width, height) {
	element.setAttribute("x", x+1);
	element.setAttribute("y", y+1);
	element.setAttribute("width", width-2);
	element.setAttribute("height", height-2);
}

function setCircleBounds(element, x, y, width, height) {
	element.setAttribute("cx", x+width/2);
	element.setAttribute("cy", y+height/2);
	if (width <= height)
		element.setAttribute("r", width/2);
	else
		element.setAttribute("r", height/2);
}

function setTextBounds(element, x, y, width, height) {
	var anchor = element.getAttribute("text-anchor");
	if (anchor == "middle")
		element.setAttribute("x", x+width/2);
	else if (anchor == "end")
		element.setAttribute("x", x+width);
	else
		element.setAttribute("x", x);
	var bbox = element.getBBox();
	element.setAttribute("y", y+bbox.height);
}
