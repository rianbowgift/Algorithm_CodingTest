package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12944
public class PM_12944 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];

        }

        answer = sum/arr.length;






        return answer;
    }

}
