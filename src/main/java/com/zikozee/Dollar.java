package com.zikozee;

/**
 * @author : zikoz
 * @created : 01 Apr, 2021
 */
public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier){
        return new Dollar(amount * multiplier);
    }

}
