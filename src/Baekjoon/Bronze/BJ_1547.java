package Baekjoon.Bronze;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1547
public class BJ_1547 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 0;


        for(int i=0;i<x;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp = 0;

            temp = arr[a-1];
            arr[a-1] = arr[b-1];
            arr[b-1] = temp;
        }

        for(int i=0;i<3;i++){
            if(arr[i]==1){
                System.out.print(i+1);
                break;
            }
        }

    }
}
