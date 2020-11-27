package com.company.problem;

public class IsPalindromeNum {
    private final int x;
    public IsPalindromeNum(int x) {
        this.x = x;
    }

    public boolean exec() {
        return new StringBuilder().append(x).reverse().toString().equals(Integer.toString(x));
    }
}
