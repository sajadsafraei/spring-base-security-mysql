package com.sajad.security.Dao;

import com.sajad.security.domain.security.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
