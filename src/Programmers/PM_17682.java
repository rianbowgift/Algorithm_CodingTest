package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/17682
//다트게임
//어려움
public class PM_17682 {
    public int solution(String dartResult) {
        int answer = 0;
        int counting =0;    //처음에 저장해둔후 계속 꺼내면서 사용한다.
        int[] answer_arr = new int[3];
        int[] answer_option = new int[]{1,1,1};

        //1.숫자부,SDT부, *#부로 나뉜다
        //2.숫자부와 SDT부는 반드시 존재하며 *#부는 없을수도있다
        //3.따라서, 숫자부와 SDT부 확인후, 그다음 문자를 체크하여 숫자라면 continue시켜서 다음횟차라는것을 알린다
        //4.charAt사용시, 숫자부에 1이 입력된다면, 1인지 10인지 구분하기위해 다음문자를 체크해야한다.
        int point=0;
        int point_plus=0;
        int bonus=0;
 //       int option=0;


        for(int i=0; i<3; i++){     //룰렛은 3번까지 진행된다.
            point=0;        //시작할때마다 모두 초기화
            point_plus=0;
            bonus=0;
    //        option=0;

            //숫자부 처리
            if(dartResult.charAt(counting)=='1'){ //1이라면 10인지 1인지 확인한다.
                if(dartResult.charAt(counting+1)=='0'){ //10이라면
                    point_plus=1;       //두자리면 counting을늘려서 자리맞춰줌
                    point=10;
                    counting+= 1+point_plus;
                }else{  //1이라면
                    point=1;
                    counting+= 1;
                }
            }else if(dartResult.charAt(counting)>='0' && dartResult.charAt(counting)<='9'){
                point=dartResult.charAt(counting)-48;
                counting+= 1;
            }

            //counting+= 1+point_plus;//두자리면 counting을늘려서 자리맞춰줌



            //SDT부 처리
            if(dartResult.charAt(counting)=='S'){
                bonus=1;
                counting+= 1;
            }else if(dartResult.charAt(counting)=='D'){
                bonus=2;
                counting+= 1;
            }else if(dartResult.charAt(counting)=='T'){
                bonus=3;
                counting+= 1;
            }



            int temp=0;
            for(int j=0;j<bonus;j++){
                if(temp==0){
                    temp=point;
                }else{
                    temp*=point;
                }
            }
            answer_arr[i] = temp;



            //counting+= 1;
            if(counting>=dartResult.length()){
                break;
            }


            //*#부 처리할지, 숫자부로 점프할지 체크
            if((dartResult.charAt(counting)>='0' && dartResult.charAt(counting)<='9')){   //뒤에 숫자가오면 계산후! - >다음페이즈로


                continue;

            }else{


//1S2D*3T
                //*#부처리     //처음껀지 아닌지 구분해둬서 처음껀 스타상효과 반감
                if(dartResult.charAt(counting)=='*'){
                    if(i==0){
                        answer_option[i] *= 2;
                    }else{
                        answer_option[i-1] *= 2;
                        answer_option[i] *= 2;
                    }
                    //counting+= 1;
                }else if(dartResult.charAt(counting)=='#'){
                    answer_option[i] *= -1;
                    //counting+= 1;
                }

            counting++;



            }










        }

        for(int i=0; i<3;i++){
            answer+= answer_arr[i]*answer_option[i];
        }



        return answer;
    }
}
