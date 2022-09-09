package com.example.springdatajparelations;

import com.example.springdatajparelations.models.Address;
import com.example.springdatajparelations.models.Person;
import com.example.springdatajparelations.repositories.AddressRepository;
import com.example.springdatajparelations.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class SpringDataJpaRelationsApplication {
     @Autowired
    AddressRepository addressRepository;
     @Autowired
     PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaRelationsApplication.class, args);
    }
    @Transactional
    @Bean
    public CommandLineRunner commandLineRunner(){

        return args -> {
            System.out.println("Bonjour HICHAM LOUKILI  ");
            Address address = new Address();
            address.setCity("Nador");
            address.setStreet("JAADAR");
            Person person = new Person();
            person.setUsername("Hicham Loukili");
            address.setPerson(person);
           // personRepository.save(person);
            addressRepository.save(address);
        };
    }


}
