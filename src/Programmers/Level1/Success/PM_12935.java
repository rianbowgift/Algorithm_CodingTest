package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12935
public class PM_12935 {
    public int[] solution(int[] arr) {
        int[] answer;
        int min =100000000;
        int temp = 0;

        if(arr.length==1){      //1길이는 미리빼둔다.
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        answer = new int[arr.length-1];

        for(int i=0; i<arr.length;i++){

            if(arr[i]< min){
                min = arr[i];
            }
        }

        for(int j=0; j<arr.length;j++){
            if(arr[j]==min){
                temp++;
                continue;
            }else{
                answer[j-temp] = arr[j];
            }
        }



        return answer;
    }


}
