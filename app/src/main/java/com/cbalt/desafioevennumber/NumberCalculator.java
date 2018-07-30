package com.cbalt.desafioevennumber;

public class NumberCalculator {
    private NumberCallback callback;

    public NumberCalculator(NumberCallback callback) {
        this.callback = callback;
    }

    public void isEven(String value){
        if(value.trim().length() > 0){
            int number = Integer.parseInt(value);
            if(number%2 == 0){
                callback.even(value);
            } else {
                callback.odd(value);
            }

        } else {
            callback.inputBlank();
        }
    }
}
