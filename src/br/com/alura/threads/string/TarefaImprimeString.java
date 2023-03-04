package br.com.alura.threads.string;

public class TarefaImprimeString extends Thread{

    String myString;

    public TarefaImprimeString(String myString) {
        this.myString = myString;
    }

    @Override
    public void run() {
        System.out.println(myString);
    }
}
