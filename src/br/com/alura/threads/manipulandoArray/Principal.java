package br.com.alura.threads.manipulandoArray;

import br.com.alura.threads.banheiro.TarefaNumero2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Lista lista = new Lista();

        for(int i=0;i<100;i++){
            new Thread(new TarefaAdicionaElemento(lista)).start();
        }

        for(int i=0;i<1000;i++){
            System.out.println("lista[" + i + "] = " + lista.lista[i]);
        }

    }
}
