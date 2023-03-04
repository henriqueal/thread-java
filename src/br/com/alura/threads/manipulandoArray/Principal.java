package br.com.alura.threads.manipulandoArray;

import java.util.List;
import java.util.Vector;

public class Principal {

    public static void main(String[] args) {
        List<String> lista = new Vector<>();

        for(int i=0;i<10;i++){
            new Thread(new TarefaAdicionaElemento(lista,i)).start();
        }

        for(int i=0;i<lista.size();i++){
            System.out.println("lista[" + i + "] = " + lista.get(i));
        }
    }
}
