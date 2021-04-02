package com.zikozee;

import java.util.HashMap;

/**
 *
 * @author : zikoz
 * @created : 02 Apr, 2021
 */
public class Bank {
    private HashMap<Pair, Integer> rateMap = new HashMap<>();

    Money reduce(Expression source, String toCurrency){
        return source.reduce(this, toCurrency);
    }

    public int rate(String from, String to){
        if(from.equals(to)) return 1;
        return rateMap.get(new Pair(from, to));
    }

    public void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from, to), rate);
    }
}
