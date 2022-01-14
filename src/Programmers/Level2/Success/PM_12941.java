package Programmers.Level2.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12941

// temp 를사용하여 위치바꾸는것보다 arrays.sort가 훨씬빠르다. 무조건 array.sort를 쓰자.
import java.util.Arrays;

public class PM_12941 {

    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int count = 0;


        count = A.length-1;
        for(int i=0;i< A.length;i++){
            answer+= A[i] * B[count];
            count--;
        }


        return answer;
    }







//----------------------------------2차시도 시간초과--------------------------------------------

//
//        for(int i=0;i<a_array.size();i++){              //둘다 오름차순
//            for(int j=0;j<a_array.size()-1;j++){
//                if(a_array.get(j) > a_array.get(j+1)){
//                    int temp = a_array.get(j);
//                    a_array.set(j,a_array.get(j+1));
//                    a_array.set(j+1,temp);
//                }
//                if(b_array.get(j) > b_array.get(j+1)){
//                    int temp2 = b_array.get(j);
//                    b_array.set(j,b_array.get(j+1));
//                    b_array.set(j+1,temp2);
//                }
//            }
//        }
//
//
//        count = A.length-1;
//        for(int i=0;i< a_array.size();i++){
//            answer+= a_array.get(i) * b_array.get(count);
//            count--;
//        }
//



//-------------------------------------------------------------------------------------




//-----------------------------------1차시도 시간초과--------------------------------------------

//        for(int i=0;i<a_array.size();i++){              //A[]는 오름차순 정렬
//            for(int j=0;j<a_array.size()-1;j++){
//                if(a_array.get(j) > a_array.get(j+1)){
//                    int temp = a_array.get(j);
//                    a_array.set(j,a_array.get(j+1));
//                    a_array.set(j+1,temp);
//                }
//            }
//        }
//        for(int i=0;i<b_array.size();i++){          //B[]는 내림차순 정렬
//            for(int j=0;j<b_array.size()-1;j++){
//                if(b_array.get(j) < b_array.get(j+1)){
//                    int temp = b_array.get(j);
//                    b_array.set(j,b_array.get(j+1));
//                    b_array.set(j+1,temp);
//                }
//            }
//        }
//
//
//        for(int i=0;i< a_array.size();i++){
//            answer+= a_array.get(i) * b_array.get(i);
//        }

//-------------------------------------------------------------------------------------





}
