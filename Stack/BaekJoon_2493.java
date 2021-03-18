package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//����
public class BaekJoon_2493 {
	public static void main(String[] args) throws IOException {
		 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 int n=Integer.parseInt(br.readLine());
		 StringTokenizer st= new StringTokenizer(br.readLine()," ");
		 int[] ar=new int[n];
		 for (int i = 0; i < n; i++) {
			ar[i]=Integer.parseInt(st.nextToken());
		}
		 Stack<Integer> stk=new Stack<Integer>();
		 for (int i = n-1; i >=0 ; i--) {			//�迭�� ���κп������� ����
			while(!stk.isEmpty()&&ar[stk.peek()]<ar[i]) {
				ar[stk.pop()]=i+1;			//�ε��� �� +1 �� ������ �Է�
			}
			stk.push(i);
		}
		 
		 while(!stk.isEmpty()) {
			 ar[stk.pop()]=0;		//���ÿ� �����ִ� �ε��� ������ �� 0���� 
		 }
		 StringBuilder sb=new StringBuilder();
		 for (int i = 0; i < n; i++) {
			sb.append(ar[i]).append(' ');
		}
		 System.out.println(sb);
		 
	}
	

}
