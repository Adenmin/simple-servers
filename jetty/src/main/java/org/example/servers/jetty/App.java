package org.example.servers.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws Exception {
        jetty();
    }

    private static void jetty() throws Exception {
        final Server server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8081);
        server.setConnectors(new ServerConnector[]{connector});
        server.setHandler(new JettyHandler());
        server.start();
    }
}
