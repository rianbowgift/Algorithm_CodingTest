package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12903
public class PM_12903 {
    public String solution(String s) {
        String answer = "";
        int index =0;

        if(s.length()%2==0){    //짝수면
            index = s.length()/2;
            answer += s.substring(index-1,index+1);
        }else{
            index = s.length()/2;
            answer += s.substring(index,index+1);
        }




        return answer;
    }
}
