/*
 * �׸���� ���̳������α׷��� ����. �ݹ� ���߱������� �ҽ��� ���� �������ȵ��. �и� ���ֽ��� �ڵ尡 �������̶� �����ϰ� ã�ƺô�.
 * 
 * 
 */



import java.util.Scanner;

public class BJ_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int five_max=0;
		int five=0;
		int three=0;
		

		if(N!=3 && N<5) {
			System.out.println("-1");
			System.exit(0);
		}
		
		

		
		while(N>=five_max) {
			five_max+=5;
			five++;
			if(N==five_max) {
				System.out.println(five);
				System.exit(0);
			}
		}
		
		while(true) {
			if(five<0) {
				break;
			}

			if(((five*5)+(three*3))==N) {

				System.out.println(five+three);
				System.exit(0);
			}

			five--;
			while(((five*5)+(three*3))<N) {
				

				three++;
			}
				
		}
		System.out.println("-1");
			
			
				
		
	
	}

}
