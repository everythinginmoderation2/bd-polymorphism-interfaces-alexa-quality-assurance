package com.amazon.ata.interfaces.increment;

public class FixedIncrementer implements Incrementable {
    private int value;
    private int n;

    public FixedIncrementer() {
        this(0, 1);
    }

    public FixedIncrementer(int n) {
        this(0, n);
    }

    public FixedIncrementer(int startValue, int n) {
        this.value = startValue;
        this.n = n;
    }

    @Override
    public int increment() {
        this.value += this.n;
        return getValue();
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
