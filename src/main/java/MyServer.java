import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server (8888);
        ServletContextHandler handler = new ServletContextHandler();
        server.setHandler(handler);
        handler.addServlet(GreetServlet.class, "/greet.html");
        handler.addServlet(MyServlet.class, "/");
        //handler.addServlet(DefaultServlet.class, "/");
        //handler.setResourceBase(".");
        server.start();
    }

}
