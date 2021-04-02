package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_11727 {
	//bottom-up
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] ar=new int[n+1];
		ar[0]=ar[1]=1;
		for (int i = 2; i < n+1; i++) {
			ar[i]=2*ar[i-2]+ar[i-1];
			ar[i]%=10007;
		}
		System.out.println(ar[n]);
	}

}
