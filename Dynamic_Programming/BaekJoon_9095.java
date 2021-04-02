package dp;

import java.util.Scanner;

public class BaekJoon_9095 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[12];
		ar[1]=1; ar[2]=2; ar[3]=4;
		int c=sc.nextInt();
		for (int i = 4; i < 12; i++) {
			ar[i]=ar[i-3]+ar[i-2]+ar[i-1];
		}
		for (int j = 0; j < c; j++) {
			int a=sc.nextInt();
			System.out.println(ar[a]);
		}
	}
}
