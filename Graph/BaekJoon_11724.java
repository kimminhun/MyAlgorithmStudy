package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_11724 {
	static int N,M;
	static int[][] check;
	static boolean[] checked;
	
	public static void dfs(int x) {
		if(checked[x]==true) {
			return;
		}
		else {
		checked[x]=true;
		
		for (int i = 1; i <=N; i++) {
			if(check[x][i]==1) {
				dfs(i);
			}
		}
		}
	}
	
	public static void bfs(int x) {
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.offer(x);	//시작점도 queue에 넣어야함
		checked[x]=true;
		
		while(!queue.isEmpty()) {
			int tmp=queue.poll();
			
			for (int i = 1; i <=N; i++) {
				if(check[tmp][i]==1&&checked[i]==false) {
					queue.offer(i);
					checked[i]=true;
					
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		check = new int[N+1][N+1];
		checked = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			
			check[x][y]=check[y][x]=1;	
		}
		int result=0;
		for(int i = 1; i <= N; i++) {
			if(checked[i] == false) { 
				dfs(i);
				result++;
			}
		}
		System.out.println(result);
		
	}

}
