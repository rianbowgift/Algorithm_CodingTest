package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12912
public class PM_12912 {
    public long solution(int a, int b) {
        long answer = 0;

        int big =0;
        int small = 0;

        if(a>b){
            big = a;
            small = b;
        }else{
            big= b;
            small = a;
        }

        for(int i=0; i<big-small+1;i++){
            answer+=small+i;
        }








        return answer;
    }

}
