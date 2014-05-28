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

function layout(evt) {
	doLayout(evt.target);
}

function doLayout(parent) {
	verticalFlow(parent);
}

function verticalFlow(parent) {
	var x = parent.getAttribute("x");
	var y = parent.getAttribute("y");
	var width = parent.getAttribute("width");
	var height = parent.getAttribute("height");

	var children = parent.getChildNodes();
	var n = children.getLength();
	var childHeight = height / n; 
    for (var i=0; i<n; i++)
		setBounds(children.item(i), 0, i*childHeight, width, childHeight);
}

function setBounds(element, x, y, width, height) {
	if (element.tagName == "rect")
		setRectBounds(element, x, y, width, height);
	else if (element.tagName == "svg")
		setSvgBounds(element, x, y, width, height);
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
	doLayout(element);
}

function setRectBounds(element, x, y, width, height) {
	element.setAttribute("x", x);
	element.setAttribute("y", y);
	element.setAttribute("width", width);
	element.setAttribute("height", height);
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
	var bbox = element.getBBox();
	element.setAttribute("x", x+(width-bbox.width)/2);
	element.setAttribute("y", y+(height+bbox.height/2)/2);
}

function setLineBounds(element, x, y, width, height) {
	var bbox = element.getBBox();
	element.setAttribute("x1", x);
	element.setAttribute("y1", y);
	element.setAttribute("x2", x+width);
	element.setAttribute("y2", y+height);
}
