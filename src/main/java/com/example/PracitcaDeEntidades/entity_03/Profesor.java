package com.example.PracitcaDeEntidades.entity_03;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Getter
@Setter
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private LocalDateTime fechaNacimiento;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "profesor")
    @JsonManagedReference
    private List<Asignatura> asignaturas;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonBackReference
    @JoinColumn(name = "carrera_id", nullable = false)
    private Carrera carrera;
}
