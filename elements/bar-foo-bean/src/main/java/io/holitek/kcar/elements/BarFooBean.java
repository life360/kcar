package io.holitek.kcar.elements;


import org.apache.camel.Exchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.Introspector;


/**
 * example bean. suitable for binding and stateful storage within a route
 */
public class BarFooBean {

    private static final Logger LOG = LoggerFactory.getLogger(BarFooBean.class);

    // anything to do with this element - from properties to identification - will use this top level key
    public static final String NAMESPACE_KEY =
        Introspector.decapitalize(BarFooBean.class.getSimpleName());

    private String foo = "bar";

    public void setFoo(String newFoo) { foo = newFoo; }

    // if only one method in a bean takes a camel Exchange as an argument, the camel router will treat this as the
    // default handler for messages
    public String getFoo(Exchange exchange) { return foo; }

}