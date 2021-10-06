package com.backexemplo.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;

    @Column
    private String sobrenome;
}
