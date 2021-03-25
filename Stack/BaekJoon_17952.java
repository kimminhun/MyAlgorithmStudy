package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon_17952 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st;
		int score,time;
		int answer=0;
		Stack<Integer> scores=new Stack<Integer>();
		Stack<Integer> times=new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			st=new StringTokenizer(br.readLine()," ");
			int check=Integer.parseInt(st.nextToken());
			if(check==1) {
				score=Integer.parseInt(st.nextToken());
				time=Integer.parseInt(st.nextToken());
				scores.push(score);
				times.push(time-1);
			}else if(check==0&&!times.isEmpty()) {
				int tmp=times.pop();
				times.push(tmp-1);
			}
			if(!times.isEmpty()&&times.peek()==0) {
				times.pop();
				answer+=scores.pop();
			}
			}
		
		System.out.println(answer);
	}

}
