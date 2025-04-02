package com.cadastro.Model.Excecoes;

public class NomeSobrenomeInvalido extends Exception{

    public NomeSobrenomeInvalido() {
        System.out.println("É necessário inserir nome e sobrenome!!");
    }
}
