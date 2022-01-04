package Programmers.Level1.Success;

//https://programmers.co.kr/learn/courses/30/lessons/12977?language=java
public class PM_12977 {
    public int solution(int[] nums) {
        int answer = 0;
        int pointer_one=0;
        int pointer_two=1;
        int pointer_three=2;


        while(true){
            int break_count=0;
            if(pointer_one==nums.length-3 && pointer_two==nums.length-2 && pointer_three==nums.length-1){
                break_count=1;  //마지막 행동이라면 미리 체크해둠
            }
            int sum = nums[pointer_one] + nums[pointer_two] + nums[pointer_three];  //현재 포인터가 가르키는위치 더함
            int sum_sosu = 0;   //sum이 소수라고 가정후 for문실행. 아니라면 1로바뀜
            for(int i=2; i<sum; i++){   //sum이 소수인지 검증
                if(sum%i==0){
                    sum_sosu=1;
                    break;  //중간에 소수아니면 바로나감
                }
            }
            if(sum_sosu==0){
                answer+=1;  //만약 for문검사후 sum이 소수면 정답에 1개추가

            }

            if(break_count==1){
                break;
            }

            if(pointer_three<nums.length-1){
                pointer_three++;
            }else if(pointer_two<pointer_three-1){
                pointer_two++;
                pointer_three=pointer_two+1;
            }else if(pointer_one<pointer_two-1){
                pointer_one++;
                pointer_two=pointer_one+1;
                pointer_three=pointer_two+1;
            }

        }


        return answer;
    }

}
