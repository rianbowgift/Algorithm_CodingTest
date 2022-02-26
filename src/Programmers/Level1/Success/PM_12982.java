package Programmers.Level1.Success;

import java.util.Arrays;

public class PM_12982 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = {2,2,3,3};
		int budget = 10;
		int answer = 0;
		int temp_value = 0;
		Arrays.sort(d);
		
		
		
		for(int i=0; i<d.length;i++) {
			answer+=1;
			temp_value +=d[i];
			
			//System.out.println(answer);
			if(temp_value>budget) {
				answer-=1;
				break;
			}
		}
		System.out.println(answer);
        //return answer;
	}

}
