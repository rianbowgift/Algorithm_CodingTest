package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12954
public class PM_12954 {

    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<n; i++){
            answer[i] = x*(i+1);    // int x와 int n이 곱해질때 에러가발생함
            System.out.print (answer[i] + " ");
        }




        return answer;
    }



}
