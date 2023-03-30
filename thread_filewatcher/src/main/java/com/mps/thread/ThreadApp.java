package com.mps.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadApp {

    public static void main(String[] args) throws InterruptedException {
    // By default, java tiene un UNICO hilo (clase MAIN) si no generas màs (por ejemplo, hilo)
        /*** THREADS ***/
        /*
        ThreadThread hilo1 = new ThreadThread(1);
        ThreadThread.sleep(1000); //hereda de Thread
        //Iniciar la ejecuciòn EJECUTA EN ORDEN
        //hilo.run();
        //Iniciar hilos contemporaneamente
        hilo1.start();
        //Fuerza a que éeste hilo acabe primero y después inicie hilo2
        hilo1.join();

        Thread hilo2 = new Thread(new ThreadRun(2)) ;
        //hilo2.sleep(4000);
        //Thread.sleep(2000); //static class no necesita incializarse
        System.out.println("Estado del hilo 2 " + hilo2.getState());
        hilo2.start();
        System.out.println("Estado del hilo 2 " + hilo2.getState());
        System.out.println("Iniciando hilo 2");

        for(int i = 0; i<20; i++) {
            System.out.println("Ejecutàndose hilo MAIN " + i);
        }

        System.out.println("Estado del hilo 2 " + hilo2.getState());

        /*
        if (!hilo2.isAlive()){
            System.out.println("Iniciando hilo 2 de nuevo");
            hilo2.run();
        }
         */


        /*** EXECUTOR SERVICE ***/
        //create the pool
        ExecutorService service = Executors.newFixedThreadPool(10);

        //submit the tasks for the execution
        for (int i = 0; i < 10; i++) {
            service.execute(new TaskRun());
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());

    }

}
