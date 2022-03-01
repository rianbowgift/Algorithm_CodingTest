package ETC;

public class SK_Test_1 {

    public static void main(String[] args){

        int[][] v = new int[][] {{1,1}, {2,2}, {2,1} };
        int[] answer = new int[2];



        if(v[0][0]==v[1][0]){
            answer[0] = v[0][1];
            answer[1] = v[2][0];
        }
        if(v[0][1]==v[1][1]){
            answer[0] = v[0][0];
            answer[1] = v[2][1];

        }else{
            answer[0] = v[2][0];
            answer[1] = v[2][1];
        }







        System.out.println(answer[0] + " " + answer[1]);

    }

}
