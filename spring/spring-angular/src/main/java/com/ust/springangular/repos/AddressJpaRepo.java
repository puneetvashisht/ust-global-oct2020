package com.ust.springangular.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.springangular.entities.Address;

public interface AddressJpaRepo extends JpaRepository<Address, Integer> {

}
