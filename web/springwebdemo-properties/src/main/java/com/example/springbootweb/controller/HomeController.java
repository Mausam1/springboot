package com.example.springbootweb.controller;

import com.example.springbootweb.service.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("/title")
	public String homeTitle(){
		return homeService.homeTitle();
	} 
	
	@RequestMapping("/description")
	public String homeDescription(){
		return homeService.homeDescription();
	} 
}
