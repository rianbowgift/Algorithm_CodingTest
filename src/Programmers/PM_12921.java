package Programmers;

import java.util.ArrayList;

//https://programmers.co.kr/learn/courses/30/lessons/12921
//에라토니스의체 알고리즘 사용
public class PM_12921 {

    public int solution(int n) {
        int answer = 0;
        int[] list = new int[n];
        int temp =0;
        int original = 0;

        for(int i=0; i<n;i++){      //각배열에 값넣음
            list[i] = i+1;  //2부터시작
        }


        for(int i=0; i<list.length;i++){
            if(list[i]==-1){    //소수가 아니라고 판별된수는 바로패스
                continue;
            }else{
                if(list[i]==1){ //1은패스. 2부터시작
                    list[i] = -1;
                    continue;
                }
                original = list[i];
                while (true){
                    if(temp+original<=list.length){
                        if(temp==0){
                            temp+=original;
                        }else{
                            list[i+temp]=-1;
                            temp+=original;
                        }
                    }else{
                        break;
                    }
                }


            }
            temp=0;
            original=0;

        }

        for(int i=0;i<list.length;i++){
            if(list[i]!=-1){
                answer++;
            }
        }










        return answer;
    }


}
