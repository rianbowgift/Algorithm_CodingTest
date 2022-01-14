package Programmers.Level2.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12924

public class PM_12924 {

    public int solution(int n) {
        int answer = 0;
        int temp=0;


        for(int i=1;i<=n;i++){
            for(int j=i; j<=n;j++){
                temp+= j;
                if(temp==n){
                    answer++;
                }
                if(temp>n){
                    break;
                }
            }
            temp = 0;
        }


        return answer;
    }


}
