package Muluneh;

public class isCentered15 {
    public static void main(String[] args) {
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{2,10, 4, 1, 6, 9}));
        System.out.println(isCentered15(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println(isCentered15(new int[]{1, 1, 8, 3, 1, 1}));
        System.out.println(isCentered15(new int[]{9, 15, 6}));
        System.out.println(isCentered15(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println(isCentered15(new int[]{1, 1, 15 - 1, -1}));


    }

    static int isCentered15(int[] a) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = a[i];
            for (int k = i + 1; k < a.length; k++) {
                if (sum == 15) {
                    start = i;
                    end = k;
                    break;
                } else if (sum < 15) {
                    sum += a[k];
                } else {
                    break;
                }
            }

            if (start == (a.length - end)) {
                return 1;
            }
        }

            return 0;
        }
    }


