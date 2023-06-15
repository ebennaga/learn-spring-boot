package com.example.demo.spring.data;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class CyclicB {
    private CyclicC cyclicC;
}
