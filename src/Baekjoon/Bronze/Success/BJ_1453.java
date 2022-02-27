package Baekjoon.Bronze.Success;

import java.util.Scanner;

public class BJ_1453 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer=0;
        int n = sc.nextInt();
        int[] array = new int[100];

        for(int i=0;i<array.length;i++){
            array[i] = 0;
        }

        for(int i=0; i<n;i++){
            int x = sc.nextInt();

            if(array[x-1]!=0){
                answer++;
            }else{
                array[x-1]=1;
            }
        }

        System.out.println(answer);

    }
}
