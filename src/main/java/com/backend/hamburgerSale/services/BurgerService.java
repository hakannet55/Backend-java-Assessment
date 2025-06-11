package com.backend.hamburgerSale.services;

import com.backend.hamburgerSale.repository.BurgerRepository;
import com.backend.hamburgerSale.repository.JsonReader;
import com.backend.hamburgerSale.types.Burger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class BurgerService {
    @Autowired
    private BurgerRepository burgerRepository;

    private JsonReader jsonReader = new JsonReader();

    public Burger addBurger(Burger burger) {
        return burgerRepository.save(burger);
    }

    public List<Burger> getAllBurgers() throws IOException {
        //return burgerRepository.findAll();
        return jsonReader.readBurgersFromFile();
    }

    // getBurgerById
    public Burger getBurgerById(Long id) throws IOException {
        List<Burger> burgers = this.getAllBurgers();
        // return burgerRepository.findById(id).orElse(null);
        for (Burger burger : burgers) {
            if (burger.getId().toString().equals(id.toString())) {
                return burger;
            }
        }
        return null;
    }

    // createBurger
    public Burger createBurger(Burger burger) {
        return burgerRepository.save(burger);
    }
}

