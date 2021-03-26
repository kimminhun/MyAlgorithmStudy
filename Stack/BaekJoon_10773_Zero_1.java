package problem;

import java.util.Scanner;

public class BaekJoon_10773_Zero_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int[] ar=new int[num];
		int str=-1;
		int sum=0;
		for (int i = 0; i <num; i++) {
			int n=sc.nextInt();
			if(n==0) {
				str--;
			}
			else {
				str++;
				ar[str]=n;
			}
			
		}
		for (int i = 0; i < str+1; i++) {
			sum+=ar[i];
		}
		System.out.println(sum);
	}
}
