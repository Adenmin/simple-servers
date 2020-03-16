package org.example.servers.javase;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class SunHttpHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange t) throws IOException {
        String response = "This is JavaSE!";
        t.getResponseHeaders().set("Content-Type", "text/plain");
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
