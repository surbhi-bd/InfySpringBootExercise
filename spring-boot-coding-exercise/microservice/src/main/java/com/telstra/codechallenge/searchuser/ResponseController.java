package com.telstra.codechallenge.searchuser;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ResponseController {
	
	@Autowired
	private ResponseService service;
	
	@RequestMapping(path = "/users", method = RequestMethod.GET)
	public List<User> getUser(@RequestParam(value = "numberOfAccount", defaultValue = "1") int numberOfAccount) {
			    return service.getUser(numberOfAccount);
		
	}
	
	
	

}
