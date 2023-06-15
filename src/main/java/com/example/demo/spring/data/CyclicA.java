package com.example.demo.spring.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicA {
    private CyclicB cyclicB;
}
