package br.com.alura.threads.banheiro;

public class TarefaNumero2 implements Runnable{
    Banheiro banheiro;

    public TarefaNumero2(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        banheiro.fazNumero2();
    }
}
