package com.cadastro.Model.Entidades;

import com.cadastro.Model.Sexo;
import com.cadastro.Model.TipoAnimal;
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
    private Sexo sexoPet;
    private TipoAnimal tipoPet;
}
