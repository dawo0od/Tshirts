package com.aws.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.aws.example.model.Shirt;

public interface ShirtDao extends CrudRepository<Shirt, Integer>{

}
