package Muluneh;

public class ArraysHasNoneZero {
    public static void main(String[] args) {
        System.out.println(arrayHasNoneZero(new int[]{1, 2, 3}));
        System.out.println(arrayHasNoneZero(new int[]{0, 0, 0, 0,}));
        System.out.println(arrayHasNoneZero(new int[]{1, 2, 3, 0}));
        System.out.println(arrayHasNoneZero(new int[]{}));

    }

    static int arrayHasNoneZero(int[] a) {
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                found = true;
            }
        }
        if (found) {
            return 0;
        }
        return 1;
    }
}


