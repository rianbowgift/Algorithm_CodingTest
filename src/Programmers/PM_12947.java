package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12947
public class PM_12947 {

    public boolean solution(int x) {
        boolean answer = true;
        int[] hshad = new int[5];
        int sum = 0;
        int x_save = x;
        for(int j=0;j<hshad.length;j++){
            hshad[j] = -1;
        }


        for(int i=0; i<hshad.length;i++){
            if(x>=10){
                hshad[i] = x%10;
                x /= 10;
            }else{
                hshad[i] = x;
                break;
            }

           // System.out.println(hshad[i]);
        }


        for(int i=0; i<hshad.length;i++){       //각자릿수더하기
            if(hshad[i]!=-1){
                sum += hshad[i];
            }else{
                break;
            }
        }

        if(x_save%sum==0){
            answer = true;
        }else{
            answer = false;
        }




        return answer;
    }


}
