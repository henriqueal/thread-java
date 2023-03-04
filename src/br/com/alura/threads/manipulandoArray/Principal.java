package br.com.alura.threads.manipulandoArray;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        for(int i=0;i<10;i++){
            new Thread(new TarefaAdicionaElemento(lista,i)).start();
        }

        for(int i=0;i<lista.size();i++){
            System.out.println("lista[" + i + "] = " + lista.get(i));
        }
//      output:
//        lista[992] = Thread 9 - 96
//        lista[993] = Thread 9 - 97
//        lista[994] = Thread 9 - 98
//        lista[995] = Thread 9 - 99
//        deveria ir até o index 999, mas arrayList não é thread-safe
    }
}
