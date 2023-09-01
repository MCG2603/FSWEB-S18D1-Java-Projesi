package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="burger",schema="spring")
public class Burger {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private int price;

    @Column(name="is_vegan")
    private boolean isVegan;


    @Column(name="bread_type")
    @Enumerated(EnumType.STRING)
    private BreadType breadType;

    @Column(name = "contents")
    private List<String> contents;

}
