package com.backend.hamburgerSale.repository;

import com.backend.hamburgerSale.types.Burger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BurgerRepository extends JpaRepository<Burger, Long> {
}
