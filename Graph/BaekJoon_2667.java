package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class BaekJoon_2667 {
	static int[][] apart;
	static boolean[][] visit;
	static int n,cnt;
	static int[] dx= {1,-1,0,0};
	static int[] dy= {0,0,1,-1};
	 	 
	 
	static int dfs(int x,int y) {
		visit[x][y]=true;
		for (int i = 0; i < 4; i++) {
			int cx=x+dx[i];
			int cy=y+dy[i];
			if(cx>0&&cy>0&&cx<=n&&cy<=n) {
				if(apart[cx][cy]==1&& !visit[cx][cy]) {
					cnt++;
					dfs(cx,cy);
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) throws IOException{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		apart=new int[n+1][n+1];
		visit=new boolean[n+1][n+1];

		for (int i = 1; i <= n; i++) {
			String input=sc.next();
			for (int j = 1; j <= n; j++) {
					apart[i][j]=input.charAt(j-1)-'0';
				}
			}
		
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <=n ; j++) {
					if(apart[i][j]==1&&!visit[i][j]) {
						cnt=1;
						int val=dfs(i,j);
						ar.add(val);
					}
				}
			}
			System.out.println(ar.size());
			Collections.sort(ar);
			for (int i = 0; i < ar.size(); i++) {
				System.out.println(ar.get(i));
			}
		
		
		}
	}


