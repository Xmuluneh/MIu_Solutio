package Muluneh;
import java.util.Arrays;
import java.math.BigInteger;

public class Solve10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve10()));
        System.out.println(factorial(10)+"-->"+factorial(9));

    }
    static int[] solve10(){
        int []a=new int [2];
        for(int i=0;i<10;i++){
            for(int k=0;k<10;k++){
                if(factorial(i).add(factorial(k))==factorial(10)){
                    a[0]=i;
                    a[1]=k;

                }
            }

        }
    return a;
    }
    static BigInteger factorial(long n){
        if(n==0||n==1){
            return BigInteger.ONE;
        }
        BigInteger result=BigInteger.ONE;
            for(int i=1;i<n;i++) {
                result = result.multiply(new BigInteger(i + ""));


            }

        return result;
    }

}
