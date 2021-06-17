package Muluneh;

public class IsVanilla {
    public static void main(String[] args) {
        System.out.println(isVanilla(new int[]{1}));
        System.out.println(isVanilla(new int[]{11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[]{9, 999, 99999, -99999}));
        System.out.println(isVanilla(new int[]{}));

    }

    static int isVanilla(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int digit = a[i] % 10;
            while (a[i] != 0) {
                int temp = a[i] % 10;
                if (temp != digit)
                    return 0;
                a[i] /= 10;
            }
        }
        return 1;
    }
}
