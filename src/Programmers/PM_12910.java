package Programmers;

import java.util.ArrayList;

//https://programmers.co.kr/learn/courses/30/lessons/12910
public class PM_12910 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> answer_array = new ArrayList<>();

        int count=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer_array.add(arr[i]);
                count++;
            }
        }


        if(count==0){
            answer_array.add(-1);
        }

        answer = new int[answer_array.size()];
        for(int i=0; i<answer_array.size();i++){
            answer[i] = answer_array.get(i);
        }


        for(int i=0;i<answer.length;i++){
            for(int j=0;j<answer.length-1;j++){
                if(answer[j]> answer[j+1]){
                    int temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }
            }
        }





        return answer;
    }

}
