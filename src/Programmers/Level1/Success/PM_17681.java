package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/17681
//진수변경
public class PM_17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] arr1_str = new String[arr1.length];
        String[] arr2_str = new String[arr2.length];
        String[] answer = new String[arr1.length];

        for(int i=0;i<answer.length;i++){   //초기화
            answer[i] = "";
        }


        //1. 글자수 n으로 맞추며 2진수로 저장하기

        for(int i=0;i<arr1.length;i++){
            arr1_str[i] = Integer.toBinaryString(arr1[i]);

            if(arr1_str[i].length() <n){    //자릿수 맞추기
                int sub = n-arr1_str[i].length();
                String temp = "";
                String arr1_temp = arr1_str[i];
                for(int k=0;k<sub;k++){
                    temp+= "0";
                }
                arr1_str[i] = temp + arr1_temp;
            }
        }

        for(int i=0;i<arr2.length;i++){
            arr2_str[i] = Integer.toBinaryString(arr2[i]);

            if(arr2_str[i].length() <n){    //자릿수 맞추기
                int sub = n-arr2_str[i].length();
                String temp = "";
                String arr2_temp = arr2_str[i];
                for(int k=0;k<sub;k++){
                    temp+= "0";
                }
                arr2_str[i] = temp + arr2_temp;
            }
        }




        //2.arr1과arr2 비교하여 answer작성



        for(int i=0;i<arr1_str.length;i++){ //각 배열의 원소 반복
            for(int j=0;j<n;j++){   //각 원소의 숫자길이만큼 반복(n값)
                if((arr1_str[i].charAt(j) == '0')  && (arr2_str[i].charAt(j) == '0') ){ //둘다 0일경우만
                    answer[i] += ' ';
                }else{ //둘중 하나가 0이 아닐경우 #
                    answer[i] += '#';
                }
            }
        }









        return answer;
    }

}
