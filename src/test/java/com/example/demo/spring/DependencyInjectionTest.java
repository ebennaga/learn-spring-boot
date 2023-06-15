package com.example.demo.spring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.spring.data.Foo;
import com.example.demo.spring.data.Bar;
import com.example.demo.spring.data.FooBar;

public class DependencyInjectionTest {
    
    private ApplicationContext applicationContext;

    @BeforeEach
    void setup(){
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class) {
            
        };
    }

    @Test
    void testDi(){
       Foo foo = applicationContext.getBean("fooSecond",Foo.class);
       Bar bar = applicationContext.getBean(Bar.class);
       FooBar  fooBar = applicationContext.getBean(FooBar.class);

       Assertions.assertSame(bar, fooBar.getBar());
       Assertions.assertSame(foo, fooBar.getFoo());
    }

    @Test
    void testNoDi(){
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo,bar);

        Assertions.assertSame(foo,fooBar.getFoo());
        Assertions.assertSame(foo,fooBar.getFoo());
    } 
}
