import Programmers.*;
//import Baekjoon.*;
//import CodeForces.*;



public class Main {
    public static void main(String[] args) {
        int[][] a = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] b = new int[]{1,5,3,5,1,2,1,4};


        int c = new PM_64061().solution(a,b);
        System.out.println(c);

//        for(int i=0;i<c.length;i++){
//            System.out.println(c[i]);
//        }
    }
}
