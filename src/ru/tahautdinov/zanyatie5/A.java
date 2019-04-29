package ru.tahautdinov.zanyatie5;

public class A {
    public int k;
    private int n;

    A() {
        k = 2;
        n = 11;

    }

    int summa() {
        return k + n;
    }

    public int getN() {
        return n;
    }

    public void setN(int nn) {
        n = nn;

    }
}

