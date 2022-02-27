package Baekjoon.Bronze.Success;
//https://www.acmicpc.net/problem/2442

import java.util.Scanner;

public class BJ_2442 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = a - i; j > 1 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
