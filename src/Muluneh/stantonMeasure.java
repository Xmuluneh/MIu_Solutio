package Muluneh;

public class stantonMeasure {
    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[]{1, 4, 3, 2, 1, 2, 3, 2}));
        System.out.println(stantonMeasure(new int[]{0}));
        System.out.println(stantonMeasure(new int[]{1}));

    }

    static int stantonMeasure(int[] a) {
        int oneCount = 0;
        int otherCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                oneCount++;
            }

            if (oneCount == a[i]) {
                otherCount++;
            }
        }

        return otherCount;
    }
}
