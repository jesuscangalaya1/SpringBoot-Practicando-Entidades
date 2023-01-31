package com.example.PracitcaDeEntidades.entity_03;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carrera")
    @JsonManagedReference
    private List<Asignatura> asignaturas;

    @OneToMany(cascade = CascadeType.ALL, mappedBy ="carrera")
    @JsonManagedReference
    private List<Profesor> profesores;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carrera")
    @JsonManagedReference
    private List<Estudiante> estudiante;
}
