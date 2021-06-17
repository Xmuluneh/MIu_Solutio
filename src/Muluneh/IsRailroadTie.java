package Muluneh;

public class IsRailroadTie {
    public static void main(String[] args) {
        System.out.println(isRailroadTie(new int[]{1,2}));
        System.out.println(isRailroadTie(new int[]{1,2,0,1,2,0,1,2}));
        System.out.println(isRailroadTie(new int []{3,3,0,3,3,0,3,3,0,3,3}));
        System.out.println(isRailroadTie(new int []{0,0,0,0,0,0}));
        System.out.println(isRailroadTie(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println(isRailroadTie(new int []{1,3,0,3,5,0,0}));


    }
    static int isRailroadTie(int []a){
        if(a.length<2){
            return 0;
        }
        boolean found=false;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==0&&a[i+1]>0&&a[i+2]>0||a[i]>0&&a[i+1]==0){
                found=true;
            }
        }
        if(found){
            return 1;
        }
        return 0;
    }
}
