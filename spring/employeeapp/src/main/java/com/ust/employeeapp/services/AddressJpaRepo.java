package com.ust.employeeapp.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.employeeapp.entities.Address;

public interface AddressJpaRepo extends JpaRepository<Address, Integer> {

}
