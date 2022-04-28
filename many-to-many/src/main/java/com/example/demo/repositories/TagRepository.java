package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Tags;

public interface TagRepository extends JpaRepository<Tags, Long> {

}
