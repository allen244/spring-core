package com.avs.repositories;

import com.avs.domain.Customer;
import com.avs.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
