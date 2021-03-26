package �˰���;

import java.io.*;
import java.util.*;

public class DFS_BFS {
	
	static int[][] check;			//���� �������
	static boolean[] checked;	//Ȯ�� ����
	static int n;					//��������
	static int m;				//��������
	static int start;			//��������
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		start=sc.nextInt();
		
		check=new int[1001][1001];	//��ǥ�� �׷��� �޾Ƶ��̱� ���� +i ����
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
		queue.offer(start);	//�������� queue�� �־����
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
