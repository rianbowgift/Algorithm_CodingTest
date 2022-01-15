package Programmers.Level2.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12945
//int 해보고 안되면 long
//long 도안됨. https://programmers.co.kr/questions/11991 이걸 참고하여 문제를 다시 이해
//재귀보다 반복문을 사용하여 러닝타임을 줄이는게 쉬움
//DP사용하면 재귀로해도 충분

public class PM_12945 {

    public int solution(int n) {
        int answer = 0;
        int[] DP = new int[n+1];
        for(int i=0;i<DP.length;i++){
            DP[i] = 0;
        }


        answer = fibo(n,DP)%1234567;


        return answer;
    }


    public int fibo(int n, int[] DP){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }else{
            if(DP[n]!=0){
                return DP[n]%1234567;
            }else{
                return DP[n] = (fibo(n-1,DP)%1234567) + (fibo(n-2,DP)%1234567);
            }
        }


    }






}
