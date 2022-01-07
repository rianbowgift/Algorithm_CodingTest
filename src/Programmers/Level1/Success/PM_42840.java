package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/42840
//비효율적이라 마음에안듬.

public class PM_42840 {
    public int[] solution(int[] answers) {
        int[] answer = {};


        int[][] supo = new int[][]{{1,2,3,4,5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] supo_count = new int[3];
        int[] supo_count_order = new int[]{0,1,2};


        for(int i=0; i<supo.length; i++){       //3번돔

            for(int j=0;j<answers.length;j++){

                int supo_len = supo[i].length;  //현재 supo의 길이저장

                if(supo_len<=j){        //길이넘으면 0부터 다시
                    supo_len = j%supo_len;
                }else{
                    supo_len = j;
                }

                if(supo[i][supo_len]==answers[j]){
                    supo_count[i] +=1;
                }



            }



        }

        //등수계산
        //많이맞춘수로 정렬후 1,2같은지검사, 2,3같은지검사후 결과출력

        for(int i=0;i<supo_count.length;i++){
            for(int j=0;j<supo_count.length-1;j++){
                if(supo_count[j]<supo_count[j+1]){
                    int temp = supo_count[j];
                    int temp_order = supo_count_order[j];
                    supo_count[j] = supo_count[j+1];
                    supo_count_order[j] = supo_count_order[j+1];
                    supo_count[j+1] = temp;
                    supo_count_order[j+1] = temp_order;

                }
            }
        }

        if(supo_count[0]==supo_count[1]){
            if(supo_count[1]==supo_count[2]){
                answer = new int[3];
                answer[0] = supo_count_order[0];
                answer[1] = supo_count_order[1];
                answer[2] = supo_count_order[2];

            }else{
                answer = new int[2];
                answer[0] = supo_count_order[0];
                answer[1] = supo_count_order[1];
            }
        }else{
            answer = new int[1];
            answer[0] = supo_count_order[0];
        }


//        for(int i=0; i<supo_count.length-1;i++){  //큰순서대로 입력
//            if(supo_count[i]!=supo_count[i+1]){
//                answer[i] += supo_count_order[i];
//                break;
//            }else{
//                answer[i] = supo_count_order[i];
//                answer[i+1] = supo_count_order[i+1];
//                continue;
//            }
//        }

        for(int i=0; i<answer.length-1;i++){
            if(answer.length==1){
                break;
            }else{
                if(answer[i] > answer[i+1]){
                    int temp = answer[i];
                    answer[i] = answer[i+1];
                    answer[i+1] = temp;


                }
            }
        }

        for(int i=0;i<answer.length;i++){
            answer[i] +=1;
        }

        

        return answer;
    }



}
