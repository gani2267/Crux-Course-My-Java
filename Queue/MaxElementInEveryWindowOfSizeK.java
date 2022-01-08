package Queue;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxElementInEveryWindowOfSizeK {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = takeInput();
		int k = sc.nextInt();
		displayAns(arr, k);
	}

	public static void displayAns(int[] a, int k) {

		Deque<Integer> q = new LinkedList<>();

		for (int i = 0; i < k; i++) {

			while (!q.isEmpty() && a[i] > a[q.getLast()]) {
				q.removeLast();
			}

			q.addLast(i);
		}

		for (int i = k; i < a.length; i++) {
			System.out.print(a[q.getFirst()] + " ");

			while (q.getFirst() <= (i - k)) {
				q.removeFirst();
			}

			while (!q.isEmpty() && a[i] > a[q.getLast()]) {
				q.removeLast();
			}

			q.addLast(i);
		}

		System.out.print(a[q.getFirst()] + " ");
	}

	public static int[] takeInput() {

		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		return arr;
	}

}
