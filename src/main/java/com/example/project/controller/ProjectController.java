package com.example.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@GetMapping("/healthCheck")
	public String func() {
		return "I am Alive";
	}

	@GetMapping("/add/{val1}")
	public String cal(@PathVariable("val1") String val1) {
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(val1);
		for (int i = 1; i <= 10; i++) {
			sb.append(num).append(" x ").append(i).append(" = ").append(i * num).append("  ");
		}
		return sb.toString();
	}

}
