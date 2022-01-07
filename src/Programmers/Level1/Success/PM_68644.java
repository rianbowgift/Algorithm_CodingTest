package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/68644
//비효율적임
import java.util.ArrayList;

public class PM_68644 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> nums = new ArrayList<>();


        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){

                if(i==0 && j==1){
                    nums.add(numbers[i] + numbers[j]);
                    continue;
                }
                if(j==i){   //자기자신을 더하진않음
                    continue;
                }

                for(int k=0; k<nums.size();k++){
                    if(nums.get(k)==(numbers[i] + numbers[j])){
                        continue;
                    }
                    if(k == nums.size()-1){
                        if(nums.get(k)==(numbers[i] + numbers[j])){
                            break;
                        }else{
                            nums.add(numbers[i] + numbers[j]);
                        }

                    }
                }
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(Integer item : nums){
            if(!arrayList.contains(item))
                arrayList.add(item);
        }





        answer = new int[arrayList.size()];
        for(int i=0; i<arrayList.size();i++){
            answer[i] = arrayList.get(i);
        }

        for(int i=0;i<answer.length;i++){
            for(int j=0; j<answer.length-1;j++){
                if(answer[j]> answer[j+1]){
                    int temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }
            }
        }

        return answer;
    }

}
