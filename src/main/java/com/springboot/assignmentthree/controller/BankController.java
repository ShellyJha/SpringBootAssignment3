package com.springboot.assignmentthree.controller;

import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BankController {

	private final HealthEndpoint healthEndpoint;

	public BankController(HealthEndpoint healthEndpoint) {
		this.healthEndpoint = healthEndpoint;
	}

	@RequestMapping("/getBranches")
	public String getBankBranches() {
		return "Branches.html";
	}

	@RequestMapping("/getServices")
	public String getBankServices() {
		return "Services.html";
	}
	@GetMapping("/getBranches/health")
	   public String statusOfGetBranches() {
		   return "Status of Application : "+healthEndpoint.health().getStatus();
	   }
	   @GetMapping("/getServices/health")
	   public String statusOfGetServices() {
		   return "Status of Application  : "+healthEndpoint.health().getStatus();
	   }
}
