package com.zikozee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author : zikoz
 * @created : 31 Mar, 2021
 */
class MoneyTest {

    @Test
    void testMultiplication() {// getting new object to avoid mutating side effects
        Dollar five =  new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
