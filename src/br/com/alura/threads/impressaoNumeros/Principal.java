package br.com.alura.threads.impressaoNumeros;

import br.com.alura.threads.buscaTextual.TarefaLerArquivo;

public class Principal {

    public static void main(String[] args) {

        TarefaImprimirNumeros tarefa = new TarefaImprimirNumeros();


        Thread t1 = new Thread(tarefa, "t1");
        Thread t2 = new Thread(tarefa, "t2");

        t1.start();
        t2.start();

    }
}
