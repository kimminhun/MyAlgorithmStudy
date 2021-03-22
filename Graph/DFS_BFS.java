package 알고리즘;

import java.io.*;
import java.util.*;

public class DFS_BFS {
	
	static int[][] check;			//간선 연결상태
	static boolean[] checked;	//확인 여부
	static int n;					//정점개수
	static int m;				//간선개수
	static int start;			//시작정점
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		start=sc.nextInt();
		
		check=new int[1001][1001];	//좌표를 그래도 받아들이기 위해 +i 선언
		checked = new boolean[1001];
		
		
		for (int i = 0; i < m; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			check[x][y]=check[y][x]=1;
		}
		dfs(start);
		
		checked=new boolean[1001];
		System.out.println();
		
		bfs();
	}
	
	public static void dfs(int x) {
		checked[x]=true;
		System.out.print(x+" ");
		
		for (int i = 1; i <=n; i++) {
			if(check[x][i]==1&&checked[i]==false) {
				dfs(i);
			}
		}
	}
	
	public static void bfs() {
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.offer(start);	//시작점도 queue에 넣어야함
		checked[start]=true;
		System.out.print(start+" ");
		
		while(!queue.isEmpty()) {
			int tmp=queue.poll();
			
			for (int i = 1; i <=n; i++) {
				if(check[tmp][i]==1&&checked[i]==false) {
					queue.offer(i);
					checked[i]=true;
					System.out.print(i+" ");
					
				}
			}
		}
		
	}
	
	
	
	

}
