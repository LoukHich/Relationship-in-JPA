package com.example.springdatajparelations.repositories;

import com.example.springdatajparelations.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface AddressRepository  extends JpaRepository<Address,Long> {
}
