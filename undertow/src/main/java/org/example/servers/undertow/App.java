
package org.example.servers.undertow;

import io.undertow.Undertow;
import io.undertow.server.handlers.BlockingHandler;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args){
        undertow();
    }

    private static void undertow() {
        Undertow server = Undertow.builder()
                .addHttpListener(8080, "localhost")
                .setHandler(new BlockingHandler(new UndertowHttpHandler())).build();
        server.start();
    }
}
