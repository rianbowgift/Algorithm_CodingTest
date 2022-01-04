package Programmers;

import java.util.HashMap;
import java.util.Map;

//https://programmers.co.kr/learn/courses/30/lessons/42576
//해시
public class PM_42576 {


    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<Integer,String> hashmap = new HashMap();

        for(int i=0;i<completion.length;i++){   //데이터 넣기
            hashmap.put(i,completion[i]);
        }

        for(int i=0;i<participant.length;i++){
            if(hashmap.get(i)==null){
                return answer = participant[i];
            }else{


            }

            if(i==participant.length-1){    //끝까지 못빠저나간경우

            }
        }







        return answer;
    }

}
