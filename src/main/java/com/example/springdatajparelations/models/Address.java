package com.example.springdatajparelations.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id_address")
    private Long id ;
    private  String street;
    private String city;
    @OneToOne(mappedBy = "address",cascade = CascadeType.ALL)
    private Person person;
}
