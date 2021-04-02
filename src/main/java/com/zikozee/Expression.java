package com.zikozee;

/**
 * @author : zikoz
 * @created : 02 Apr, 2021
 */
public interface Expression {
    Money reduce(Bank bank, String to);
}
