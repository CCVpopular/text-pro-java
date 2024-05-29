package com.hutech.bt2_t2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hutech.bt2_t2.model.CartDetail;
import com.hutech.bt2_t2.model.CartDetailId;

@Repository 
public interface OrderDetailRepository extends JpaRepository<CartDetail, CartDetailId> { 
} 
