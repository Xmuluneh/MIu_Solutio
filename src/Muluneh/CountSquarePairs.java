package Muluneh;

public class CountSquarePairs {
    public static void main(String[] args) {
        System.out.println(countSquarePairs(new int[]{11, 5, 4, 20}));
        System.out.println(countSquarePairs(new int[]{9, 0, 2, -5, 7}));
        System.out.println(countSquarePairs(new int[]{9}));
        System.out.println(countSquarePairs(new int[]{2, 7, 2, 2}));
        // System.out.println(countSquarePairs(new int[] {11,5,4,20}));

    }

    static int countSquarePairs(int[] a) {
        if (a.length < 2) {
            return 0;
        } else {

            int count = 0;
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                for (int k = 0; k < a.length; k++) {
                    if (a[i] == a[k] && i != k) {
                        return 0;
                    }
                    if (a[i] > a[k] && a[i] > 0 && a[k] > 0 && a[i] != a[k]) {
                        sum = a[k] + a[i];
                        if (isPerfectSquare(sum))
                            count++;


                    }
                }
            }

            return count;
        }

    }


    static boolean isPerfectSquare(int n) {
        double sr = Math.sqrt(n);
        return ((sr - Math.floor(sr)) == 0);

    }
}
