package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12950
//2차원배열 연습하기좋음
public class PM_12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        //int[][] answer = new int[4][4];


        for(int i=0; i<answer.length;i++){
            for(int j=0; j<answer[0].length;j++){
                answer[i][j] = arr1[i][j]+arr2[i][j];
                //System.out.println(answer[i][j]);

            }

        }




        return answer;
    }

}
