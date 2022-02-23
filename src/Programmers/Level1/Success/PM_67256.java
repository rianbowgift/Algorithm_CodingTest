package Programmers.Level1.Success;

public class PM_67256 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
        String answer = "";
		int[] left_finger = new int[2];
		int[] right_finger = new int[2];
		int[] button = new int[2];
        int left_result =0;
        int right_result = 0;
        
        int[][] pad = {{1,4,7,10},{2,5,8,0},{3,6,9,11}}; //숫자
        //* =10 , # = 11
        int[][] hand_pointer = new int[3][4]; //손의위치
        
       
        for(int i=0; i<3; i++) {
        	for (int j=0; j<4; j++) {
        		hand_pointer[i][j] = 0;
        	}
        }
        hand_pointer[2][3] = 1;
        hand_pointer[0][3] = -1;
        //손위치 초기화 -1=왼손  +1=오른손   0=null
        
        for(int nums_len = 0; nums_len <numbers.length; nums_len++) {
        	
        	for(int i=0; i<4; i++) {
        		if(numbers[nums_len]==pad[0][i]) {
        			//group_num = 0;
        			
        			int temp1=0;
        			int temp2=0;
        			
        			
        	        for(int t=0; t<3; t++) {
        	        	for (int j=0; j<4; j++) {
        	        		if(hand_pointer[t][j]==1) {
        	        			temp1 = t;
        	        			temp2 = j;
        	        		}
        	        		hand_pointer[t][j] = 0;
        	        	}
        	        }
        			hand_pointer[0][i] = -1;
        			hand_pointer[temp1][temp2]= 1;
        			answer += "L";
        			
        		}
        	}
        	for(int i=0; i<4; i++) {
        		if(numbers[nums_len]==pad[2][i]) {
        			//group_num = 2;
        			
        			int temp1=0;
        			int temp2=0;
        			
        	        for(int t=0; t<3; t++) {
        	        	for (int j=0; j<4; j++) {
        	        		if(hand_pointer[t][j]==-1) {
        	        			temp1 = t;
        	        			temp2 = j;
        	        		}
        	        		hand_pointer[t][j] = 0;
        	        	}
        	        }
        			hand_pointer[temp1][temp2]= -1;
        			hand_pointer[2][i] = 1;
        			answer += "R";
        			
        		}
        	}
        	for(int i=0; i<4; i++) {
	        	if(numbers[nums_len]==pad[1][i]) {
	        		//group_num=1;

		    	    button[0] = 1;
		    	    button[1] = i;
	        		
	    	        for(int t=0; t<3; t++) {
	    	        	for (int j=0; j<4; j++) {
	    	        		if(hand_pointer[t][j]==-1) {
	    	        			left_finger[0] = t;
	    	        			left_finger[1] = j;
	    	        		}
	    	        		if(hand_pointer[t][j]==1) {
	    	        			right_finger[0] = t;
	    	        			right_finger[1] = j;
	    	        		}
	    	        	}
	    	        }
	    	        //손가락위치 구해서 저장.



	        		//버튼위치 구해서 저장
	    	        if(button[0]>left_finger[0]) {
	    	        	left_result = button[0]-left_finger[0];
	    	        }else {
	    	        	left_result = left_finger[0]-button[0];
	    	        }
	    	        if(button[1]>left_finger[1]) {
	    	        	left_result += button[1]-left_finger[1];
	    	        }else {
	    	        	left_result += left_finger[1]-button[1];
	    	        }
	    	        
	    	        
	    	        if(button[0]>right_finger[0]) {
	    	        	right_result = button[0]-right_finger[0];
	    	        }else {
	    	        	right_result = right_finger[0]-button[0];
	    	        }
	    	        if(button[1]>right_finger[1]) {
	    	        	right_result += button[1]-right_finger[1];
	    	        }else {
	    	        	right_result += right_finger[1]-button[1];
	    	        }
	    	        
	    	       
	    	        
	    	        
	    	        
	    	        for(int t=0; t<3; t++) {
	    	        	for (int j=0; j<4; j++) {
	    	        		hand_pointer[t][j] = 0;
	    	        	}
	    	        }
	    			
	    			
	    			
	    	        
	    	        if(left_result>right_result) {
	        			hand_pointer[1][i] = 1;
	        			hand_pointer[left_finger[0]][left_finger[1]] = -1;
	        			answer += "R";
	    	        }
	    	        if(left_result<right_result) {
	        			hand_pointer[1][i] = -1;
	        			hand_pointer[right_finger[0]][right_finger[1]] = 1;
	        			answer += "L";
	    	        }
	    	        
	    	        if(left_result==right_result) {
	    	        	
	    	        	if(hand.equals("right")) {
	    	        		hand_pointer[1][i] = 1;
	    	        		hand_pointer[left_finger[0]][left_finger[1]] = -1;
	    	        		answer += "R";
	    	        	
	    	        	}else {
	    	        		hand_pointer[1][i] = -1;
	    	        		hand_pointer[right_finger[0]][right_finger[1]] = 1;
	    	        		answer += "L";
	    	        	}
	        			
	        			
	    	        }	   
	    	        

	    	     
	    	        
	      
	    	        //큰거에서 작은거빼기
	    	        
	        		
	    	       
	        	}
	        	
        	}
//        	System.out.print(nums_len +" "+numbers[nums_len] + " " + left_result + " " + right_result);
//        	int[] temp1 = new int[2];
//        	int[] temp2 = new int[2];
//        	for(int t=0; t<3; t++) {
//	        	for (int j=0; j<4; j++) {
//	        		if(hand_pointer[t][j]==-1) {
//	        			temp1[0] = t;
//	        			temp1[1] = j;
//	        		}
//	        		if(hand_pointer[t][j]==1) {
//	        			temp2[0] = t;
//	        			temp2[1] = j;
//	        			
//	        		}
//	        	}
//	        }
//        	System.out.println(" "+temp1[0]+" " + temp1[1] + " " + temp2[0] + " " + temp2[1]);
    		left_finger[0] = 0;
    		left_finger[1] = 0;
    		right_finger[0] = 0;
    		right_finger[1] = 0;
    		button[0] = 0;
    		button[1] = 0;
	        left_result =0;
	        right_result = 0;
        	//1.현재 들어온숫자 판별(1그룹,2그룹,3그룹)
        	

        	//2.만약 1,3그룹이라면 반드시 왼손과 오른손중 한개가 누르므로 제외
        	//2-1. 손위치 변경
        	//3.만약 2그룹이라면 현재 손위치에서 계산시작
        	//3-1. 만약 거리가같다면 어떤손잡이인지 확인
        	//3-2. 손위치 변경
        	//4. 손위치 변경된 손을 answer에 저장
        	
        	

        	
        }
        
     
        
        System.out.println(answer);
        
        
        
        
        //return answer;
	}

}
