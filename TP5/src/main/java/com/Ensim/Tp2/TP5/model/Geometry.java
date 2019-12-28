package com.Ensim.Tp2.TP5.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geometry {
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("coordinates")
	List<Double> coordinates = new ArrayList<Double>();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Double> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<Double> coordinates) {
		this.coordinates = coordinates;
	}

}
