package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/72410
//아주 못짠코드. 참고하지말것..
import java.util.Locale;

public class PM_72410 {
    public String solution(String new_id) {
        String answer = "";
        String temp = "";
        int count =0;
//        1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        new_id = new_id.toLowerCase();

//        2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.

        for(int i=0; i<new_id.length();i++){
            if((new_id.charAt(i)>='a' && new_id.charAt(i)<= 'z') ||
                    (new_id.charAt(i) >='0'  && new_id.charAt(i) <= '9') ||
                    new_id.charAt(i) == '-' || new_id.charAt(i) == '_' || new_id.charAt(i) == '.'){
                temp+= new_id.charAt(i);
            }else{
                continue;
            }
        }
        new_id = temp;
        temp = "";




//        3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.


        for(int i=0; i<new_id.length();i++){
            for(int j=0; j<new_id.length()-1;j++){
                if(new_id.charAt(j)=='.' && new_id.charAt(j+1)=='.'){
                    new_id = new_id.replace("..",".");
                }
            }


        }







//        4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.

        for(int i=0;i<new_id.length();i++){
            if(new_id.charAt(i) == '.' && i==0){
                count++;
                continue;
            }
            if(new_id.charAt(new_id.length()-1)=='.' && i==new_id.length()-1){
                break;
            }

            temp+=new_id.charAt(i);
            count++;
        }
        if(count>0){
            new_id = temp;
            temp = "";
            count=0;
        }




//        5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(new_id.equals("")){
            new_id += 'a';
        }



//        6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        if(new_id.length()>=16){
            for(int i=0;i<15;i++){
                temp+=new_id.charAt(i);
            }
            new_id = temp;
            temp = "";
        }


//                만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        for(int i=0;i<new_id.length();i++){
            if(new_id.charAt(new_id.length()-1)=='.' && i==new_id.length()-1){
                break;
            }

            temp+=new_id.charAt(i);
            count++;
        }
        if(count>0){
            new_id = temp;
            temp = "";
            count=0;
        }



//        7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(new_id.length()<=2){
            char temp_char = new_id.charAt(new_id.length()-1);

            for(int i=new_id.length(); i<3; i++){
                new_id += temp_char;
            }
        }


        //        3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.


        for(int i=0; i<new_id.length();i++){
            for(int j=0; j<new_id.length()-1;j++){
                if(new_id.charAt(j)=='.' && new_id.charAt(j+1)=='.'){
                    new_id = new_id.replace("..",".");
                }
            }


        }

        answer = new_id;


        return answer;
    }
}
