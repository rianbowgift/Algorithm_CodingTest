package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12933
//Long.parseLong 사용을 안해서 오류남
public class PM_12933 {
    public long solution(long n) {
        long answer = 0;
        long[] list= new long[11];
        String answer_st = "";


        for(int i=0;i<list.length;i++){ //-1로 초기화
            list[i] = -1;
        }


        for(int i=0;i<list.length;i++){ //리스트에 숫자넣기
            if(n<10){
                list[i] = n;
                break;
            }else{
                list[i] = n%10;
                n = n/10;
            }
        }

        for(int i=0; i<list.length; i++){   //정렬
            for(int j=0; j<list.length-1; j++){
                if(list[j] < list[j+1]){
                    long temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }


        for(int i=0; i<list.length;i++){    //초기화된-1값삭제
            if(list[i]==-1){
                break;
            }else{
                answer_st += list[i];
            }
        }
       // long x = Integer.parseInt(answer_st);
        answer = Long.parseLong(answer_st);


        return answer;
    }


}
