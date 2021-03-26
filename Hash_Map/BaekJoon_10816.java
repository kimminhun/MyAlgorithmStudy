package Hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon_10816 {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder	sb=new StringBuilder();
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < n; i++) {
			int num=Integer.parseInt(st.nextToken());
			map.putIfAbsent(num, 0);
			map.replace(num, map.get(num)+1);
		}
		int m=Integer.parseInt(br.readLine());
		
		st=new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < m; i++) {
			int key=Integer.parseInt(st.nextToken());
			if(!map.containsKey(key)) {
				sb.append("0 ");
			} else {
				sb.append(map.get(key)+" ");
			}
		}
		System.out.println(sb);
		
			  
		
		
		
		
	}

}
