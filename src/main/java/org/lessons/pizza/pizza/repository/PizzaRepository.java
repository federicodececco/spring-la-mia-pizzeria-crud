package org.lessons.pizza.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.lessons.pizza.pizza.model.*;

public interface PizzaRepository extends JpaRepository<Pizza,Integer>{

    
} 