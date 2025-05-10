package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("com")
public class component {

    @Value("${id}")
    int id;
}
