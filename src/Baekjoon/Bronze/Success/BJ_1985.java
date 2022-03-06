package Baekjoon.Bronze.Success;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2985
public class BJ_1985 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b==c){
            System.out.println(a + "+" + b +"=" + c);
        }else if(a-b==c){
            System.out.println(a + "-" + b +"=" + c);
        }else if(a/b==c){
            System.out.println(a + "/" + b +"=" + c);
        }else if(a*b==c){
            System.out.println(a + "*" + b +"=" + c);
        }else if(a==b+c){
            System.out.println(a + "=" + b +"+" + c);
        }else if(a==b-c){
            System.out.println(a + "=" + b +"-" + c);
        }else if(a==b/c){
            System.out.println(a + "=" + b +"/" + c);
        }else if(a==b*c){
            System.out.println(a + "=" + b +"*" + c);
        }

    }

}
