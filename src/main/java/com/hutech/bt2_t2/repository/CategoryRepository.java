package com.hutech.bt2_t2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hutech.bt2_t2.model.Category;

@Repository 
public interface CategoryRepository extends JpaRepository<Category, Integer> { 
} 
