package Baekjoon.Silver.Failure;

import java.util.Scanner;

public class BJ_1312 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        double x = (double) a/ (double) b;
        long z = 0;
        for(long i=0;i<c;i++){
            x= x*10;
        }

        z = (long) x;
        String y = Long.toString(z);

        System.out.print(y.charAt(y.length()-1));




    }
}
