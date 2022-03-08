package Baekjoon.Silver.Failure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
//import java.util.Scanner;
//https://www.acmicpc.net/problem/1312
//참고 https://jsonobject.tistory.com/466

public class BJ_1312 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();//문자열 입력 받을 때
        String[] m = s.split(" ");
        BigDecimal a = new BigDecimal(m[0]);
        BigDecimal b = new BigDecimal(m[1]);
        int c = Integer.parseInt(m[2]);


//
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        int c = sc.nextInt();


        BigDecimal x = a.divide(b,c,RoundingMode.FLOOR);
        String y = x.toString();
        //System.out.println(y);

        System.out.print(y.charAt(y.length()-1));




    }
}
