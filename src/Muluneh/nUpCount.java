package Muluneh;

public class nUpCount {
    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{2,3,1,-6,8,-3,-1,2},5));
        System.out.println(nUpCount(new int[]{6,1,2},6));

    }
    static int nUpCount(int []a,int n){
        int count =0;
        int pps=0;
        int ps=0;
        for(int i=0;i<a.length;i++) {
            pps = ps;
            ps+=a[i];
            if (pps <=n && ps>n)
                count++;

        }
            return count;
        }

    }


