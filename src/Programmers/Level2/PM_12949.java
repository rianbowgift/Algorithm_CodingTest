package Programmers.Level2;
//https://programmers.co.kr/learn/courses/30/lessons/12949
//https://youtu.be/OMA2Mwo0aZg 행렬곱 참고
//행렬의 곱샘 행렬곱
public class PM_12949 {
    public int[][] solution(int[][] arr1, int[][] arr2) {


        int[][] answer = new int[arr1.length][arr2.length];

        for(int i=0;i<answer.length;i++){       //초기화
            for(int j=0; j<answer[0].length;j++){
                answer[i][j] = 0;
            }
        }

        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr2.length+1;j++){
                for(int k=0;k<arr2.length+1;k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }



        return answer;
    }


}
