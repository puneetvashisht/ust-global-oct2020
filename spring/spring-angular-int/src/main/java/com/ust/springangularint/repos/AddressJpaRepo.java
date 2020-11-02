package com.ust.springangularint.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.springangularint.entities.Address;


public interface AddressJpaRepo extends JpaRepository<Address, Integer> {

}
