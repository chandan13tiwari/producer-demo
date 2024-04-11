package com.poc.kafka.producerdemo.payload;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private int id;
    private String firstname;
    private String lastname;
}
