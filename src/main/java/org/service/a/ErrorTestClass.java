package org.service.a;

import org.annotation.Servlet;
import org.http.request.HttpRequest;
import org.http.response.HttpResponse;
import org.resource.ResourceWrite;
import org.servlet.SimpleServlet;

public class ErrorTestClass implements SimpleServlet {

    @Override
//    @Servlet("PUT")
    public void service(HttpRequest req, HttpResponse res) throws Exception {
        if (true) {
            throw new Exception("asdasdasd");
        }

        ResourceWrite resourceWrite = res.getResourceWrite("/b/index.html");
        resourceWrite.forward(req,res);
    }
}
