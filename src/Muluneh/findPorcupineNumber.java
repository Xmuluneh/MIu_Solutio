package Muluneh;

public class findPorcupineNumber {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(139));

    }


    static int findPorcupineNumber(int n) {
        int max_num = Integer.MAX_VALUE;
        for (int i = n+1 ; i < max_num; i++) {
            if (isPrime(i)==1 )
            if(i % 10 == 9) {
                for (int k = i+1; k < max_num; k++) {
                    if (isPrime(k)==1)
                        if(k % 10 == 9) {
                        return i;
                    } else {
                        i = k;
                        break;
                    }
                }
            }
        }
        return 0;

    }

    static int  isPrime(int n) {
        if (n < 1) {
            return 0;
        }
        for (int i = 2; i <=(int )Math.sqrt(n); i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }


}
