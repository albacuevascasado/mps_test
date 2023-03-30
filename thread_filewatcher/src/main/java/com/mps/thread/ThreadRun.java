package com.mps.thread;

public class ThreadRun implements Runnable{

    private int id;

    public ThreadRun(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for(int i = 0; i<20; i++) {
            System.out.println("Ejecutàndose hilo RUN -->" + id);
        }
    }

}
