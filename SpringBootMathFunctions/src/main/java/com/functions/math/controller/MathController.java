package com.functions.math.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class MathController {
	
	@GetMapping
	public int addition(@RequestParam(value="a") int a, @RequestParam(value="b") int b) {
		return a+b;
	}
}
