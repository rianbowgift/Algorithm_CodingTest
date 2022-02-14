package Baekjoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2869
public class BJ_2869 {

    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine(); //String
        StringTokenizer st = new StringTokenizer(s);
        int A = Integer.parseInt(st.nextToken()); //첫번째 호출
        int B = Integer.parseInt(st.nextToken()); //두번째 호출
        int V = Integer.parseInt(st.nextToken()); //첫번째 호출


        int sum= A-B;
        int day= V-(sum*B);



        System.out.println(day);

    }

}
