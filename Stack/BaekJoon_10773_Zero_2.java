package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.InputStreamReader;

public class BaekJoon_10773_Zero_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int sum=0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < num; i++) {
			int n=Integer.parseInt(br.readLine());
			if(n==0) {
				stack.pop();
			}
			else
				stack.push(n);
		}
		for (int i : stack) {
			sum+=i;
		}
		System.out.println(sum);
		
				
		
	}

}
