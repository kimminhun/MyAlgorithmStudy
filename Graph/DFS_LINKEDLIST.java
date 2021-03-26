package �˰���;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class DFS_LINKEDLIST {
	  static LinkedList<Integer>[] a;
	    static boolean[] visit;
	     
	    public static void main(String args[]) {
	 
	        Scanner sc = new Scanner(System.in);
	 
	        int n = sc.nextInt();   //������ ��
	        int m = sc.nextInt();   //������ ��
	        int start = sc.nextInt();//������ ����
	 
	        a = new LinkedList[n+1];     //�ε��� ���ǻ� n+1�� �ϰ�, 0��° ��Ҵ� ������� ����
	        visit = new boolean[n+1];   //�ε��� ���ǻ� n+1�� �ϰ�, 0��° ��Ҵ� ������� ����
	         
	        for (int i=1; i<=n; i++) {
	            a[i] = new LinkedList<Integer>();
	        }
	 
	        for (int i=0; i<m; i++) {
	            int u = sc.nextInt();   //�������� �̾��� ����1
	            int v = sc.nextInt();   //����1�� �������� �̾��� ����2
	            //�瓇���� ��� ���ʴ� �������ش�.
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
