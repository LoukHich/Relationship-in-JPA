package com.example.springdatajparelations.services;

import com.example.springdatajparelations.models.Person;
import com.example.springdatajparelations.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class personService {

    @Autowired
    private PersonRepository personRepository ;



    public Person addPerson(Person person){
        return  personRepository.save(person);
    }

    public List<Person> getPersons(){
        return  personRepository.findAll();
    }

}
