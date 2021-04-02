package com.zikozee;

/**
 * CLAZZ
 *
 * @author : zikoz
 * @created : 02 Apr, 2021
 */
public class Sum implements Expression{

    Money augmend;
    Money addmend;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String to){
        int amount = augmend.amount + addmend.amount;
        return new Money(amount, to);
    }

}
