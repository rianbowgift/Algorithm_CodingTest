package Programmers.Level2.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12951
// answer += (char)(s.charAt(i)-32); 핵심키워드. char형의계산
import java.util.Locale;

public class PM_12951 {
    public String solution(String s) {
        String answer = "";


        s = s.toLowerCase();




        for(int i=0;i<s.length();i++){
            if(i==0){       //-1해줄때 버퍼를 건드리지않게 첫번째만 미리설정
                if(s.charAt(0)>='a' && s.charAt(0)<= 'z'){  //대문자로
                    answer += (char)(s.charAt(i)-32);
                    continue;
                }else {
                    answer += s.charAt(0);
                }

            }else{
                if(s.charAt(i-1)==' '){ //이전문자가 공백문자면
                    if(s.charAt(i)>='a' && s.charAt(i)<= 'z'){ //대문자로
                        answer += (char)(s.charAt(i)-32);
                    }else {
                        answer += s.charAt(i);
                    }
                }else{
                    answer+= s.charAt(i);
                }
            }




        }


        return answer;
    }

}
