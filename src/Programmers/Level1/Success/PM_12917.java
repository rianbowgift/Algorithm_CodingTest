package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12917
public class PM_12917 {
    public String solution(String s) {
        String answer = "";
        char[] list = new char[s.length()];

        for(int i=0; i<s.length(); i++){
            list[i] = s.charAt(i);
        }



        for(int i=0; i<list.length;i++){
            for(int j=0; j<list.length-1; j++){
                if(list[j] < list[j+1]){
                    char temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        for(int i=0; i<list.length;i++){
            answer+= list[i];
        }


        return answer;
    }
}
