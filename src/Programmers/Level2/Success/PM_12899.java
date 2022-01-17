package Programmers.Level2.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12899
//한번에 접근하기 어렵다면 예시를 더 만들어보는것도 좋다
//        1 = 0/1	=1
//        2 = 0/2	=2
//        3 = 1/0	=4
//        4 = 1/1  =11
//        5 = 1/2 = 12
//        6 = 2/0	= 14
//        7 = 2/1 = 21
//        8 = 2/2	= 22
//        9 = 3/0	= 24
//        10 = 3/1 = 41
//        11 = 3/2 = 42
//        12 = 4/0 = 44
//        13 = 4/1 = 111
//        14 = 4/2 = 112
//        15 = 5/0 = 114
//        16 = 5/1 = 121
//        17 = 5/2 = 122
//        18 = 6/0 = 124
//        19 = 6/1 = 141
//        20 = 6/2 = 142
//        21 = 7/0 = 144

//String뒤집을때 CharAt을 사용하는것보다 스트링버퍼를 리버스시키는게 빠르다
public class PM_12899 {

    public StringBuffer solution(long n) {
        String answer2 = "";
        //String answer = "";
        long front = 0;
        long end = 0;
        while (true){
            front = n/3;
            end = n%3;
            if(end==0){
                front--;
            }

            if(end==0){
                answer2+=4;
            }else if(end==1){
                answer2+=1;
            }else if(end==2){
                answer2+=2;
            }

            n = front;

            if(front==0){
                break;
            }


        }

        StringBuffer answer = new StringBuffer(answer2).reverse();


//        for(int i=answer2.length()-1;i>-1;i--){
//            answer+= answer2.charAt(i);
//
//        }




        return answer;
    }


}
