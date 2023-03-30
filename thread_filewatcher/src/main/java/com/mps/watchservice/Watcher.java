package com.mps.watchservice;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.*;


public class Watcher {

    public void observar() throws IOException {
        //create watchservice instance
        WatchService watcherService = FileSystems.getDefault().newWatchService();

        //path to the directory to be monitored
        Path dir = Paths.get("thread_filewatcher/src/main/resources/prueba");

        //register the directory in the service
        dir.register(watcherService, ENTRY_CREATE , ENTRY_DELETE , ENTRY_MODIFY);

        System.out.println("Inicia el WATCHER " + dir.getFileName());

        while (true) {
            //activador para controlar los eventos
            WatchKey watchKey;

            try {
                watchKey = watcherService.take();
                //capturar los eventos
                List<WatchEvent<?>> eventsList =  watchKey.pollEvents();

                for(WatchEvent<?> event : eventsList) {
                    //se obtiene el tipo de evento
                    WatchEvent.Kind<?> eventType = event.kind();

                    //event.context() --> filename
                    System.out.println(eventType.name() + ": " + event.context());

                    //evento especial NO CAPTURADO
                    if(eventType == OVERFLOW) {
                        continue;
                    } else {

                    }
                }
                //IMPORTANTE --> resetear la llave para que continue monitorizando los eventos
                boolean valid = watchKey.reset();
                if (!valid) {
                    break;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
