package com.newSpring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newSpring.entity.Faculty;
import com.newSpring.service.Services;

@RestController
public class FacultySubController {

	@Autowired
     Services service;
	
	@GetMapping("/")
	public String Test()
	{
		return "test";
	}
	@GetMapping("/subject")
	public ArrayList<String> getAllSubNames()
	{
		return service.getAllSubNames();
	}
	
	@GetMapping("/facultyWithSub")
	public ArrayList<String> getallfacNm()
	{
		return service.getSubAsPerFacNm();
	}
	
	
}
