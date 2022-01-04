package Programmers.Level1.Success;

import java.util.ArrayList;

//https://programmers.co.kr/learn/courses/30/lessons/64061
public class PM_64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> queue = new ArrayList<>();



        for(int i=0; i<moves.length;i++){
            for(int j=0; j<board.length;j++){   //가로로 몇번째를 뽑을지는 정해짐. j는 세로뽑기임
                if(board[j][moves[i]-1]==0){
                    continue;
                }else{
                    queue.add(board[j][moves[i]-1]); //큐에 추가후 제거
                    board[j][moves[i]-1] = 0;
                    break;
                }

            }
        }




        //큐에 스택을쌓는파트


//        queue.clear();
//
//        queue.add(1);
//        queue.add(1);
//        queue.add(1);
//        queue.add(1);

//        for(int x=0; x< queue.size();x++){
//            System.out.print(queue.get(x));
//        }


        int init=0;
        while(true){
            if(queue.size()<2){        //2보다 사이즈가 작다면 그대로패스.(1이거나 0이므로)  2보다크다면 정리시작
                break;
            }else if(queue.size()>=2){
                if(queue.get(init)==queue.get(init+1)){
                    queue.remove(init);
                    queue.remove(init);

                    answer+=2;
                    init=0;
                }else{
                    init++;
                }

                if(init+2==queue.size()){
                    if(queue.get(init)==queue.get(init+1)){
                        queue.remove(init);
                        queue.remove(init);

                        answer+=2;
                        init=0;
                    }else{
                        init++;
                    }
                    break;
                }
                //System.out.println("hi");

            }


        }



        //큐를 처리하는부분







        return answer;
    }

}
