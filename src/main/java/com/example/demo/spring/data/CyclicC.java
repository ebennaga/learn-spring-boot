package com.example.demo.spring.data;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class CyclicC {
    
    private CyclicA cyclicA;
}
