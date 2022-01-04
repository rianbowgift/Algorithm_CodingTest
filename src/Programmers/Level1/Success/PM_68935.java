package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/68935
public class PM_68935 {
    public int solution(int n) {
        int answer = 0;
        String phase1 = "";



        //3진법으로 변환  +  변환된3진법 뒤집기
        while(true){
            if(n<3){
                phase1 += n;
                break;
            }
            if(n>=3){
                if(n%3==0){ // 깔끔하게 나눠떨어지면 0, 아니면?
                    phase1 += 0;
                    n /= 3;
                }else if(n%3==1){
                    phase1 += 1;
                    n /= 3;

                }else if(n%3==2){
                    phase1 += 2;
                    n /= 3;

                }
            }
//            System.out.print(n);
//            System.out.println(" 문자열 " + phase1);

        }

        //System.out.println(phase1);


        if(phase1.length()==1){
            answer = Integer.parseInt(phase1);
        }else {
            for (int i = 0; i < phase1.length() - 1; i++) {

                int x = Integer.parseInt(phase1.substring(i, i + 1));
                answer = (answer + x) * 3;


            }
            answer += Integer.parseInt(phase1.substring(phase1.length()-1, phase1.length()));

        }

        System.out.println(answer);








        return answer;
    }
}
