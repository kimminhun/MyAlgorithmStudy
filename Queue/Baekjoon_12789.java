package Que;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon_12789 {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> que=new LinkedList<Integer>();
		Stack<Integer> stk=new Stack<Integer>();
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < n; i++) {
			que.add(Integer.parseInt(st.nextToken()));
		}
		int cnt=1;
		while(true) {
			if(!que.isEmpty()&&que.peek()==cnt) {
				que.poll();
				cnt++;
			}else if(!stk.isEmpty()&&stk.peek()==cnt) {
				stk.pop();
				cnt++;
			}else if(que.isEmpty()) {
				System.out.println("Sad");
				break;
			}else {
				stk.push(que.peek());
				que.poll();
			}
			if(cnt>n) {
				System.out.println("Nice");
				break;
			}
		}
	}

}
