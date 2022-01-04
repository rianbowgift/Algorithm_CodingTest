package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12928
public class PM_12928 {
    public int solution(int n) {
        int answer = 0;


        for(int i=n; i>0;i--){
            if(n%i==0){
                answer+=i;
            }
        }



        return answer;
    }
}
