package br.com.alura.threads.banheiro;

import br.com.alura.threads.impressaoNumeros.TarefaImprimirNumeros;

public class Principal {

    public static void main(String[] args) {
        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "Joao");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
        Thread servicoLimpeza = new Thread(new TarefaLimparBanheiro(banheiro), "Faxina");
        servicoLimpeza.setDaemon(true); //se todas as threads principais tiverem morrido, então ela tbm morre.
        servicoLimpeza.setPriority(Thread.MAX_PRIORITY);


        convidado1.start();
        convidado2.start();
        servicoLimpeza.start();
        
    }
}
