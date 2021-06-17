package Muluneh;

public class IsStacked {
    public static void main(String[] args) {
        System.out.println(isStacked(1));
        System.out.println(isStacked(3));
        System.out.println(isStacked(6));
        System.out.println(isStacked(10));
        System.out.println(isStacked(8));
        System.out.println(isStacked(7));

    }

    static int isStacked(int n) {
        if (n < 0) {
            return 0;
        } else {
            int sum = 0;
            for (int i = 1; i <=n&&sum<n; i++) {
                sum += i;
            }
            if (sum == n) {
                return 1;
            }
        }
        return 0;
    }
}
