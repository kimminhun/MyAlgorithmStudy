package Graph;

import java.util.Scanner;

public class BaekJoon_10026 {
	static char[][] ar;
	static boolean[][] visit;
	static int n;
	static int[] dx= {1,-1,0,0};
	static int[] dy= {0,0,1,-1};
	
	static int dfs(int x,int y) {
		visit[x][y]=true;
		char c=ar[x][y];
		for (int i = 0; i < 4; i++) {
			int cx=x+dx[i];
			int cy=y+dy[i];
			if(cx>0&&cy>0&&cx<=n&&cy<=n) {
				if(ar[cx][cy]==c&&!visit[cx][cy]) {
					dfs(cx,cy);
				}
			}
		}
		return 1;
	}
	static int dfs2(int x,int y) {
		visit[x][y]=true;
		char c=ar[x][y];		
		for (int i = 0; i < 4; i++) {
			int cx=x+dx[i];
			int cy=y+dy[i];
			if(cx>0&&cy>0&&cx<=n&&cy<=n) {
				if(c=='R'||c=='G') {
					if((ar[cx][cy]=='R'||ar[cx][cy]=='G')&&!visit[cx][cy]) {
						dfs2(cx,cy);
					}
				}
				else {
					if(ar[cx][cy]==c&&!visit[cx][cy]) {
						dfs2(cx,cy);
					}
				}
				
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ar=new char[n+1][n+1];
		visit=new boolean[n+1][n+1];
		int cnt=0;
		for (int i = 1; i <=n; i++) {
			String str=sc.next();
			for (int j = 1; j <=n; j++) {
				ar[i][j]=str.charAt(j-1);
			}
		}
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(!visit[i][j]) {
					cnt+=dfs(i,j);
				}
			}
		}
		visit=new boolean[n+1][n+1];
		int tmp=0;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(!visit[i][j]) {
					tmp+=dfs2(i,j);
				}
			}
		}
		System.out.printf("%d %d",cnt,tmp);
	
	}

}
