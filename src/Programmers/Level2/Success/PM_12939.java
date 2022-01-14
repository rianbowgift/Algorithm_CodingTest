package Programmers.Level2.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12939
public class PM_12939 {

    public String solution(String s) {
        String answer = "";
        int min = 9999999;
        int max = -9999999;
        String num = "";
        int sign = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '-'){
                sign = -1;
                continue;
            }
            if(s.charAt(i) == ' '){

                int num_int = Integer.parseInt(num) * sign;
                if(min>num_int){
                    min = num_int;
                }
                if(max<num_int){
                    max = num_int;
                }



                num = "";
                sign = 1;
                continue;
            }else{
                num+= s.charAt(i);
                continue;
            }


        }


            int num_int = Integer.parseInt(num) * sign;
            if(min>num_int){
                min = num_int;
            }
            if(max<num_int){
                max = num_int;
            }




        answer += min + " " + max;




        return answer;
    }


}
