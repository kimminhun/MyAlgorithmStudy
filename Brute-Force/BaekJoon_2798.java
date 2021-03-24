package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BaekJoon_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] ar = new int[a];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < a; i++) {
			ar[i] = Integer.parseInt(st.nextToken());
		}
		
		int num = (a * (a - 1) * (a - 2)) / 6;
		ArrayList<Integer> sol=new ArrayList<Integer>();
		int x = 0;
		int sum=0;
		for (int i = 0; i < a - 2; i++) {
			for (int j = i + 1; j < a - 1; j++) {
				for (int j2 = j + 1; j2 < a; j2++) {
					sum= ar[i] + ar[j] + ar[j2];
					if(sum<=b)
					sol.add(sum);
				}
			}

		}

		Collections.sort(sol);
		Collections.reverse(sol);
		System.out.println(sol.get(0));

	}

}
