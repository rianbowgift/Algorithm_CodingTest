package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12932
//자리수 바꾸기 자리수 변경
public class PM_12932 {

    public long[] solution(long n) {
        long[] answer_temp = new long[12];
        long[] answer;
 //       long a;
        long b;
        int count=0;

        for(int i=0; i<answer_temp.length;i++){      //-1로 초기화
            answer_temp[i] = -1;
        }

        while(true){        //배열로 넣기
            if(count==0){
                b= n%10;
            }else{
                n = n/10;
                b = n%10;
            }

            if(n>=10){
                answer_temp[count] = b;
            }else{
                answer_temp[count] = b;
                count++;
                break;
            }
            count++;
        }

        answer = new long[count];

        for(int i=0; i<count;i++){
            answer[i] = answer_temp[i];
        }






        return answer;
    }

}
