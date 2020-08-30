package com.waterco.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	@RequestMapping("hellojenkins")
	public String hello() {
		return "Hello from Jenkins Controller class";
	}
}
