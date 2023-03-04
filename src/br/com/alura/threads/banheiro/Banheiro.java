package br.com.alura.threads.banheiro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banheiro {

    //private Lock lock = new ReentrantLock();
    // podemos utilizar essa classe ReentrantLock para fazermos o lock manual. Porém temos a desvantagem
    // de ter que lembrar de dar o unlock no final.

    public void fazNumero1(){

        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Batendo na porta");
        //lock.lock();
        synchronized (this){
            System.out.println(nome + " Entrando no banheiro");
            System.out.println(nome + " Fazendo coisa rápida");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nome + " Dando descarga");
            System.out.println(nome + " Lavando a mão");
            System.out.println(nome + " Saindo do banheiro");

        }
        //lock.unlock();
    }

    public void fazNumero2(){
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Batendo na porta");
        synchronized (this){
            System.out.println(nome + " Entrando no banheiro");
            System.out.println(nome + " Fazendo coisa demorada");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nome + " Dando descarga");
            System.out.println(nome + " Lavando a mão");
            System.out.println(nome + " Saindo do banheiro");
        }
    }

}
