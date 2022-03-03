package Baekjoon.Bronze.Success;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2522
public class BJ_2522 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for(int i=0;i<x-1;i++){ //전반부

            for(int j=0;j<x-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<x;i++){   //중반부
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<x-1;i++){ //후반부
            for(int k=0;k<i+1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<x-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
