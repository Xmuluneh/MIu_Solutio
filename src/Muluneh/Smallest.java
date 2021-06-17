package Muluneh;

public class Smallest {
    public static void main(String[] args) {
        System.out.println(smallest(2));
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));

    }

    static int smallest(int n) {
        if (n == 0) {
            return 0;
        }
        int result = 1;
        boolean found = false;
        while (!found) {
            boolean flag = true;
            for (int i = 0; i < n; ) {
                int num = result * ++i;
                if (!contains2(num)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                found = true;
            } else {
                result++;
            }
        }
        return result;


    }

    static boolean contains2(int n) {
        while (n != 0) {
            if (n % 10 == 2) {
                return true;

            }

            n /= 10;
        }
        return false;
    }
}


