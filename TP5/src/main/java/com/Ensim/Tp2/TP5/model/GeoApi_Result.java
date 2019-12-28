package com.Ensim.Tp2.TP5.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)

public class GeoApi_Result {

	@JsonProperty("type")
	private String type;
	
	@JsonProperty("version")
	private String version;
	
	@JsonProperty("features")
	private List<Features> features = new ArrayList<Features>();
	
	@JsonProperty("attribution")
	private String attribution;
	
	@JsonProperty("licence")
	private String licence;
	
	@JsonProperty("query")
	private String query;
	
	@JsonProperty("limit")
	private float limit;

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<Features> getFeatures() {
		return features;
	}

	public void setFeatures(List<Features> features) {
		this.features = features;
	}

	public String getAttribution() {
		return attribution;
	}

	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public float getLimit() {
		return limit;
	}

	public void setLimit(float limit) {
		this.limit = limit;
	}
}
