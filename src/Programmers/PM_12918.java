package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12918
public class PM_12918 {

    public boolean solution(String s) {
        boolean answer = true;

        if(s.length()==4 || s.length()==6){

            for(int i=0; i<s.length();i++){
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    continue;
                }else{
                    answer = false;
                    break;
                }
            }



        }else{
            answer = false;

        }


        return answer;
    }


}
