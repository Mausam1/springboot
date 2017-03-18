package com.example.springbootweb.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
	
	@ExceptionHandler
	public String handleExceptions(Exception exception, Model model){
		System.out.println("coming to the exceptions handler");
		model.addAttribute("exception",exception);
		return "error";
	}

}
