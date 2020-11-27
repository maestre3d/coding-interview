package com.company.problem;

public class ReverseInt32 {
    private int x;
    public ReverseInt32(int x) {
        this.x = x;
    }

    public int exec() {
        //  Time - O(log(x))
        //  Space - O(1)
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public int execBad() {
        //  Time - O(n^2)
        //  Space - O(n)
        char[] xStr = String.valueOf(x).toCharArray();
        StringBuilder res = new StringBuilder();
        boolean isValid = false;

        // set negative if required
        if (xStr.length >= 1 && xStr[0] == '-') {
            res.append("-");
        }

        for (int i = xStr.length - 1; 0 <= i; i--) {
            if (xStr[i] != '0' && xStr[i] != '-') {
                res.append(xStr[i]);
                isValid = true;
            } else if (xStr[i] == '0' && isValid) {
                res.append(xStr[i]);
            }
        }

        if (res.length() == 0) {
            return 0;
        }

        try {
            return Integer.parseInt(res.toString());
        } catch (NumberFormatException ex) {
            return 0;
        }
    }
}
