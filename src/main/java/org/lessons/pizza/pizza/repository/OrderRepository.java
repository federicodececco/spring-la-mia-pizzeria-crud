package org.lessons.pizza.pizza.repository;

import org.lessons.pizza.pizza.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
