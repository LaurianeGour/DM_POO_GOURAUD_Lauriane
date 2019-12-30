package com.Ensim.Tp2.TP5.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Daily {
	@JsonProperty("summary")
	private String summary;

	@JsonProperty("data")
	private List<Data> dataObject = new ArrayList<Data>();

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public List<Data> getDataObject() {
		return dataObject;
	}

	public void setDataObject(List<Data> dataObject) {
		this.dataObject = dataObject;
	}

	
	
}
