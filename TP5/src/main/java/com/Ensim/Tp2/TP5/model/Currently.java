package com.Ensim.Tp2.TP5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Currently {

	@JsonProperty("time")
	private long time;

	@JsonProperty("summary")
	private String summary;

	@JsonProperty("precipProbability")
	private float precipProbability;

	@JsonProperty("temperature")
	private float temperature;

	@JsonProperty("apparentTemperature")
	private float apparentTemperature;

	@JsonProperty("humidity")
	private float humidity;

	@JsonProperty("pressure")
	private float pressure;

	@JsonProperty("windSpeed")
	private float windSpeed;

	@JsonProperty("cloudCover")
	private float cloudCover;

	@JsonProperty("uvIndex")
	private float uvIndex;

	@JsonProperty("visibility")
	private float visibility;

	public double getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public float getPrecipProbability() {
		return precipProbability;
	}

	public void setPrecipProbability(float precipProbability) {
		this.precipProbability = precipProbability;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getApparentTemperature() {
		return apparentTemperature;
	}

	public void setApparentTemperature(float apparentTemperature) {
		this.apparentTemperature = apparentTemperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}

	public float getCloudCover() {
		return cloudCover;
	}

	public void setCloudCover(float cloudCover) {
		this.cloudCover = cloudCover;
	}

	public float getUvIndex() {
		return uvIndex;
	}

	public void setUvIndex(float uvIndex) {
		this.uvIndex = uvIndex;
	}

	public float getVisibility() {
		return visibility;
	}

	public void setVisibility(float visibility) {
		this.visibility = visibility;
	}
	
	
}
