package br.com.alura.threads.buscaTextual;

public class Principal {

    public static void main(String[] args) {

        String substringToSearch = "da";

        TarefaLerArquivo arquivo1 = new TarefaLerArquivo("resources/assinaturas1.txt", substringToSearch);
        TarefaLerArquivo arquivo2 = new TarefaLerArquivo("resources/assinaturas2.txt", substringToSearch);
        TarefaLerArquivo autores = new TarefaLerArquivo("resources/autores.txt", substringToSearch);

        Thread t1 = new Thread(arquivo1);
        Thread t2 = new Thread(arquivo2);
        Thread t3 = new Thread(autores);

        t1.start();
        t2.start();
        t3.start();

    }
}
