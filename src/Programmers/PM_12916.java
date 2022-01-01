package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12916
public class PM_12916 {
    boolean solution(String s) {
        boolean answer = true;
        int balance = 0;
        for(int i=0; i< s.length();i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                balance+=1;
            }
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                balance-=1;
            }
        }

        if(balance!=0){
            answer=false;
        }



        return answer;
    }

}
