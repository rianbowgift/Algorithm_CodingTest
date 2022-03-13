package Baekjoon.Bronze.Success;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2991
public class BJ_2991 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] answer = new int[3];



        for(int i=0; i<3; i++){
            int temp = sc.nextInt();
            int temp_copy = temp;
            while(true){
                if(temp<=a) {
                    answer[i] += 1;
                    break;
                }else if(temp<=a+b){
                    answer[i] += 0;
                    break;
                }else{
                    temp-= a+b;
                }
            }
            while(true){
                if(temp_copy<=c) {
                    answer[i] += 1;
                    break;
                }else if(temp_copy<=c+d){
                    answer[i] += 0;
                    break;
                }else{
                    temp_copy-= c+d;
                }
            }


        }

        for(int i=0;i<3;i++){
            System.out.println(answer[i]);
        }



    }

}
