package com.cadastro.Model.Servicos;

import com.cadastro.Model.Entidades.Pet;

import java.util.Scanner;

public class Menu {

    public void exibirMenu() {
        System.out.printf("Escolha uma das opções abaixo: ");
        System.out.println("1- Cadastro de um novo pet ");
        System.out.println("2- Alterar os dados de um pet cadastrado ");
        System.out.println("3- Deletar um pet cadastrado ");
        System.out.println("4- Listar todos os pets cadastrados ");
        System.out.println("5- Listar pets por algum critério(idade, nome, raça) ");
        System.out.println("6- Sair ");
    }

    public void funcionalidadesDasOpcoes(){
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        switch(opcao){
            case 1:
                Pet novoPet = new Pet();
                ManipulacaoArquivos.readSpecifyLine(1);
                novoPet.setNome(teclado.nextLine());
                novoPet.setSobrenome(teclado.nextLine());
        }
    }
}
