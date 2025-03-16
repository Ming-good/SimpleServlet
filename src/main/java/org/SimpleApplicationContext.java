package org;

import org.server.HttpServer;

public class SimpleApplicationContext {

    public static void main(String[] args) throws Exception {
        HttpServer server = new HttpServer();
        server.start(SimpleApplicationContext.class);
    }
}
