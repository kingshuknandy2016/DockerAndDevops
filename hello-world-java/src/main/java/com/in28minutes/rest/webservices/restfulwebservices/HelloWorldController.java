package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/")
	public String helloWorld() {

		return "{\"message\":\"Hello World Java v1\"}";
	}

	@GetMapping(path = "/get-tickets")
	public String getTicketsUrl(@RequestParam(name = "name",required = false,defaultValue = "NA")String name,@RequestParam(name = "age",required = false,defaultValue = "0000") String age) {
		int ageDerieved=Integer.parseInt(age);
		if (ageDerieved<=14){
			return "{\"name\":\""+name+"\",\"age\":\""+age+"\",\"message\":\"You are not eligible to buy tickets as you age is less than 15\"}\n";
		}else{
			return "{\"name\":\""+name+"\",\"age\":\""+age+"\",\"message\":\"You are eligible for buying tickets. Please find the url bellow\",\"URL\":\"https://in.bookmyshow.com/\"}";
		}

	}
}
