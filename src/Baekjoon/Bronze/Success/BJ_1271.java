package Baekjoon.Bronze.Success;

import java.math.BigInteger;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1271
public class BJ_1271 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();



        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));




    }

}
