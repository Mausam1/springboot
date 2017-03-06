package com.example.springbootweb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
	
    @Value("${home.title}")
    private String title;

	
	public String homeTitle(){
		return title;
	}
	
    @Value("${home.description}")
    private String description;

	
	public String homeDescription(){
		return description;
	}

}
