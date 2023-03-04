package br.com.alura.threads.banheiro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banheiro {

    boolean ehSujo = true;

    public void fazNumero1(){

        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Batendo na porta");

        synchronized (this){
            System.out.println(nome + " Entrando no banheiro");

            while(ehSujo){
                esperaLaFora(nome);
            }

            System.out.println(nome + " Fazendo coisa rápida");
            dormirUmPouco(5000);
            this.ehSujo = true;
            System.out.println(nome + " Dando descarga");
            System.out.println(nome + " Lavando a mão");
            System.out.println(nome + " Saindo do banheiro");
        }
    }

    private void dormirUmPouco(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void esperaLaFora(String nome) {
        System.out.println(nome + ": eca, o banheiro está uma sujeira");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fazNumero2(){
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " Batendo na porta");
        synchronized (this){
            System.out.println(nome + " Entrando no banheiro");
            while(ehSujo){
                esperaLaFora(nome);
            }
            System.out.println(nome + " Fazendo coisa demorada");
            dormirUmPouco(7000);
            this.ehSujo = true;
            System.out.println(nome + " Dando descarga");
            System.out.println(nome + " Lavando a mão");
            System.out.println(nome + " Saindo do banheiro");

        }
    }

    public  void limpaBanheiro(){
        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        synchronized (this) {

            System.out.println(nome + " entrando no banheiro");

            if (!this.ehSujo) {
                System.out.println(nome + ", não está sujo, vou sair");
                return;
            }

            System.out.println(nome + " limpando o banheiro");
            this.ehSujo = false;

            dormirUmPouco(13000);

            this.notifyAll();

            System.out.println(nome + " saindo do banheiro");
        }
    }

}
