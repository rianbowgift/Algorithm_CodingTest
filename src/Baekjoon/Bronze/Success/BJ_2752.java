package Baekjoon.Bronze.Success;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2752
public class BJ_2752 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] sort = new int[3];

        for(int i=0;i<3;i++){
            sort[i] = sc.nextInt();
        }

        Arrays.sort(sort);
        for(int i=0;i<3;i++){
            System.out.print(sort[i] + " ");
        }




    }

}
