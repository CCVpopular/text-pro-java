package com.hutech.bt2_t2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hutech.bt2_t2.model.Blog;

@Repository 
public interface BlogRepository extends JpaRepository<Blog, Integer> { 
} 