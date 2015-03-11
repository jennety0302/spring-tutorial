package com.vaadin.spring.tutorial;

import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ContextLoaderListener;

import com.vaadin.spring.annotation.EnableVaadin;
import com.vaadin.spring.server.SpringVaadinServlet;

@SuppressWarnings("serial")
@WebServlet(value = "/*", asyncSupported = true)
public class MyVaadinServlet extends SpringVaadinServlet {

    @WebListener
    public static class MyContextLoaderListener extends ContextLoaderListener {
    }

    @Configuration
    @EnableVaadin
    public static class MyConfiguration {
    }

}