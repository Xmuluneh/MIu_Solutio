package Muluneh;

public class ConvertToBase10 {
    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[]{1,0,1,2},2));
        System.out.println(convertToBase10(new int []{1,2,3,2},4));
        System.out.println(convertToBase10(new int []{3,7,1},6));
        System.out.println(convertToBase10(new int []{3,2,5},8));

    }


    static int convertToBase10(int[] a, int base) {
        int result = 0;
        int k = 0;
        boolean flag = false;
        for (int i = a.length-1; i >= 0; i--) {
            if (IsLegalNumber.isLegalNumber(a, base) == 1) {
                flag = true;
                result += a[i] * Math.pow(base, k);
                k++;
            }

        }
        if (!flag) {
            return -1;
        } else {
            return result;
        }

    }
}

