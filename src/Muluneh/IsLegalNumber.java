package Muluneh;

public class IsLegalNumber {
    public static void main(String[] args) {
        System.out.println(isLegalNumber(new int []{1,2,3,2},4));
        System.out.println(isLegalNumber(new int []{3,7,1},6));

    }
    static int isLegalNumber(int[ ] a, int base){
        for(int i=0;i<a.length;i++){
            if(a[i]>=base){
                return 0;
            }
        }
        return 1;
    }

}
