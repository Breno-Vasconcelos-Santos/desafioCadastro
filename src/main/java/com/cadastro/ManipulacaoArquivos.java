package com.cadastro;

import java.io.*;

public class ManipulacaoArquivos {

    public static void readFile(){
        try(FileReader fr = new FileReader("formulario.txt");
            BufferedReader br = new BufferedReader(fr)) {

            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}