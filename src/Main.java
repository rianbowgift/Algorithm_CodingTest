import Programmers.*;
//import Baekjoon.*;
//import CodeForces.*;



public class Main {
    public static void main(String[] args) {
        String[] a = new String[]{"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
        //String[] a = new String[]{"abzcd","abzfg","abzaa","abzbb"};
        int b = 2;



        String[] z = new PM_12915().solution(a,b);



//        System.out.println(z);



        for(int i=0;i<z.length;i++){
            System.out.println(z[i]);
        }


//
//        for(int i=0;i<z.length;i++){
//            for(int j=0;j<z[0].length;j++){
//                System.out.println(z[i][j]);
//            }
//        }


    }
}
