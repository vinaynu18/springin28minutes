package com.example.springin28minutes.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XmlPersonDAO {
    @Autowired
    XmlJdbcConnection xmlJdbcConnection;

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
        this.xmlJdbcConnection = jdbcConnection;
    }
}
