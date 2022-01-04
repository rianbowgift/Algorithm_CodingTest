package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12919
public class PM_12919 {
    public String solution(String[] seoul) {
        String answer = "";
        int num =0;
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].substring(0).equals("Kim")){
                num = i;
            }
        }
        answer = "김서방은 " + num + "에 있다";
        return answer;
    }


}
