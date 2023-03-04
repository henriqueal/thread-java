package br.com.alura.threads.banheiro;

public class TarefaLimparBanheiro implements Runnable{
    Banheiro banheiro;

    public TarefaLimparBanheiro(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        while(true) {
            banheiro.limpaBanheiro();
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
