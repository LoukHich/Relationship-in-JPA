package com.example.springdatajparelations.repositories;

import com.example.springdatajparelations.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
