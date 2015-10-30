package com.gophergroceries.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gophergroceries.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
