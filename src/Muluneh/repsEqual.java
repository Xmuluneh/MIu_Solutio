package Muluneh;

public class repsEqual {
    public static void main(String[] args) {
        System.out.println(repsEqual(new int []{3,2,0,5,3},32053));

    }
    static int repsEqual(int []a,int n){
        int sum=0;

        for(int i=0;i<a.length;i++){
            sum=sum*10+a[i];

            }
        if(sum==n){
            return 1;
        }
        return 0;
    }
}
