package com.zikozee;

/**
 * @author : zikoz
 * @created : 01 Apr, 2021
 */
public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier){
        return new Franc(amount * multiplier);
    }

}
