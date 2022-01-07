package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/87389

public class PM_87389 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<n;i++){
            if(n%i==1){
                answer = i;
                break;
            }
        }


        return answer;
    }

}
