package org.service;

import org.http.request.HttpRequest;
import org.http.response.HttpResponse;
import org.resource.ResourceWrite;
import org.servlet.SimpleServlet;

public class HelloA implements SimpleServlet {

    @Override
    public void service(HttpRequest req, HttpResponse res) {

        ResourceWrite resourceWrite = res.getResourceWrite("/index.html");
        resourceWrite.forward(req,res);
    }
}