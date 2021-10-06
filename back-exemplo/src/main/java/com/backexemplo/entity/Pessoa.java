package com.backexemplo.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    private int id;

    @Column
    private String nome;

    @Column
    private String sobrenome;
}
