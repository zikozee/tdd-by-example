package com.zikozee;

/**
 * @author : zikoz
 * @created : 01 Apr, 2021
 */
public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object){
        Dollar dollar =(Dollar) object;
        return amount == dollar.amount;
    }
}
