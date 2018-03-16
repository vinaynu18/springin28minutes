package com.example.springin28minutes.xml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class XmlJdbcConnection {
    public XmlJdbcConnection(){
        System.out.println("Inside JDBC Connection class Constructor!!");
    }
}
