package com.mps.watchservice;

import java.io.IOException;

public class WatcherApp {

    public static void main(String[] args) throws IOException {
        Watcher app = new Watcher();
        app.observar();
    }

}
