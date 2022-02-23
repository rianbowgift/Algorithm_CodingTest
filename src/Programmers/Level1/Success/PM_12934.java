package Programmers.Level1.Success;

public class PM_12934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = 10;
        double answer = 0;
      
        
        int x=1;
       while(true) {
    	   if(n/x==x) {
    		   answer=x;
    		   
    		   answer= (answer+1)*(answer+1);
    		   break;
    	   }
    	   if(n/x<x) {
    		   answer=-1;
    		   break;
    	   }
    	   x++;
    	   
       }
        
        
       
        
        
        
        System.out.println(answer);
        //return answer;
        
        
	}

}
