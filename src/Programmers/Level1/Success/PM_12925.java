package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12925
public class PM_12925 {
    public int solution(String s) {
        int answer = 0;


        if(s.charAt(0)=='-'){
            answer = Integer.parseInt(s.substring(1,s.length())) *-1;
        }else{
            answer = Integer.parseInt(s.substring(0,s.length()));
        }



        return answer;
    }
}
