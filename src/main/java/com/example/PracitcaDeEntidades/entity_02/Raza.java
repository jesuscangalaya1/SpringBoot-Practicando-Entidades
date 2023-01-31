package com.example.PracitcaDeEntidades.entity_02;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Raza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String color;

    private float precio;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "raza")
    @JsonManagedReference
    private List<Animal> animales;
}
