package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1669 {
	public static void main(String[] args) throws IOException{
		int[] ar;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		ar=new int[n+1];
		ar[1]=1;
		for (int i = 2; i <=n ; i++) {
			ar[i]=i;
			for (int j = 1; j*j <= i; j++) {
				ar[i]=Math.min(ar[i-(j*j)]+1, ar[i]);
			}
		}
		System.out.println(ar[n]);
	}

}
