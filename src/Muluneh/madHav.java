package Muluneh;

public class madHav {
    public static void main(String[] args) {
        System.out.println(madHave(new int[]{1,2,1,0,9,8,5,6,8,9}));

    }
    static int madHave(int []a){
        int n=0;
        for(int i=0;i<a.length;i++){
            if(a.length==i*(i+1)/2) {
                n = i;
                break;
            }
        }
        return n;
    }
}
