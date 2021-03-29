package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_4963 {
	static int[][] ar;
	static boolean[][] visit;
	static int[] dx= {0,1,-1,0,1,-1,-1,1};
	static int[] dy= {1,0,0,-1,1,1,-1,-1};
	static int w,h;
	public static int dfs(int x,int y) {
		visit[x][y]=true;
		for (int i = 0; i < 8; i++) {
			int cx=x+dx[i];
			int cy=y+dy[i];
			if(cx>0&&cy>0&&cx<=h&&cy<=w) {
				if(ar[cx][cy]==1&& !visit[cx][cy]) {
					dfs(cx,cy);
				}
			}
			
		}
		return 1;
	}
	public static void main(String[] args) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			int cnt=0;
			st=new StringTokenizer(br.readLine()," ");
			 w=Integer.parseInt(st.nextToken());
			 h=Integer.parseInt(st.nextToken());
			if(w==0&&h==0) break;
			ar=new int[h+1][w+1];
			visit=new boolean[h+1][w+1];
			
			for (int i = 1; i <= h; i++) {
				st=new StringTokenizer(br.readLine()," ");
				for (int j = 1; j <= w; j++) {
					ar[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= w ; j++) {
					if(ar[i][j]==1&&!visit[i][j]) {
						cnt+=dfs(i,j);
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
