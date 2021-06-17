package Muluneh;

public class IsMinMaxDisjoint {
    public static void main(String[] args) {
        System.out.println(isMinMaxDisjoint(new int[]{2, 3, 1, 4, 5}));
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));
        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 1, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{1}));

    }

    static int isMinMaxDisjoint(int[] a) {
        if (a.length < 3) {
            return 0;
        }
        int max = a[0];
        int min = a[0];
        int maxCount = 0;
        int minCount = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxCount = 1;
            } else {
                if (a[i] == max) {
                    maxCount++;
                }
            }
            if (a[i] < min) {
                min = a[i];
                minCount = 1;
            } else {
                if (min == a[i]) {
                    minCount++;
                }

            }
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (max == a[i] && min == a[i + 1] || a[i] == min && max == a[i + 1]) {
                return 0;
            }
        }
        if (maxCount > 1 || minCount > 1) {

            return 0;
        }
        return 1;
    }
}
