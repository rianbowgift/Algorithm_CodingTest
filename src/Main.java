
import Programmers.Level1.Success.PM_92334;
//import Baekjoon.*;
//import CodeForces.*;



public class Main {
    public static void main(String[] args) {
        String[] a = new String[]{"muzi", "frodo", "apeach", "neo"};
        String[] b = new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int c = 2;


        int[] z = new PM_92334().solution(a,b,c);
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
