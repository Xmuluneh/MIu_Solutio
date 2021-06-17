package Muluneh;

public class Henry {
    public static void main(String[] args) {
        System.out.println(henry(1, 3));

    }

    static int henry(int i, int j) {
        int max = Integer.MAX_VALUE;
        int henry = 0;
        int perfectNum = 0;
        for (int k = 1; k < max; k++) {
            int sum = 0;
            for (int n = 1; n < k; n++) {
                if (k % n == 0) {
                    sum += n;
                }
            }
            if (sum == k) {
                perfectNum++;

                if (perfectNum == i) {
                    henry += sum;
                } else if (perfectNum == j) {
                    henry += sum;
                    break;
                }
            }
        }
        return henry;
    }

}
