package com.cadastro;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    private String nome;
    private String sobrenome;
    private String nomeCompleto;
    private int idade;
    private double peso;
    private String raca;
    private Endereco endereco;
}
