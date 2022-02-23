package Programmers.Level1.Success;

public class PM_77484 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int[] answer = {0,0};
		int rank =6;
		int sub_rank =0;
		
		for(int i=0; i<6;i++) {
			if(lottos[i] ==0) {
				sub_rank++;
			}
		}
		
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(lottos[i]==win_nums[j]) {
					rank--;
					break;
				}
			}
		}
		
		if(rank!=6) {
			rank+=1;
		}
		
		if(sub_rank==6) {
			sub_rank-=1;
		}
		
		answer[0] = rank-sub_rank;
		answer[1] = rank;
		
		System.out.println(answer[0] + " " + answer[1]);
		
		//return answer;
		
	}

}
