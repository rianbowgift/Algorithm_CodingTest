package Programmers.Level2;
//https://programmers.co.kr/learn/courses/30/lessons/12905
public class PM_12905 {
    public int solution(int [][]board)
    {
        int answer = 0;
        int max_size = 0;
        int start =-1;      //j 0번째를 저장할때를 생각하여 -1을 초기값으로 설정
        int end = -1;
        int back_check=0;
        int one_check =0;

        for(int i=0;i<board.length;i++){
            for(int j=0; j<board[0].length;j++){

                if(board[i][j]==1 && start==-1){     //현재 수가 1이고 start 변수가 0일때(처음으로 스타트시작했을때
                    start=j;
                    one_check=1;
                }
                if((board[i][j]==0 && start!=-1) || j==board[0].length-1){     //현재 수가 0이고 start 변수가 0이 아닐떄(start지점을 만들어뒀을때), 또는 j가 마지막까지 도달했을때
                    end=j-1;        //0을만났다면 해당지점은 포함안되므로 -1
                    if(j==board[0].length-1){
                        end++;      //그런데 j가 마지막이라 0없이끝났으면 다시1더해줌
                    }
                }

                if(start!=-1 && end!=-1){         //start 변수와 end변수가 모두 정해젔다면 시작
                    if(end-start>max_size){      //현재까지 구한 최대사이즈보다 방금 구한게 더 커질 가능성이 있다면 시작

                        //1.오버플로우 방지 길이확인.
                        if(i+(end-start+1) <= board.length){        //크기확보를 했다면 정사각형인지 확인

                            for(int p=i;p<=i+end-start;p++){     //전부 1인지 확인
                                for(int q=start; q<=end; q++){
                                    if(board[p][q]!=1){     //1이 한개라도 아니라면 탈출
                                        start=-1;
                                        end=-1;
                                        back_check=1;
                                        break;
                                    }
                                }
                                if(back_check==1){
                                    break;
                                }
                                if(p==(i+end-start)){   //마지막까지 다 1이였다면
                                    max_size=end-start+1;
                                }
                            }





                        }else{      //크기가 부족하다면 시작하지말고 초기화
                            start=-1;
                            end=-1;
                        }




                    }else{      //더 작다면 시작하지말고 초기화후 처음부터
                        start=-1;
                        end=-1;
                    }

                }

            }
            start=-1;
            end=-1;
        }


        answer=max_size*max_size;
        if(one_check==1 && answer==0){
            answer=1;
        }
        return answer;
    }
}
