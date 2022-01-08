package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class FirstNegativeTermInWindowOfSizeK {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			int size = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = takeInput(size);

			process(arr, k);

		}

	}

	public static void process(int[] arr, int m) {

		int ans = 0;
		int n = arr.length;

		Deque<Integer> q = new LinkedList<>();

		for (int i = 0; i < m; i++) {
			if (arr[i] < 0) {
				q.add(i);
			}
		}

		for (int i = m; i < n; i++) {
			if (q.isEmpty()) {
				System.out.print(0 + " ");
			} else {
				System.out.print(arr[q.getFirst()] + " ");
			}

			while (!q.isEmpty() && q.getFirst() <= (i - m)) {
				q.removeFirst();
			}

			if (arr[i] < 0) {
				q.add(i);
			}
		}

		if (q.isEmpty()) {
			System.out.print(0 + " ");
		} else {
			System.out.print(arr[q.getFirst()] + " ");
		}
	}

	public static int[] takeInput(int size) {

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		return arr;
	}

}
