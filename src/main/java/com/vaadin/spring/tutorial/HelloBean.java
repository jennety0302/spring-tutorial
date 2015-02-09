package com.vaadin.spring.tutorial;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.VaadinUIScope;

@SpringComponent
@VaadinUIScope
public class HelloBean {
    public String getMessage() {
        return "Hello from bean " + toString();
    }
}
