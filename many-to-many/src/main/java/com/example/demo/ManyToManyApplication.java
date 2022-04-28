package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repositories.PostRespository;
import com.example.demo.repositories.TagRepository;

@SpringBootApplication
public class ManyToManyApplication{
	
	@Autowired
	PostRespository postRespository;
	@Autowired
	TagRepository tagRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

}
