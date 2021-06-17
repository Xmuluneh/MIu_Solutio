package Muluneh;

public class IsDivisible {
    public static void main(String[] args) {
        System.out.println(isDivisible(new int[]{3, 3, 6, 36}, 3));
        System.out.println(isDivisible(new int[]{3, 3, 4, 6, 36}, 3));
        System.out.println(isDivisible(new int []{6,12,24,36},12));
        System.out.println(isDivisible(new int []{},3));

    }

    static int isDivisible(int[] a, int divisor) {
        boolean found = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % divisor != 0) {
                found = false;
            }
        }
        if (found) {
            return 1;
        } else {
            return 0;
        }

    }
}