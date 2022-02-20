package Baekjoon.Silver;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2447
//재귀
public class BJ_2447 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        star(27);




    }

    public static void star(int n){
        //n*n의 크기로 만들어저야함
        if(n!=1){
            star(n/3);
        }
        if(){
            System.out.println("*");
        }
        if(){
            System.out.println(" ");
        }


    }




}
