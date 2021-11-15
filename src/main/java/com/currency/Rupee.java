package com.currency;

public class Rupee {

    private int value;

    public Rupee(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Rupee inputRupee = (Rupee) obj;
        return this.value == inputRupee.value;
    }

    public Rupee add(Rupee rupee) {
        return new Rupee(this.value + rupee.value);
    }

}
