package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_1697 {						//���ٲ���
	static int[] ar=new int[100001];
	
	public static void bfs(int n,int finish) {
		Queue<Integer> qu=new LinkedList<Integer>();
		qu.add(n);			//ó�� ���� ������ �Է�
		ar[n]=1;
		while(!qu.isEmpty()) {
			
			/*	-1,+1,*2 ��츦 ��� ť�� �Է�
			 * �ִ� 100000�̱� ������ �̰ͺ��� 1��ŭ ��ū �迭�� ����
			 * �迭�� ���� 0�� �ƴҰ�쿡�� �ٳణ��
			 * �迭���� Ƚ������ ����
			 */
			n=qu.poll();
			if(n==finish) 
				break;
			if(n+1<=100000&&ar[n+1]==0) {
				qu.add(n+1);
				ar[n+1]=ar[n]+1;
			}
			if(n-1>=0&&ar[n-1]==0) {
				qu.add(n-1);
				ar[n-1]=ar[n]+1;
			}
			if(n*2<=100000&&ar[n*2]==0) {
				qu.add(n*2);
				ar[n*2]=ar[n];
			}
			
		}
		System.out.println(ar[n]-1);		//�ٳణ������ ǥ���ϱ� ���� 1���� �����߱⶧���� -1�� ���ش�.
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		int start=Integer.parseInt(st.nextToken());		//��������
		int finish=Integer.parseInt(st.nextToken());		//��������
		bfs(start,finish);
		
	}
}


