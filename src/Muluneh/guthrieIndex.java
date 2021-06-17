package Muluneh;

public class guthrieIndex {
    public static void main(String[] args) {
        System.out.println(guthrieIndex(1));
        System.out.println(guthrieIndex(2));
        System.out.println(guthrieIndex(3));
        System.out.println(guthrieIndex(4));
        System.out.println(guthrieIndex(42));
        System.out.println(guthrieIndex(7));

    }

    static int guthrieIndex(int n) {
        if (n == 1) {
            return 0;
        }
        int iteration = 0;
        do {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            iteration++;
        } while (n > 1);
        return iteration;

    }
}
