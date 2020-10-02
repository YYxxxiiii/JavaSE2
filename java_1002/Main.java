package java_1002;

import java.util.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int N=sc.nextInt();
            BigInteger[] bg=new BigInteger[N];
            for(int i=0;i<N;i++){
                bg[i]=sc.nextBigInteger();
            }
            Arrays.sort(bg);
            for(int i=0;i<N;i++){
                System.out.println(bg[i]);
            }
        }
    }
}



