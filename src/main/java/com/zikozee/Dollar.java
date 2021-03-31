package com.zikozee;

/**
 * @author : zikoz
 * @created : 01 Apr, 2021
 */
public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }


}
