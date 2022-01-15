package Programmers.Level2.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12911
public class PM_12911 {


    public int solution(int n) {
        int answer = 0;
        int origin_nums = 0;

        String n_binary = Integer.toBinaryString(n);
        for(int i=0;i<n_binary.length();i++){
            if(n_binary.charAt(i)=='1'){
                origin_nums++;
            }
        }

        int point=1;
        while(true){
            String binarys = Integer.toBinaryString(n+point);
            int nums = 0;
            for(int i=0;i<binarys.length();i++){
                if(binarys.charAt(i)=='1'){
                    nums++;
                }
            }

            if(nums==origin_nums){
                answer=n+point;
                break;
            }


            point++;
        }



        return answer;
    }


}
