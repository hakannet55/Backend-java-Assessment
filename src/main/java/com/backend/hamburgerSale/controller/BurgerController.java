package com.backend.hamburgerSale.controller;

import com.backend.hamburgerSale.services.BurgerService;
import com.backend.hamburgerSale.types.Burger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/burgers")
public class BurgerController {

    @Autowired
    private BurgerService burgerService;

    @GetMapping("/all")
    public List<Burger> getAllBurgers() {
        try {
            return burgerService.getAllBurgers();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // getByid
    @GetMapping("/{id}")
    public Burger getBurgerById(@PathVariable Long id) throws IOException {
        return burgerService.getBurgerById(id);
    }

    // create
    @PostMapping
    public Burger createBurger(@RequestBody Burger burger) {
        return burgerService.createBurger(burger);
    }

    // update
    // delete
    // search
    // sort
    // filter
    // pagination
    // caching
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

}
