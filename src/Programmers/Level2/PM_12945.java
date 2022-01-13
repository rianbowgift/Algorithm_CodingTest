package Programmers.Level2;
//https://programmers.co.kr/learn/courses/30/lessons/12945
//int 해보고 안되면 long
//long 도안됨. https://programmers.co.kr/questions/11991 이걸 참고하여 문제를 다시 이해
public class PM_12945 {

    public int solution(int n) {
        int answer = 0;

//        피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
//
//        예를들어
//
//        F(2) = F(0) + F(1) = 0 + 1 = 1
//        F(3) = F(1) + F(2) = 1 + 1 = 2
//        F(4) = F(2) + F(3) = 1 + 2 = 3
//        F(5) = F(3) + F(4) = 2 + 3 = 5

        answer = recursion(n);


        return answer;
    }




    public int recursion(int n){

        if(n ==0){
            return 0;
        }else if( n==1){
            return 1;
        }else{

            return ((recursion(n-1)%1234567) + (recursion(n-2)%1234567))%1234567;
        }


    }


}
