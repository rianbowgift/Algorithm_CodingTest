package Baekjoon.Bronze.Success;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2476
public class BJ_2476 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0;


        for(int i=0; i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int temp_sum = 0;

            if(a==b){
                if(a==c){  //셋다맞음
                    temp_sum = 10000 + ( a*1000);
                }else{  //a,b만 맞음(2개)
                    temp_sum = 1000 + ( a* 100);
                }
            }
            else if(a==c){ //a,c만맞음(2개)
                temp_sum = 1000 + (a*100);
            }
            else if(b==c){ //b,c만맞음(2개)
                temp_sum = 1000 + (b*100);
            }else{ //다안맞음
                int big = a>b ? a>c ? a: c : b>c ? b: c;
                temp_sum = big*100;
            }


            if(max<temp_sum){
                max = temp_sum;
            }




        }

        System.out.println(max);


    }


}
