package br.com.alura.threads.string;

public class RespostaMain {

    public static void main(String[] args) {
        Runnable imprimeString = new TarefaImprimeString("Teste");
        Thread thread = new Thread(imprimeString, "ImprimeString");
        thread.start();
    }
}
