package Muluneh;

import java.util.Arrays;

public class ClusterCompression {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{18})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{-5, -5, -5, -5, -5})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2})));

    }

    static int[] clusterCompression(int[] a) {
        if (a.length == 0) {
            return new int[]{};
        }
        int index = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                index++;
            }
        }
        int[] newArrays = new int[index];
        int k = 0;
        if (index == 1) {
            newArrays[0] = a[0];
            return newArrays;
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                newArrays[k] = a[i];
                newArrays[k + 1] = a[i + 1];
                k++;
            }
        }
        return newArrays;
    }

}
