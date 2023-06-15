package com.example.demo.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.spring.data.Foo;
import com.example.demo.spring.data.Bar;
import com.example.demo.spring.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {
    
    @Bean
    public Foo fooFirst(){
        return new Foo();
    }

    @Bean
    public Foo fooSecond(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo,Bar bar){
        return new FooBar(foo, bar);
    }
}
