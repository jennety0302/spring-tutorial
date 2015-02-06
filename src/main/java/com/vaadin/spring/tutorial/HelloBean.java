package com.vaadin.spring.tutorial;

import com.vaadin.spring.annotation.VaadinComponent;
import com.vaadin.spring.annotation.VaadinUIScope;

@VaadinComponent
@VaadinUIScope
public class HelloBean {
    public String getMessage() {
        return "Hello from bean " + toString();
    }
}
