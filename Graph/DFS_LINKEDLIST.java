package 알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class DFS_LINKEDLIST {
	  static LinkedList<Integer>[] a;
	    static boolean[] visit;
	     
	    public static void main(String args[]) {
	 
	        Scanner sc = new Scanner(System.in);
	 
	        int n = sc.nextInt();   //정점의 수
	        int m = sc.nextInt();   //간선의 수
	        int start = sc.nextInt();//시작할 정점
	 
	        a = new LinkedList[n+1];     //인덱스 편의상 n+1를 하고, 0번째 요소는 사용하지 않음
	        visit = new boolean[n+1];   //인덱스 편의상 n+1를 하고, 0번째 요소는 사용하지 않음
	         
	        for (int i=1; i<=n; i++) {
	            a[i] = new LinkedList<Integer>();
	        }
	 
	        for (int i=0; i<m; i++) {
	            int u = sc.nextInt();   //간선으로 이어진 정점1
	            int v = sc.nextInt();   //정점1과 간선으로 이어진 정점2
	            //양뱡향일 경우 양쪽다 저장해준다.
	            a[u].add(v);
	            a[v].add(u);
	        }
	 
	       
	        dfs(start);
	         
	        
	    }
	     
	     
	    public static void dfs(int x) {
	    
	        visit[x] = true;
	        System.out.print(x + " ");
	         
	        for (int y : a[x]) {
	            if (visit[y] == false) {
	                dfs(y);
	            }
	        }
	    }
	
	
}
