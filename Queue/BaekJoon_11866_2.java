package Que;

import java.util.LinkedList;
import java.util.Scanner;

public class BaekJoon_11866_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		int idx=0;
		int n=sc.nextInt();
		int k=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			list.add(i);
		}
		StringBuilder sb=new StringBuilder();
		sb.append('<');
		while(list.size()>1) {
			idx=(idx+(k-1))%list.size();
			sb.append(list.remove(idx)).append(", ");
		}
		
		sb.append(list.remove()).append('>');
		System.out.println(sb);
	
	}
}
