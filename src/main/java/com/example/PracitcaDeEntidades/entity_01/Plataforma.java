package com.example.PracitcaDeEntidades.entity_01;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Plataforma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String plataforma;

    @OneToMany(cascade= CascadeType.ALL, mappedBy = "plataforma")
    @JsonManagedReference
    private Set<Periferico> periferico;

}
