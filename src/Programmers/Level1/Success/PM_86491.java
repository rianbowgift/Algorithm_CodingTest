package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/86491
public class PM_86491 {
    public int solution(int[][] sizes) {
        int answer = 0;

        int max =0; //가장큰수
        int big_min =0; //둘중 작은수중 큰수
        //1.모든 배열에서 가장큰수를 찾는다.
        //2.모든 배열 [0,1]중 작은수끼리 비교하여 작은수들중 가장 큰수를 찾는다
        //3.1번과 2번을 곱하여 리턴한다


        for(int i=0;i<sizes.length;i++){
            for(int j=0;j<2;j++){
                if(sizes[i][j] >max){
                    max = sizes[i][j];
                }

                if(j==0){
                    if(sizes[i][j] >sizes[i][j+1] ){
                        if(sizes[i][j+1] > big_min){
                            big_min = sizes[i][j+1];
                        }
                    }else{
                        if(sizes[i][j] > big_min){
                            big_min = sizes[i][j];
                        }
                    }
                }

            }
        }

        answer=big_min*max;









        return answer;
    }

}
