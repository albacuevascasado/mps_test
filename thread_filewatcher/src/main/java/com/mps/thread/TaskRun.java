package com.mps.thread;

public class TaskRun implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }

}
