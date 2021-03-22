package �˰���;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_LIKEDLIST {
	static LinkedList<Integer>[] a;
	static boolean visited[];
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();	//������ ����
		int m=sc.nextInt();	//������ ����
		int v=sc.nextInt();	//Ž���� ������ ������ ��ȣ
		
		 visited=new boolean[n+1];
		a=new LinkedList[n+1];
	
		
		for (int i = 0; i <=n; i++) {
			a[i]=new LinkedList<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			
			a[v1].add(v2);
			a[v2].add(v1);
		}
		
		for (int i = 0; i <=n; i++) {
			Collections.sort(a[i]);
		}
		bfs(v);
		
	}
	
	public static void bfs(int v) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[v]=true;
		queue.add(v);
		
		while(queue.size()!=0) {
			v=queue.poll();
			System.out.print(v+" ");
			
			Iterator<Integer> iter=a[v].listIterator();
			while(iter.hasNext()) {
				int w=iter.next();
				if(!visited[w]) {
					visited[w]=true;
					queue.add(w);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
