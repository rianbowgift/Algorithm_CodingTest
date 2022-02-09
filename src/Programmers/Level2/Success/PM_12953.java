package Programmers.Level2.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12953
//다풀고나서 찾아보니 https://mainia.tistory.com/2000 gcd함수를 쓰면 최대공약수 최소공배수를 바로 구할수있다고한다. 다음번 문제부터 활용
//좀더 공부하고...
public class PM_12953 {
    public int solution(int[] arr) {
        int answer = 0;
        int numA = 0;   //비교할 대상a
        int numB = 0;   //비교할 대상b




        //arr의 길이는 1이상, 만약 1일경우 자기자신 리턴
        if(arr.length==1){
            return arr[0];
        }


        for(int i=0;i<arr.length;i++){

            int mins = 0; //현재 단계에서의 최소공배수
            int numA_mul = 1;   //몇번 곱할지 저장해둘 임시변수
            int numB_mul = 1;   //몇번 곱할지 저장해둘 임시변수

            if(numA==0 && numB==0){
                //반복문 처음 시작이라면 arr의 0,1번째값을 넣어줌
                numA = arr[i];
                numB = arr[i+1];
            }



            //최소공배수 구하는 공식

            while(true){
                int numA_temp = numA * numA_mul;
                int numB_temp = numB * numB_mul;
                if(numA_temp==numB_temp){ //둘이 같아지면 최소공배수 찾았으므로 바로 탈출
                    mins = numA_temp;
                    break;
                }

                if(numA*numA_mul<numB*numB_mul){
                    numA_mul++;
                }else{
                    numB_mul++;
                }

            }






            if(i+2!=arr.length) { //반복문의 마지막이 아니라면 그다음 numA와 numB를 지정해준다
                numA = mins;
                numB = arr[i+2];
            }else{
                answer = mins;
                break;
            }
        }


        return answer;
    }
}
