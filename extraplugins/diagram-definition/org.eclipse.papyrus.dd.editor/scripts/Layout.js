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
	else if (parent.tagName == "text")
		layoutText(parent);
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

function getPreferredSize(parent) {
	var lm = parent.getAttribute("layout");
	if (lm != null && lm.length>0) {
		var prefSize = eval("getPreferredSize_"+lm);
		return prefSize;
	} 
	var bbox = parent.getBBox();
	return new Dimension(bbox.width+10, bbox.height+10);
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
	element.setAttribute("width", width+1);
	element.setAttribute("height", height);
}

function setGBounds(element, x, y, width, height) {
	element.setAttribute("x", x);
	element.setAttribute("y", y);
	element.setAttribute("width", width);
	element.setAttribute("height", height);
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
	var anchor = element.getAttribute("text-anchor");
	if (anchor == "middle")
		element.setAttribute("x", x+width/2);
	else if (anchor == "end")
		element.setAttribute("x", x+width);
	else
		element.setAttribute("x", x);
	element.setAttribute("y", y+height/2);
}

function layoutText(element) {
	var x = +element.getAttribute("x");
	var y = +element.getAttribute("y");
	var width = +element.getAttribute("width");
	var height = +element.getAttribute("height");
	var anchor = element.getAttribute("text-anchor");
	var text = element.getTextContent();

	if (anchor == "middle")
		x = x+width/2;
	else if (anchor == "end")
		x = x+width;

	element.setAttribute("x", x);
	element.setAttribute("y", y);
	//element.setAttribute("dx", "0.2em");
	element.setAttribute("dy", "0.9em");

	var split = text.split("\\n");
	element.setTextContent("");
	for (var i=0; i<split.length; i++) {
		var tspan = document.createElementNS("http://www.w3.org/2000/svg", "tspan");
		tspan.setTextContent(split[i]);
		if (i > 0) {
			tspan.setAttribute("x", x);
			tspan.setAttribute("dy", "1em");
		}
		element.appendChild(tspan);
	}
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
