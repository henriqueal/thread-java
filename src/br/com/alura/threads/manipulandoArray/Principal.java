package br.com.alura.threads.manipulandoArray;

import java.util.List;
import java.util.Vector;

public class Principal {

    public static void main(String[] args) {
        Lista lista = new Lista();

        for(int i=0;i<10;i++){
            new Thread(new TarefaAdicionaElemento(lista,i)).start();
        }

        TarefaExibeLista tarefaExibeLista = new TarefaExibeLista(lista);
        Thread exibe = new Thread(tarefaExibeLista);
        exibe.start();


    }
}
