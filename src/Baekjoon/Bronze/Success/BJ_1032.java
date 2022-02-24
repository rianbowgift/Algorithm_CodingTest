import java.util.Scanner;

public class BJ_1032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] st = new String[n];
		//String[] st_p = new String[1];
		StringBuffer st_p = new StringBuffer();
		for(int i=0; i<n; i++) {
			st[i] = sc.next();
		}
		//입력부
		
		
		for(int i=0; i<n;i++) {
			for(int j=0; j<st[0].length(); j++) {
				if(i==0) {
					st_p.append(st[i]);
					break;
				}
				if(st_p.charAt(j)!=st[i].charAt(j)) {
					st_p.replace(j, j+1, "?");
				}
			}
		}
		
		System.out.println(st_p);
		//비교부
		
	}
	
}
