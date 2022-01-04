package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12926
//시저사이퍼
public class PM_12926 {
    public String solution(String s, int n) {
        String answer = "";
        char onechar =' ';

        for(int i=0; i<s.length();i++){
            onechar = s.charAt(i);  //한글자씩 추출

            if(onechar>=65 && onechar<=90){ //대문자일경우
                onechar+=n;
                if(onechar>90){ //숫자 넘어갈땐 회귀
                    onechar-=26;
                }
                answer += onechar;

            }else if(onechar>=97 && onechar<=122){//소문자일경우
                onechar+=n;
                if(onechar>122){ //숫자 넘어갈땐 회귀
                    onechar-=26;
                }
                answer += onechar;
            }else{  //띄어쓰기일경우
                answer += onechar;
            }

        }





        return answer;
    }

}
