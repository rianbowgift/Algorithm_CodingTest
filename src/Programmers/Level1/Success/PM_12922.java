package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12922
public class PM_12922 {
    public String solution(int n) {
        String answer = "";

        for(int i=1; i<=n; i++){

                if(i%2==0){ //짝수면 박
                answer+= "박";
                }else{
                    answer+= "수";
                }

        }


        return answer;
    }

}
