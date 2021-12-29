package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12906
//테스트케이스 오류. 10~15라인에대한 테스트없음(배열길이 1일때)
public class PM_12906 {
    public int[] solution(int []arr) {
        int[] answer = {};
        int[] answer_shadow = new int[arr.length];  //어레이리스트를 안쓰기위한꼼수
        int hidden_count = 0;   //실제 answer_shadow의 배열번호

        if(arr.length==1){

            answer = new int[1];
            answer[0] = arr[0];
            return answer;
        }


        for(int j=0;j<answer_shadow.length;j++){    //초기화
            answer_shadow[j] = -1;
        }

        for(int i=0;i<arr.length;i++){
            if(i==0){
                answer_shadow[i] = arr[i];
                continue;
            }

            if(answer_shadow[hidden_count] != arr[i]){
                hidden_count++;
                answer_shadow[hidden_count] = arr[i];

            }

        }





        for(int x=0; x<answer_shadow.length;x++){   //answer의 크기정하기
            if(answer_shadow[x]==-1){
                answer = new int[x];
                break;
            }

            if(answer_shadow.length-1 == x){    //만약-1이없다면.. -> arr에 겹치는것이 한개도 없다면
                answer = new int[arr.length];
            }
        }

        for(int q=0;q<answer.length;q++){   //shadow에서 answer로 값옮기기
            answer[q] = answer_shadow[q];
        }






        return answer;
    }

}
