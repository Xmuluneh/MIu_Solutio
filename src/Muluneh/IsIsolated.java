package Muluneh;

public class IsIsolated {
    public static void main(String[] args) {
        System.out.println(isIsolated(162));
        System.out.println(isIsolated(163));
        System.out.println(isIsolated(69));

    }
    static int isIsolated(long n){
        if(n<1||n>2097152){
            return -1;
        }
        String cube=""+(long)Math.pow(n,3);
        String square=""+(long)Math.pow(n,2);
        char[]cubeA=cube.toCharArray();
        for(int i=0;i<cubeA.length;i++){
            if(square.contains((cubeA[i]+""))){
                return 0;
            }
        }
        return 1;
    }

}
