package org.example.servers.javase;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) throws Exception {
        javase();
    }

    private static void javase() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8082), 0);
        server.createContext("/", new SunHttpHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }
}
