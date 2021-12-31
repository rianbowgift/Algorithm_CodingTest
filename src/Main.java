import Programmers.*;
//import Baekjoon.*;
//import CodeForces.*;



public class Main {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1},{2}};
        int[][] b = new int[][]{{3},{4}};


        int[][] z = new PM_12950().solution(a,b);

        //        System.out.println(z);

//        for(int i=0;i<z.length;i++){
//            System.out.println(z[i]);
//        }

        for(int i=0;i<z.length;i++){
            for(int j=0;j<z[0].length;j++){
                System.out.println(z[i][j]);
            }
        }


    }
}
