package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/76501
public class PM_76501 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0;i<absolutes.length; i++){
            if(signs[i]==true){
                answer+= absolutes[i];
            }else{
                answer+= absolutes[i]*-1;
            }
        }

        return answer;
    }

}
