package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_2805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int[] ar= new int[n];
		st=new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < n; i++) {
			ar[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(ar);
		int start=0;
		int finish=ar[n-1];
		int mid=0;
		while(start<=finish) {
			mid=(start+finish)/2;
			
			long sum=0;
			for (int i = 0; i < ar.length; i++) {
				sum+=Math.max(ar[i]-mid, 0);
			}
			if(sum<m) {
				finish=mid-1;
			}else {
				start=mid+1;
			}
			
			if(sum==m) {
				break;
			}
		}
		System.out.println(mid);
		
	}

}
