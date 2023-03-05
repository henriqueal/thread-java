package br.com.alura.threads.manipulandoArray;

import java.util.List;

public class TarefaExibeLista implements Runnable{
    private Lista lista;

    public TarefaExibeLista(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {

        synchronized (lista) {
            if (!lista.estaCheia()) {
                System.out.println("Lista não está cheia, vou aguardar");
                try {
                    lista.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < lista.tamanhoLista(); i++) {
                System.out.println("lista[" + i + "] = " + lista.getElemento(i));
            }
        }
    }
}
