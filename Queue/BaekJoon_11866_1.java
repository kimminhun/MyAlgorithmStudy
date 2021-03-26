package Que;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BaekJoon_11866_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		StringTokenizer sb= null;
		sb=new StringTokenizer(br.readLine()," ");
		int num1,num2,tmp;
		Deque<Integer> qu=new LinkedList<Integer>();
		for (int i = 1; i <= 7; i++) {
			qu.offer(i);
		}
		st.append('<');

		while(qu.isEmpty()==false) {
			
				num1=	qu.poll();
				num2=qu.poll();
				tmp=qu.poll();
				st.append(tmp).append(",");
				qu.offer(num1);
				qu.offer(num2);
			
		}
		st.append('>');
		System.out.println(st);		
	}
}
