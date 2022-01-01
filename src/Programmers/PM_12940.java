package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12940

public class PM_12940 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big = 0;
        int small =0;
        int count=0;

        if(n>m){
            big = n;
            small = m;
        }else {
            big = m;
            small = n;
        }

        for(int i=big; i>=1; i--){      //최대공약수
            if(big%i==0 && small%i==0){
                answer[0] = i;
                break;
            }
        }

        for(int i=1; i<=big; i++){       //최소공배수
            for(int j=1; j<=big; j++){
                if(small*j==big*i){
                    answer[1] = small*j;
                    count++;
                    break;
                }
            }
            if(count==1){
                break;
            }
        }








        return answer;
    }


}
