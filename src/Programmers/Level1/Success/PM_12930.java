package Programmers.Level1.Success;
//https://programmers.co.kr/learn/courses/30/lessons/12930

public class PM_12930 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "try hello world";
        String answer = "";
        String temp = "";
        
        int even_num = 2; //짝수인지 나타냄
        
        
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i)!=' ') {	//공백이 아닐경우
        		if(even_num/2*2==even_num) {	//짝수일경우
        			temp = s.substring(i,i+1);
        			answer += temp.toUpperCase();
        			even_num++;
        		}else {	//홀수일경우
        			temp = s.substring(i,i+1);
        			answer += temp.toLowerCase();
        			even_num++;
        		}
        	}else {	//공백일경우
    			answer += " ";
        		even_num=2;//짝수카운터초기화
        		
        	}
        }
        
        
        
        System.out.println(answer);
        
        //return answer;
	}

}
