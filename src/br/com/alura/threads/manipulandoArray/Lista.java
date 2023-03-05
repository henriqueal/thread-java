
package br.com.alura.threads.manipulandoArray;

public class Lista {

    String[] lista = new String[1000];
    int index = 0;

    public synchronized void adicionaElemento(String elemento){
        lista[index] = elemento;
        index++;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(estaCheia()){
            System.out.println("A lista encheu, vou notificar");
            this.notify();
        }
    }

    public int tamanhoLista(){
        return lista.length;
    }

    public String getElemento(int i){
        return lista[i];
    }

    public boolean estaCheia(){
        return index >= lista.length;
    }




}