package org.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.http.request.HttpRequest;
import org.http.response.HttpResponse;
import org.resource.ResourceWrite;
import org.servlet.SimpleServlet;

public class TimeView implements SimpleServlet {

    @Override
    public void service(HttpRequest request, HttpResponse response) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        response.setAttribute("currentTime", format.format(new Date()));
        ResourceWrite resourceWrite = response.getResourceWrite("/template/time/time.html");
        resourceWrite.forward(request, response);
    }
}
