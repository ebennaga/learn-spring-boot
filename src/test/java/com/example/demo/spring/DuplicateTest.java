package com.example.demo.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.demo.spring.data.Foo;

public class DuplicateTest {

    // @Test
    // void testDuplicate() {
    //     ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateTest.class);

    //     Assertions.assertThrows(NoUniqueBeanDefinitionException.class,()-> {
    //         Foo foo = context.getBean(Foo.class);
    //     });
    // }

    @Test
    void getBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        String name;
        Foo foo1 = context.getBean("foo1",Foo.class);
        Foo foo2 = context.getBean("foo2",Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }
}
