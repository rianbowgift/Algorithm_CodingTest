package Baekjoon.Bronze.Success;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2292
//맞추긴 했지만 이방식이 아닌듯하다..새벽에 머리가 안굴러간듯


public class BJ_2292 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int rooms = 1; //넘긴방수
        int big =0;
        int cnt = 1; //계수

        while ( num-1>big){
            big+= 6*cnt;
            cnt++;
            rooms++;
        }

        System.out.println(rooms);


    }

}
