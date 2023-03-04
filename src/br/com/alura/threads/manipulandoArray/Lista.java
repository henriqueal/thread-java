package br.com.alura.threads.manipulandoArray;

import java.util.List;

public class Lista {

    String[] lista = new String[1000];
    int index = 0;

    public  void adicionaElemento(String elemento){
        lista[index] = elemento;
        index++;
    }
}
