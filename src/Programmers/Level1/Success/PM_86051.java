package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/86051
public class PM_86051 {

    public int solution(int[] numbers) {
        int answer = 0;
        int[] str = new int[10];

        for(int i=0; i<numbers.length;i++){
            str[numbers[i]] = -1;
        }

        for(int i=0;i<str.length;i++){
            if(str[i]!=-1){
                answer+=i;
            }
        }




        return answer;
    }

}
