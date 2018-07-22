package com.xpagesbeast.test.common;

public class Action {
	String id;
	String styleClass;
	String attributeSelector;
	String type;
	String label;
	String xpath;
		
	public Action() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Action(String id, String styleClass, String attributeSelector, String type, String label) {
		super();
		this.id = id;
		this.styleClass = styleClass;
		this.attributeSelector = attributeSelector;
		this.type = type;
		this.label = label;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStyleClass() {
		return styleClass;
	}
	public void setStyleClass(String styleClass) {
		this.styleClass = styleClass;
	}
	public String getAttributeSelector() {
		return attributeSelector;
	}
	public void setAttributeSelector(String attributeSelector) {
		this.attributeSelector = attributeSelector;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getXpath() {
		return xpath;
	}

	public void setXpath(String xpath) {
		this.xpath = xpath;
	}
	
	
	
}
