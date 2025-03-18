package org;

import org.server.HttpServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleApplicationContext {
    private static final Logger logger = LoggerFactory.getLogger(SimpleApplicationContext.class);
    public static void main(String[] args) throws Exception {
        try {
            HttpServer server = new HttpServer();
            server.start(SimpleApplicationContext.class);
        } catch (Exception e) {
            logger.error("서버 시작 실패 ", e);
        }
    }
}
