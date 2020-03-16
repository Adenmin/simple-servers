package org.example.servers.undertow;

import io.undertow.Undertow;
import io.undertow.server.handlers.BlockingHandler;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class App {
    public static void main(String[] args) {
        undertow();
    }

    private static void undertow() {
        Undertow server = null;
        try {
            server = Undertow.builder()
                    .addHttpListener(8083, InetAddress.getLocalHost().getHostAddress())
                    .setHandler(new BlockingHandler(new UndertowHttpHandler())).build();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        if (server != null) {
            server.start();
        }
    }
}
