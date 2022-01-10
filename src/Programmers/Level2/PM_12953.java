package Programmers.Level2;
//https://programmers.co.kr/learn/courses/30/lessons/12953

public class PM_12953 {
    public int solution(int[] arr) {
        int answer = 0;
        int max = 0;
        //1.arr정렬(큰수가 앞으로.반대로해도 상관없음) 후 가장큰수 max변수에 저장
        int bigcount=1;
        int smallcount=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        max = arr[0];   //가장큰수 max에저장

        //2.정렬된arr 가장큰수와 두번째비교, 나온값을 3번째와비교...반복

        for(int i=0;i<arr.length-1;i++){  //가장큰수부터 맨뒤까지 반복하며 최소공배수를계산한다.


            for(int j=max;j<max*arr[i+1];){   //14로 시작한다면 14, 28 42 56 ...
                for(int k=arr[i+1];k<=max*arr[i+1];smallcount++){
                    if(max < k*smallcount){
                        break;
                    }

                    if(k*smallcount==max){
                        max = k*smallcount;
                        break;
                    }else{
                        k = arr[i+1] * smallcount;
                    }

                }

                bigcount++;
                max=max*bigcount;



            }
            bigcount=1;
            smallcount=1;


        }

        System.out.println(max);




        return answer;
    }
}
