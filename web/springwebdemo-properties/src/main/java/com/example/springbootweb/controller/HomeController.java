package com.example.springbootweb.controller;

import com.example.springbootweb.service.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping({"","/"})  
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@RequestMapping({"/*"})
	public String errorHandle() throws Exception{
		throw new Exception("we could not find the page.");
	}
	
	@RequestMapping("home/title")
	public String homeTitle(){
		return homeService.homeTitle();
	} 
	
	@RequestMapping("home/description")
	public String homeDescription(){
		return homeService.homeDescription();
	} 
}
