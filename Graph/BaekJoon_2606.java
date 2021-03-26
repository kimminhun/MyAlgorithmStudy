package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon_2606 {
	static int[][] check;
	static boolean[] checked;
	static int n;
	static int m;
	static int cnt;
	static ArrayList<Integer> ar;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		check=new int[1001][1001];
		checked=new boolean[1001];
		cnt=0;
		for (int i = 0; i < m; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			check[x][y]=check[y][x]=1;
		}
		dfs(1);
		ar=new ArrayList<Integer>();
		for (int i = 1; i <=n; i++) {
				if(check[1][i]==1) {
					ar.add(i);
				}
		}
		for (int i = 0; i < ar.size(); i++) {
			int tmp=ar.get(i);
			for (int j = 1; j <=n; j++) {
				if(check[tmp][j]==1&& !ar.contains(j)) {
					ar.add(j);
				}
			}
		}
		
	System.out.println(ar.size()-1);
		
		
	}
	
	static void dfs(int x) {
		checked[x]=true;
		for (int i = 1; i <=n; i++) {
			if(check[1][i]==1&& checked[i]==false) {
				dfs(i);
			}
				
		}
	}

}
