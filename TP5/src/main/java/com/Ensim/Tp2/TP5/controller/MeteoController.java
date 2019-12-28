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
		DarkSky_Result resulatMeteo = new ObjectMapper().readValue(url2, DarkSky_Result.class);
		
		
		//Pour visualiser les valeurs en mode debug
		Date time = new Date((long) resulatMeteo.getCurrentlyObject().getTime());
		String summary = resulatMeteo.getCurrentlyObject().getSummary();
		float precipProbability = resulatMeteo.getCurrentlyObject().getPrecipProbability();
		float temperature = resulatMeteo.getCurrentlyObject().getTemperature();
		float apparentTemperature = resulatMeteo.getCurrentlyObject().getApparentTemperature();
	 	float humidity = resulatMeteo.getCurrentlyObject().getHumidity();
	 	float pressure = resulatMeteo.getCurrentlyObject().getPressure();
		float windSpeed = resulatMeteo.getCurrentlyObject().getWindSpeed();
		float cloudCover = resulatMeteo.getCurrentlyObject().getCloudCover();
	 	float uvIndex = resulatMeteo.getCurrentlyObject().getUvIndex();
	 	float visibility = resulatMeteo.getCurrentlyObject().getVisibility();

	 		
		return "meteo";
	}
}