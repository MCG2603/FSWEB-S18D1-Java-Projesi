package com.example.demo.dao;

import com.example.demo.entity.BreadType;
import com.example.demo.entity.Burger;

import java.util.List;

public interface BurgerDao {
    Burger save(Burger burger);
    Burger findById(int id);
    List<Burger>findAll();
    List<Burger>findByPrice(double price);
    List<Burger>findBreadType(BreadType breadType);
    List<Burger>findByContent(String content);
    Burger update(Burger burger);
    Burger delete(Burger burger);

}
