package com.avs.repositories;

import com.avs.domain.Customer;
import com.avs.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
