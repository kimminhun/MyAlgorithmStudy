package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int[] ar=new int[n];
		for (int i = 0; i < n; i++) {
			ar[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(ar);
		long start=1;
		long finish=ar[n-1];
		long mid=0;
		while(start<=finish) {
			mid=(start+finish)/2;
			long ans=0;
			for (int i = 0; i < n; i++) {
				ans+=ar[i]/mid;
			}
			if(ans>=k) {
				start=mid+1;
			}else if(ans<k){
				finish=mid-1;
			}
				
			
		}
		System.out.println(finish);
	}

}
