package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/42748
public class PM_42748 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];


        for(int i=0; i<commands.length;i++){

            int start = commands[i][0];
            int end = commands[i][1];
            int order = commands[i][2]-1;
            int[] temp_array = new int[end-start+1];

            for(int j=0;j<temp_array.length;j++){
                temp_array[j] = array[start+j-1];
//                System.out.print(temp_array[j] + " ");
            }

            for(int p=0; p<temp_array.length-1;p++){        //정렬
                for(int q=0; q<temp_array.length-1;q++){
                    if(temp_array[q]> temp_array[q+1]){
                        int temp = temp_array[q];
                        temp_array[q] = temp_array[q+1];
                        temp_array[q+1] = temp;
                    }
                }
            }

            answer[i] = temp_array[order];





        }





        return answer;
    }

}
