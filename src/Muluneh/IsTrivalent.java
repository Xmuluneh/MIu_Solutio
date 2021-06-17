package Muluneh;

public class IsTrivalent {
    public static void main(String[] args) {
        System.out.println(isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
        System.out.println(isTrivalent(new int[]{1, 2, 2, 2, 2, 2, 2}));
        System.out.println(isTrivalent(new int[]{2, 2, 3, 3, 3, 3, 2, 41, 65}));//4
        System.out.println(isTrivalent(new int[]{-1, 0, 1, 0, 0, 0}));
        System.out.println(isTrivalent(new int[]{}));
        System.out.println(isTrivalent(new int[]{2147483647, -1, -1, -2147483648}));

    }

    static int isTrivalent(int[] a) {

        if (a.length < 3) {
            return 0;
        } else {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                count++;
                for (int k = 0; k < i; k++) {
                    if (a[i] == a[k]) {
                        count--;
                        break;
                    }
                }
            }
            if (count == 3) {
                return 1;
            }
        }
        return 0;
    }
}
