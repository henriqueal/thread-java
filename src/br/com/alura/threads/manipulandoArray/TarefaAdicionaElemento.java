package br.com.alura.threads.manipulandoArray;

public class TarefaAdicionaElemento implements Runnable{
    Lista lista;

    public TarefaAdicionaElemento(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            lista.adicionaElemento(""+i);
        }
    }
}
