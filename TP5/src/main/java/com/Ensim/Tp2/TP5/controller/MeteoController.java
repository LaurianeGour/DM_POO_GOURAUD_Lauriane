package com.Ensim.Tp2.TP5.controller;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.Date;

import org.h2.util.IOUtils;
import org.h2.util.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.Ensim.Tp2.TP5.model.Adress;
import com.Ensim.Tp2.TP5.model.DarkSky_Result;
import com.Ensim.Tp2.TP5.model.GeoApi_Result;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class MeteoController {
	public final static String KEY = "0badb24d2e9f4dfbcf71970b201abed3";

	@PostMapping("/meteo")
	public String showMeteo(@RequestBody String newAdresse, Model model) throws IOException {
		int indiceDebut = newAdresse.indexOf("=");
		int indice = newAdresse.lastIndexOf("+");
		String adresse = newAdresse.substring(indiceDebut + 1, indice);
		String codePostal = newAdresse.substring(indice + 1);

		String requeteAdresse = "https://api-adresse.data.gouv.fr/search/?q=" + adresse + "&postcode=" + codePostal;
		URL url = new URL(requeteAdresse);
		GeoApi_Result resultatAdr = new ObjectMapper().readValue(url, GeoApi_Result.class);

		double latitude = resultatAdr.getFeatures().get(0).getGeometryObject().getCoordinates().get(0);
		double longitude = resultatAdr.getFeatures().get(0).getGeometryObject().getCoordinates().get(1);

		String requeteMeteo = "https://api.darksky.net/forecast/" + KEY + "/" + latitude + "," + longitude;
		URL url2 = new URL(requeteMeteo);
		DarkSky_Result resultatMeteo = new ObjectMapper().readValue(url2, DarkSky_Result.class);
		
		/*
		//Pour visualiser les valeurs en mode debug
		Date time = new Date((long) resultatMeteo.getCurrentlyObject().getTime());
		String summary = resultatMeteo.getCurrentlyObject().getSummary();
		float precipProbability = resultatMeteo.getCurrentlyObject().getPrecipProbability();
		float temperature = resultatMeteo.getCurrentlyObject().getTemperature();
		float apparentTemperature = resultatMeteo.getCurrentlyObject().getApparentTemperature();
	 	float humidity = resultatMeteo.getCurrentlyObject().getHumidity();
	 	float pressure = resultatMeteo.getCurrentlyObject().getPressure();
		float windSpeed = resultatMeteo.getCurrentlyObject().getWindSpeed();
		float cloudCover = resultatMeteo.getCurrentlyObject().getCloudCover();
	 	float uvIndex = resultatMeteo.getCurrentlyObject().getUvIndex();
	 	float visibility = resultatMeteo.getCurrentlyObject().getVisibility();
		 */
	 	model.addAttribute("MeteoNow", resultatMeteo);
	 	
/*
		//Pour visualiser les valeurs en mode debug
		String summary = resultatMeteo.getDailyObject().getDataObject().get(0).getSummary();
		float precipProbability = resultatMeteo.getDailyObject().getDataObject().get(0).getPrecipProbability();
		float temperatureHigh = resultatMeteo.getDailyObject().getDataObject().get(0).getTemperatureHigh();
		float temperatureLow = resultatMeteo.getDailyObject().getDataObject().get(0).getTemperatureLow();
	 	float humidity = resultatMeteo.getDailyObject().getDataObject().get(0).getHumidity();
	 	float pressure = resultatMeteo.getDailyObject().getDataObject().get(0).getPressure();
		float windSpeed = resultatMeteo.getDailyObject().getDataObject().get(0).getWindSpeed();
		float cloudCover = resultatMeteo.getDailyObject().getDataObject().get(0).getCloudCover();
	 	float uvIndex = resultatMeteo.getDailyObject().getDataObject().get(0).getUvIndex();
*/
	 	model.addAttribute("MeteoDuJour",  resultatMeteo.getDailyObject().getDataObject().get(0));
	 	
	 	
	 	model.addAttribute("AdresseMeteo", resultatAdr.getFeatures().get(0).getPropertiesObject().getLabel());
	 	
		return "meteo";
	}
}