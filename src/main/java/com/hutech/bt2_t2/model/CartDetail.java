package com.hutech.bt2_t2.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@Table(name = "Cart_Detail")
public class CartDetail {
    @EmbeddedId
    private CartDetailId id; 
    @ManyToOne
    @MapsId("cartId") 
    @JoinColumn(name = "ID_CART") 
    private Cart cart; 
    @ManyToOne
    @MapsId("productId") 
    @JoinColumn(name = "ID_PRO") 
    private Product product; 
    @Column(name = "SOLD_NUM", nullable = false) 
    private int soldNum; 
    @Column(name = "META") 
    private String meta; 
    @Column(name = "`ORDER`", nullable = false) 
    private int order; 
    @Column(name = "LINK") 
    private String link; 
    @Column(name = "HIDE", nullable = false) 
    private boolean hide; 
   } 