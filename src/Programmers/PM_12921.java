package Programmers;

import java.util.ArrayList;

//https://programmers.co.kr/learn/courses/30/lessons/12921
public class PM_12921 {

    public int solution(int n) {
        int answer = 0;
        int mul = 1;    //제곱근 구하기

        for(int i=2; i<=n; i++){
            if(i==2){
                answer++;
                continue;
            }
            if(i%2==0){     //1번조건. 모든짝수는 소수가 아니므로 패스한다. 2배빨라짐
                continue;
            }
            while(true){        //2번조건 1단계. 제곱근을 구하자. 예를들어 100이라면 10. 101이라면 11. 99라면 100
                if(mul*mul>i){  // 현재 검사하는 숫자보다 제곱한게 커지면
                    mul++;
                    break;
                }else{  //아니면 1씩증가
                    mul++;
                }
            }



            for(int j=1; j<mul;j++){
                if(j==1){
                    continue;
                }
                if(i%j==0){ //나눠지면 소수아님
                    break;
                }
                if(j==mul-1){   //끝까지 루프문 못빠저나갔으면 소수임
                    answer++;
                    //System.out.println(i);
                }
            }


            mul=1;



        }

        //System.out.println(answer);








        return answer;
    }


}
