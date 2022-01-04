package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12948
public class PM_12948 {
        public String solution(String phone_number) {
            String answer = "";


            if(phone_number.length()!=4) {
                for(int i=0;i<phone_number.length()-4;i++){
                    answer+= "*";
                }


                answer +=
                        phone_number.substring(phone_number.length() - 4, phone_number.length());
            }else{
                answer +=
                        phone_number.substring(phone_number.length() - 4, phone_number.length());
            }

            return answer;
        }


}
