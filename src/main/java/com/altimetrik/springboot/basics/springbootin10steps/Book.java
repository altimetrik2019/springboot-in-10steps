package com.altimetrik.springboot.basics.springbootin10steps;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    long id;
    String name;
    String author;
}
