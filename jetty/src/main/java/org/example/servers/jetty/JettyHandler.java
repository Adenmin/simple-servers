package org.example.servers.jetty;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;

import static java.nio.charset.StandardCharsets.UTF_8;

public class JettyHandler extends AbstractHandler {
    @Override
    public void handle(
            String target,
            Request baseRequest,
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        baseRequest.setHandled(true);
        response.setContentType("text/plain");
        final String content = "This is Jetty!";
        response.setContentLength(content.length());
        final ServletOutputStream outputStream = response.getOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(outputStream, UTF_8);
        writer.write(content);
        writer.flush();
    }
}
