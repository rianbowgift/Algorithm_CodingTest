package Baekjoon.Bronze.Success;
//https://www.acmicpc.net/problem/15727

import java.util.Scanner;

public class BJ_15727 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x%5==0){
            System.out.println(x/5);
        }else{
            System.out.println((x/5) +1);
        }

    }

}
