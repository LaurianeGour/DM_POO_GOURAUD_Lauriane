package com.Ensim.Tp2.TP5.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DarkSky_Result {

	@JsonProperty("latitude")
	private float latitude;

	@JsonProperty("longitude")
	private float longitude;

	@JsonProperty("currently")
	Currently CurrentlyObject;

	@JsonProperty("daily")
	Daily DailyObject;
	
	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public Currently getCurrentlyObject() {
		return CurrentlyObject;
	}

	public void setCurrentlyObject(Currently currentlyObject) {
		CurrentlyObject = currentlyObject;
	}

	public Daily getDailyObject() {
		return DailyObject;
	}

	public void setDailyObject(Daily dailyObject) {
		DailyObject = dailyObject;
	}

	
}
