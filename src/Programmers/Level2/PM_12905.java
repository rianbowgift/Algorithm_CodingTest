package Programmers.Level2;
//https://programmers.co.kr/learn/courses/30/lessons/12905
public class PM_12905 {
    public int solution(int [][]board)
    {
        int answer = 0;
        int max_size = 0;
        int start = -1; //시작점 포인트
        int end = -1;   //끝점 포인트

        for(int i=0;i<board.length-max_size;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==1 && start==-1){        //스타트포인트가 초기화된상태 && 현재 가르키는곳이 1이면
                    start=j;
                }

                if((board[i][j]==0 && start!=-1)  ||  (board[0].length-1==j && start!=-1)){ //현재 가르키는곳이 0이고 start 포인트가 할당되있을때
                                                                                    // 또는 지금이 j의 마지막이며 start 포인트가 할당되었을때

                    end=j-1;        //board[i[j]가 0일경우 바로이전까지가 범위이므로 -1
                    if(board[0].length-1==j){   //단, 마지막까지 탐색하여 자동종료될경우 -1취소
                        end++;
                    }
                }

                if(start!=-1 && end!=-1){       //스타트포인트와 엔드포인트가 모두 할당됬을때   공간계산시작

                    //잔여공간 확인
                    if(end-start<i+board.length){

                    }
                }
            }
        }







        answer=max_size*max_size;
        return answer;
    }
}
