package Programmers.Level2.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12909
public class PM_12909 {

    boolean solution(String s) {
        boolean answer = true;
        int check=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                check++;
            }else if(s.charAt(i)==')'){
                check--;
            }
            if(check<0){
                return answer=false;
            }
        }

        if(check!=0){
            return answer=false;
        }

        return answer;
    }

}
