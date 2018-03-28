package com.example.javaweb.controller;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	static final String URL_EMPLOYEES = "http://localhost:9090/user/gallery";
	static final String das_EMPLOYEES = "http://localhost:9090/user/dashboard";
	

	@RequestMapping(value="/dashboard",method = RequestMethod.GET)
    public ModelAndView dashboardpage(){
		
	       // HttpHeaders
        HttpHeaders headers = new HttpHeaders();
 
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("my_other_key", "my_other_value");
 
        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<String>(headers);
 
        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();
 
        // Send request with GET method, and Headers.
        ResponseEntity<String> response = restTemplate.exchange(das_EMPLOYEES, //
                HttpMethod.GET, entity, String.class);
 
        String result = response.getBody();
 
        System.out.println(result);
        
		ModelAndView mv= new ModelAndView();
		mv.addObject("dynamicJson", result);
		mv.setViewName("dashboard");
		return mv;
    }

	
	@RequestMapping(value="/gallery",method = RequestMethod.GET)
    public ModelAndView gallerypage(){
		
	       // HttpHeaders
        HttpHeaders headers = new HttpHeaders();
 
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        // Request to return JSON format
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("my_other_key", "my_other_value");
 
        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<String>(headers);
 
        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();
 
        // Send request with GET method, and Headers.
        ResponseEntity<String> response = restTemplate.exchange(URL_EMPLOYEES, //
                HttpMethod.GET, entity, String.class);
 
        String result = response.getBody();
 
        System.out.println(result);
        
		ModelAndView mv= new ModelAndView();
		mv.addObject("dynamicJson", result);
		mv.setViewName("gallery");
		return mv;
    }
	
}
