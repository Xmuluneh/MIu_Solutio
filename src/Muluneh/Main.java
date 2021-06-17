package Muluneh;

public class Main {

    public static void main(String[] args) {
        System.out.println(nextPerfect(6));
        System.out.println(nextPerfect(36));
        System.out.println(nextPerfect(0));
        System.out.println(nextPerfect(15));

    }

    static int nextPerfect(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 1||n==0) {
            return n;

        }

            int nextPerfect=1 ;
            for (int i = 0; i <  n; i++) {
                if (Math.pow(i,2) > n) {
                    nextPerfect = (int) Math.pow(i, 2);
                    break;
                }
            }


            return nextPerfect;
        }
    }


