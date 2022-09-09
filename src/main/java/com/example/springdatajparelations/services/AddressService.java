package com.example.springdatajparelations.services;

import com.example.springdatajparelations.models.Address;
import com.example.springdatajparelations.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddressService {

    @Autowired
    private AddressRepository addressRepository ;


    public Address addAddress(Address address){
         return addressRepository.save(address);
    }

    public List<Address> getAddress(){
        return addressRepository.findAll();
    }
}
