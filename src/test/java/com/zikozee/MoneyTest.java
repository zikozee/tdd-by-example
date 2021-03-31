package com.zikozee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @author : zikoz
 * @created : 31 Mar, 2021
 */
class MoneyTest {

    @Test
    void testMultiplicationDollar() {// getting new object to avoid mutating side effects
        Dollar five =  new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
    }

}
