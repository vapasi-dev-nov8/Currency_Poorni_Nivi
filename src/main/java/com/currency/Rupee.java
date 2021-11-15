package com.currency;

public class Rupee {

    private int value;

    public Rupee(int value) {
        this.value = value;
    }

    public boolean equals(Rupee rupee) {
        return this.value == rupee.value;
    }
}
