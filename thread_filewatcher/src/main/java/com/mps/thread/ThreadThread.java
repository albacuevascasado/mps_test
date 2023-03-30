package com.mps.thread;

public class ThreadThread extends Thread {

    private int id;

    public ThreadThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for(int i = 0; i<20; i++) {
            System.out.println("Ejecutàndose hilo THREAD -->" + id);
        }
    }
}
