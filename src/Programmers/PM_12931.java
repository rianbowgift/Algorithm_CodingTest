package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12931

public class PM_12931 {
    public int solution(int n) {
        int answer = 0;

        while(true){
            if(n<10){
                answer+=n;
                break;
            }else{
                answer += n%10;
                n /= 10;
            }
        }

        return answer;
    }
}
