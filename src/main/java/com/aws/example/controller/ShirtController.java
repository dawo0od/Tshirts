package com.aws.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.example.dao.ShirtDao;
import com.aws.example.model.Shirt;

@RestController
public class ShirtController {

	@Autowired
	private ShirtDao dao;
	
	@PostMapping("/addShirt")
	public String saveShirt(@RequestBody Shirt shirt) {
		dao.save(shirt);
		return "success";
	}
	
	@GetMapping("/shirts")
	public List<Shirt> getAllShirts() {
		return (List<Shirt>) dao.findAll();
	}
}
