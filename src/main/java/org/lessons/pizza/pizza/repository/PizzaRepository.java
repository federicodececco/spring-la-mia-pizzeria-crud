package org.lessons.pizza.pizza.repository;

import java.util.List;

import org.lessons.pizza.pizza.model.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PizzaRepository extends JpaRepository<Pizza,Integer>{
     public List<Pizza> findByNameContaining(String name);
    
} 