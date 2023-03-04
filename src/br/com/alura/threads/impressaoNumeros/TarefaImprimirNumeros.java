package br.com.alura.threads.impressaoNumeros;

public class TarefaImprimirNumeros implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            System.out.println("Thread["+ Thread.currentThread().getName() + "] = " + i);
        }
    }
}
