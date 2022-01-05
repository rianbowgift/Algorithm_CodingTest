package Programmers.Level1.Failure;

import java.util.HashMap;
import java.util.Map;
//미해결. 일반테스트케이스통과. 효율성검사 탈락.
//https://programmers.co.kr/learn/courses/30/lessons/42576
//해시
// map.keyset  map.entryset검색

public class PM_42576 {


    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> hashmap = new HashMap<>();

        for(int i=0; i<participant.length;i++){ //중복입력시 벨류값 +1

            if(hashmap.get(participant[i])==null){
                hashmap.put(participant[i],1);
            }else{
                int count = 0;
                count = hashmap.get(participant[i]) +1;
                hashmap.put(participant[i],count);
            }


        }
        int point =0;

        for(String key : hashmap.keySet()){
            Integer value = hashmap.get(key);


            for(int i=0;i<completion.length;i++){
                if(completion[i].equals(key)){
                    if(value>1){
                        value +=1 ;
                        hashmap.put(key,value);
                        break;
                    }
                }

            }
        }


        for (String key : hashmap.keySet()) {
            Integer value = hashmap.get(key);
            if (value > 1) {
                answer += key;
                break;
            }
        }








        return answer;
    }

}
