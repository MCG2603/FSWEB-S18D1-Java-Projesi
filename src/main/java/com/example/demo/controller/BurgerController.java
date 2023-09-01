package com.example.demo.controller;

import com.example.demo.dao.BurgerDao;
import com.example.demo.entity.Burger;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class BurgerController {
    private BurgerDao burgerDao;
    @Autowired
    public BurgerController(BurgerDao burgerDao){

        this.burgerDao=burgerDao;
    }
    @Transactional
    @PostMapping("/")
    public Burger save(@RequestBody Burger burger){
        return burgerDao.save(burger);
    }
    @GetMapping("/")
    public List<Burger> findAll(){
        return burgerDao.findAll();
    }
    @GetMapping("/{id}")
    public Burger find(@PathVariable int id){
        return burgerDao.findById(id);
    }

}
