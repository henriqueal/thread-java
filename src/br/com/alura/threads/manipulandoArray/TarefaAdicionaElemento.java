package br.com.alura.threads.manipulandoArray;

import java.util.List;

public class TarefaAdicionaElemento implements Runnable{
    private Lista lista;
    private int numeroDoThread;

    public TarefaAdicionaElemento(Lista lista, int numeroDoThread) {
        this.lista = lista;
        this.numeroDoThread = numeroDoThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            lista.adicionaElemento("Thread " + numeroDoThread + " - " + i);
        }
    }
}
