package Baekjoon.Bronze.Success;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2443
public class BJ_2443 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();



        for(int i=0;i<x;i++){

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<2*x-(i*2+1);k++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
