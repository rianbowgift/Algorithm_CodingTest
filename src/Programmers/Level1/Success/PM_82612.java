package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/82612
public class PM_82612 {
    public long solution(int price, long money, int count) {
        long answer = -1;
        long temp=0;

        for(int i=0; i<count;i++){
            temp+= price*(i+1);
        }

        if(money-temp<0){
            return answer=(money-temp)*-1;
        }else{
            return answer=0;
        }




        //return answer;
    }

}
