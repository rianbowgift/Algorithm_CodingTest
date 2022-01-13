package Programmers.Level2.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12949
//https://youtu.be/OMA2Mwo0aZg 행렬곱 참고
//https://www.youtube.com/watch?v=JpSe38UHaos&ab_channel=%EA%BC%BC%EC%88%98%ED%95%99 행렬곱 참고
//알고리즘보다 행렬곱에대한 이해가 필요. 가로*세로
//행렬의 곱샘 행렬곱
public class PM_12949 {
    public int[][] solution(int[][] arr1, int[][] arr2) {


        int[][] answer = new int[arr1.length][arr2[0].length];
        int[][] reverse_arr2 = new int[arr2[0].length][arr2.length];

        for(int i=0;i<answer.length;i++){       //초기화
            for(int j=0; j<answer[0].length;j++){
                answer[i][j] = 0;
            }
        }

        //두가지방법 1.arr2를 뒤집는다(계산하기편하게)
        //1.arr2를 뒤집는다(계산하기편하게)
        //2.arr2를 그대로두고 세로로 계산한다
        //첫번째 방법 사용

        for(int i=0;i<arr2.length;i++){     //arr2를 뒤집는다
            for(int j=0; j<arr2[0].length;j++){
                reverse_arr2[j][i] = arr2[i][j];
            }
        }


        for(int k=0;k<arr1.length;k++){     //arr1의 세로를 반복
            for(int i=0;i<reverse_arr2.length;i++){     //arr2의 세로를 반복
                for(int j=0;j<arr1[0].length;j++){ //arr1의 가로를 반복
                     answer[k][i] += arr1[k][j]*reverse_arr2[i][j];
                }
            }
        }







        return answer;
    }


}
