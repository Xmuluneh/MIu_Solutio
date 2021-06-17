package Muluneh;

public class sumFactor {
    public static void main(String[] args) {
        System.out.println(sumFactor(new int[]{1, 2, 3,4}));
        System.out.println(sumFactor(new int[]{3,0, 2, -5,0}));
        System.out.println(sumFactor(new int[]{9,-3,-3,-1,-1}));
        System.out.println(sumFactor(new int[]{0, 0, 0}));
        System.out.println(sumFactor(new int[]{1}));


    }

    static int sumFactor(int[] a) {
        int sum = 0;
        int count = 0;

        for (int an : a) {
            sum += an;
        }
        for (int i = 0; i < a.length; i++) {
            if (sum == a[i]) {
                count++;
            }
        }
        return (count > 0) ? count : 0;

    }
}
