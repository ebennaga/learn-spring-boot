package com.example.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.spring.data.Foo;

public class BeanNameConfiguration {
    @Primary
    @Bean("fooFirst")
    public Foo foo1(){
        return new Foo();
    }

    @Bean("fooSecond")
    public Foo foo2(){
        return new Foo();
    }
}
