package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Posts;

public interface PostRespository extends JpaRepository<Posts, Long>{

}
