package com.avs.repositories;

import com.avs.domain.Customer;
import com.avs.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
