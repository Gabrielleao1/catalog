package com.ecomerce.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerce.dscatalog.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,	Long>{

}
