package org.service.a;

import org.http.request.HttpRequest;
import org.http.response.HttpResponse;
import org.resource.ResourceWrite;
import org.servlet.SimpleServlet;

public class HelloC implements SimpleServlet {

    @Override
    public void service(HttpRequest req, HttpResponse res) {
        ResourceWrite resourceWrite = res.getResourceWrite("/b/hello.html");
        resourceWrite.forward(req,res);
    }
}
