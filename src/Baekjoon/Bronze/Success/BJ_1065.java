package Baekjoon.Bronze.Success;/*
 * ù��°�õ��� �ܼ� �����ڰ� �ƴ� if�� �ݺ����� ����ߴµ� Ʋ�ȴٴ� �޼����� ���Դ�.(��ü �׽�Ʈ������ ����)
 * �˰��� ������ ���õ� 21����� �����������ؼ� burfferOverflow�� ���� �����̻� ���� �Էµɽÿ� �ٸ����� �����°��̿���.
 * int�� long���� �����Ͽ� �����Ͽ���
 * 
 * �ð������� �߻��Ͽ� �ι�°�õ����Ͽ���.
 * ���� �����ɸ��Ͱ��� �ڵ�� �ƴ϶�� �����ߴµ� 21��ȸ�� ���ϴ� �Է°��� �´ٸ� while���� 21��ȸ �����ؾ��ϹǷ� �ð������� �߻��ϴ°��̿���.
 * ������ �� ������ �ǵ��� �ݵ�� �ݺ����� �����ʴ°��ε�, ȥ�ڼ� �ذ����� ���ϴ��� ���ͳݿ��� �ܼ� �����ڸ� ����Ͽ� Ǫ�� ����� ã�Ƽ� �����Ͽ���.
 */


import java.util.Scanner;

public class BJ_1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();
		long count = 0;
		
		
		
		while(true) {
			
			long sum = (count*B)+A;
			
			if(count==1) {
				if(B >= C) {
					count=-1;
					break;
				}
			}

			if(sum >= C * count) {

				count++;
				continue;
			}


			
		}
		System.out.println(count);
	}

}
