package com.mbfs.devops.springboot.fetchdataexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbfs.devops.springboot.fetchdataexample.model.Employee;
import com.mbfs.devops.springboot.fetchdataexample.service.FetchDataService;

@RestController
public class FetchDataController {
	
	@Autowired
	FetchDataService fetchDataService;
	
	
	@GetMapping(path = "getdata")
	List<Employee> getUsers() {
		
		return fetchDataService.findAll();	
	}
	

}
