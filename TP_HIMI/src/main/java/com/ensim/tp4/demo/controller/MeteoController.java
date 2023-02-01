package com.ensim.tp4.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.client.RestTemplate;
import com.ensim.tp4.demo.model.ResponseGPS;
import com.ensim.tp4.demo.model.ResponseMeteo;
import com.ensim.tp4.demo.repository.AddressRepository;

@Controller
public class MeteoController {
	@Autowired
	RestTemplate restTemplate ;
	@Autowired
	AddressRepository addressRepository;



	@PostMapping("/meteo")
	public String getMeteo(@RequestParam("address") String address, Model model) {
		
		String url1 = "https://api-adresse.data.gouv.fr/search/?q=" + address;
		ResponseEntity<ResponseGPS> response = restTemplate.exchange(url1, HttpMethod.GET, null,
				ResponseGPS.class);
		ResponseGPS Response = response.getBody();
		List<Double> coords = ( Response.getFeatures()).get(0).getGeometry().getCoordinates();
		double longitude = coords.get(0);
		double latitude = coords.get(1);
		
		String url = "https://api.meteo-concept.com/api/forecast/daily?token=7ad49f5f7109e5a50e90475585a1a2b6b39ae3d9237e4c1a3ff5e913e5064618"+"&latlng="+latitude+","+longitude;
    	System.out.println(url);
		ResponseEntity<ResponseMeteo> response2 = restTemplate.exchange(url, HttpMethod.GET, null,
    			ResponseMeteo.class);
    	
    	ResponseMeteo meteoResponse = response2.getBody();
		int meteo =meteoResponse.getForecast().get(0).getWeather();
		
		model.addAttribute("meteo", meteo);
		model.addAttribute("longitude", longitude);
		model.addAttribute("latitude", latitude);
		
		return "meteo";
	}
	
	
	
	@GetMapping(value = "/meteo")
	public String showMeteoPage(ModelMap model) {

		return "ajouteraddresse";
	}


	
}
