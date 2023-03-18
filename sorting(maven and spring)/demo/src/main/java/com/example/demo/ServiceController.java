package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mycompany.app.Sorter;
import com.mycompany.app.Bubble;

@RestController
public class ServiceController{

	@RequestMapping("/resource")
	public double[] service(){
		   Sorter sorter = new Sorter();
	       double temp[] = {15, 13, 52, 1, 24};
	
			return (sorter.Sort(temp, new Bubble()));
	}
}
