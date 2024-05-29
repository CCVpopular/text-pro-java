package com.hutech.bt2_t2.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRO")
    private int id;
    @ManyToOne
    @JoinColumn(name = "ID_CAT", referencedColumnName = "ID_CAT")
    private Category category;
    @Column(name = "NAME_PRO", nullable = false)
    private String name;
    @Column(name = "NUMS", nullable = false)
    private int nums;
    @Column(name = "PRICE", nullable = false)
    private double price;
    @Column(name = "DETAIL")
    private String detail;
    @Column(name = "IMG1")
    private String img1;
    @Column(name = "IMG2")
    private String img2;
    @Column(name = "IMG3")
    private String img3;
    @Column(name = "META")
    private String meta;
    @Column(name = "`ORDER`", nullable = false)
    private int order;
    @Column(name = "LINK")
    private String link;
    @Column(name = "HIDE", nullable = false)
    private boolean hide;
    @OneToMany(mappedBy = "product")
    private Set<CartDetail> cartDetails;
}
