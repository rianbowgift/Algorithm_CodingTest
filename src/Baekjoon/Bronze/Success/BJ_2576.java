package Baekjoon.Bronze.Success;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2576
public class BJ_2576 {

    public static void main(String[] args){
        int min = 101;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
            if(arr[i]%2!=0){
                sum+= arr[i];

                if(arr[i]<min){
                    min = arr[i];
                }

            }

        }

        if(sum==0){
            System.out.println("-1");
        }else{
            System.out.println(sum);
            System.out.println(min);

        }




    }

}
