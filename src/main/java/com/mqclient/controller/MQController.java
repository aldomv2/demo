package com.mqclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MQController {
	 
	@GetMapping("/send")
	public String send(){
		  
	  return   "OK SERVICIO DEMO";
	}

}
