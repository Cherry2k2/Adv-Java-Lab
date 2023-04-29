package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ServiceController{

	@RequestMapping("/resource")
	public double[] service(){
		   Service service = new Service();
	       String arr = "Sairam";
	
			return (service.conv_to_ascii(arr));
	}
}
