package com.zikozee;

/**
 * @author : zikoz
 * @created : 01 Apr, 2021
 */
public class Money {

    protected int amount;

    public boolean equals(Object object){
        Money money =(Money) object;
        return amount == money.amount
                && getClass().equals(object.getClass());
    }
}
