package com.Ensim.Tp2.TP5.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	@JsonProperty("summary")
	private String summary;
	
	@JsonProperty("precipProbability")
	private float precipProbability;

	@JsonProperty("temperatureHigh")
	private float temperatureHigh;

	@JsonProperty("temperatureLow")
	private float temperatureLow;

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

	public float getTemperatureHigh() {
		return temperatureHigh;
	}

	public void setTemperatureHigh(float temperatureHigh) {
		this.temperatureHigh = temperatureHigh;
	}

	public float getTemperatureLow() {
		return temperatureLow;
	}

	public void setTemperatureLow(float temperatureLow) {
		this.temperatureLow = temperatureLow;
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

}
