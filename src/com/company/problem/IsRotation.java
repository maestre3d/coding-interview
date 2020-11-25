package com.company.problem;

public class IsRotation {
    private final int[] array1;
    private final int[] array2;

    public IsRotation(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean exec() {
        // O(n) - time
        // O(k*n) - space
        if (array1.length != array2.length) {
            return false;
        }

        int key = array1[0];
        int keyB = -1;

        // find index in "B" vector where series starts
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == key) {
                keyB = i;
                break;
            }
        }

        // initial value not found, false...
        if (keyB == -1) {
            return false;
        }

        // start series succession in "A" vector
        // use mod to get back to top index in vector B
        for (int i = 0; i < array1.length; i++) {
            int j = (keyB + i) % array1.length;
            if (array1[i] != array2[j]) {
                    return false;
            }
        }

        return true;
    }
}
