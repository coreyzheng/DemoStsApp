package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

class Greeting {
	String greeting;
	Greeting(String g) {
		greeting = g;
	}
	public String getGreeting() {
		return greeting;
	}
}

@Configuration
@ComponentScan
@EnableAutoConfiguration

@Controller
public class HelloController {
    @RequestMapping(value="/",produces = "application/json")
    @ResponseBody
    Object home() {
        return new Greeting("Hello World!");
    }
}

@Entity
class Booking {
}



