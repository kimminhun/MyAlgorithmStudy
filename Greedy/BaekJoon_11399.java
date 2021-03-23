package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] ar = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(st.nextToken());
			ar[i] = m;
		}
		Arrays.sort(ar);
		int i = 0;
		int sum = 0;
		while (i <= n - 2) {
			ar[i + 1] += ar[i];
			i++;
		}

		for (int j = 0; j < n; j++) {
			sum += ar[j];
		}
		System.out.println(sum);

	}

}
