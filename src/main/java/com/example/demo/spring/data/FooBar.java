package com.example.demo.spring.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FooBar {
    
    private Foo foo;
    private Bar bar;
}
