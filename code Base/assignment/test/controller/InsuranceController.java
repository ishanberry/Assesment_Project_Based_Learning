package com.assignment.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.test.dao.InsuranceRepository;
import com.assignment.test.entites.CompositeKey;
import com.assignment.test.entites.Insurance;

@RestController
//@RequestMapping(value = "/insurance",method = RequestMethod.GET)
public class InsuranceController {
	
	@Autowired
	private InsuranceRepository insuranceRepository;
	
	
	@GetMapping(value = "/test" )

	public String getdata() 
	{
		return "hello testing controller";
	}
	
	
	
	@GetMapping(value = "/alldata")
//	@RequestMapping(value = "/insurance/alldata",method = RequestMethod.GET)
	public List<Insurance> getAllInsurance()
	{
		
		return  insuranceRepository.findAll();
		
	}
	
//	@GetMapping(value = "alldata/{id}")
//	public 	Insurance getInsuranceById(@PathVariable CompositeKey id)
//	{
//		return insuranceRepository.findById(id).orElse(null);
//	}
//	
	
	
	
	@PostMapping(value = "/send")
	public Insurance createInsurance(@RequestBody Insurance insurance) 
	{
		return insuranceRepository.save(insurance);
		
	}
	
	
	
}
