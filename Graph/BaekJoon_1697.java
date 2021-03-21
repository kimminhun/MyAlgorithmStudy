package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_1697 {						//숨바꼭질
	static int[] ar=new int[100001];
	
	public static void bfs(int n,int finish) {
		Queue<Integer> qu=new LinkedList<Integer>();
		qu.add(n);			//처음 시작 시점을 입력
		ar[n]=1;
		while(!qu.isEmpty()) {
			
			/*	-1,+1,*2 경우를 모두 큐에 입력
			 * 최대 100000이기 때문에 이것보다 1만큼 더큰 배열을 생성
			 * 배열의 값이 0이 아닐경우에는 다녀간곳
			 * 배열에는 횟수값이 저장
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
		System.out.println(ar[n]-1);		//다녀간곳으로 표시하기 위해 1부터 시작했기때문에 -1을 해준다.
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		int start=Integer.parseInt(st.nextToken());		//시작지점
		int finish=Integer.parseInt(st.nextToken());		//종료지점
		bfs(start,finish);
		
	}
}


