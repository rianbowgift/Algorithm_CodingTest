package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/77884

public class PM_77884 {

    public int solution(int left, int right) {
        int answer = 0;


        for(int i=left ;i<=right;i++){

            int sum=0;
            for(int j=1;j<=i;j++){
                if(i%j ==0){
                    sum++;
                }
            }

            if(sum%2==0){
                answer+=i;
            }else{
                answer-=i;
            }




        }




        return answer;
    }
}
