package com.cadastro.Model.Servicos;

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

    public static void readSpecifyLine(int linhaDesejada){
        try(FileReader fr = new FileReader("formulario.txt");
            BufferedReader br = new BufferedReader(fr)) {

            for (int i=1; i<linhaDesejada; i++){
                br.readLine();
            }
            String linha = br.readLine();
            System.out.println(linha);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}