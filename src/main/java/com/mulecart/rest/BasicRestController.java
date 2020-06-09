package com.mulecart.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class BasicRestController {
	
	@Value("${app.env}")
	private String env;
	
	@GetMapping(value="/env")
	public String getEnv()
	{
		return env;
	}

}
