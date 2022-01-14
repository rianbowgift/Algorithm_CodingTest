package Programmers.Level2;
//https://programmers.co.kr/learn/courses/30/lessons/12913

public class PM_12913 {
    public int solution(int[][] land) {
        int answer = 0;
        int max = 0;
        int second = 0;
        int back_num = -1;
        int max_num = 0;
        int second_num = 0;
        int[][] land2;
        land2 = land.clone();

//        for(int i=land.length-1;i>-1;i--){
//            for(int j=0;j<4;j++){
//                land[]
//            }
//        }



        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[i].length;j++){
                if(land[i][j]>=max){
                    int temp = max;
                    int temp2 = max_num;
                    max=land[i][j];
                    max_num = j;
                    second = temp;
                    second_num = temp2;

                }
                if(land[i][j] < max && land[i][j] > second){
                    second = land[i][j];
                    second_num = j;
                }

                if(j==land[0].length-1){   //4번째 값까지 max와 second에 입력 했으면
                    if(back_num==-1){   //첫수면 무조건 max입력
                        answer+=max;
                        back_num=max_num;
                    }else{
                        if(back_num==max_num){
                            answer+=second;
                            back_num = second_num;
                        }else{
                            answer+=max;
                            back_num = max_num;
                        }
                    }

                }

            }
            max=0;
            second=0;
        }

        int answer2 = 0;
        max = 0;
        second = 0;
        back_num = -1;
        max_num = 0;
        second_num = 0;




        for(int i=0;i<land2.length;i++){
            for(int j=0;j<land2[i].length;j++){
                if(land2[i][j]>=max){
                    int temp = max;
                    int temp2 = max_num;
                    max=land2[i][j];
                    max_num = j;
                    second = temp;
                    second_num = temp2;

                }
                if(land2[i][j] < max && land2[i][j] > second){
                    second = land2[i][j];
                    second_num = j;
                }

                if(j==land2[0].length-1){   //4번째 값까지 max와 second에 입력 했으면
                    if(back_num==-1){   //첫수면 무조건 max입력
                        answer2+=max;
                        back_num=max_num;
                    }else{
                        if(back_num==max_num){
                            answer2+=second;
                            back_num = second_num;
                        }else{
                            answer2+=max;
                            back_num = max_num;
                        }
                    }

                }

            }
            max=0;
            second=0;
        }

        if(answer>answer2){
            return answer;
        }else{
            return answer2;
        }



        //return answer;
    }



}
