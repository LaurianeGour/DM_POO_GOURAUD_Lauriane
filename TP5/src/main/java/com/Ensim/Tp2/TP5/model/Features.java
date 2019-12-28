package com.Ensim.Tp2.TP5.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Features {
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("geometry")
	Geometry GeometryObject;
	
	@JsonProperty("properties")
	Properties PropertiesObject;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Geometry getGeometryObject() {
		return GeometryObject;
	}

	public void setGeometryObject(Geometry geometryObject) {
		GeometryObject = geometryObject;
	}

	public Properties getPropertiesObject() {
		return PropertiesObject;
	}

	public void setPropertiesObject(Properties propertiesObject) {
		PropertiesObject = propertiesObject;
	}

}
