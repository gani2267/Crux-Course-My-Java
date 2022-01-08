package Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'migratoryBirds' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY arr as parameter.
	 */

//    public static void migratoryBirds(int[] arr,int target,int ss) {
//    	
//    	int count=0;
//    	for(int i=0; i<=arr.length-ss; i++) {
////    		for(int j=i+1; j<=arr.length-1; j++) {
//    			if(target == fxn(arr,i)) {
//    				count++;
////    			
//    		}
//    	}
//    	System.out.println(count);
//    }

}

public class Solution {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int r = sc.nextInt();
		long[][] arr = new long[n1][n2];
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				arr[i][j] = sc.nextLong();
			}
		}

		for (int i = 0; i < r; i++) {
			rotate(arr);
		}

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void rotate(long[][] arr) {

		int min = Math.min(arr.length, arr[0].length);

		for (int i = 0; i <(( min/2)); i++) {
			rotate1(i, i, arr.length - 1 - i, arr[0].length - 1 - i, arr);
		}
	}

	private static void rotate1(int ii, int jj, int kk, int ll, long[][] arr) {

		long a = arr[ii][jj];
		for (int j = jj; j < ll; j++) {
			arr[ii][j] = arr[ii][j + 1];
		}
		for (int i = ii; i < kk; i++) {
			arr[i][ll] = arr[i + 1][ll];
		}
		for (int j = ll; j > jj; j--) {
			arr[kk][j] = arr[kk][j - 1];
		}
		for (int i = kk; i > ii; i--) {
			arr[i][jj] = arr[i - 1][jj];
		}
		arr[ii + 1][jj] = a;
	}
}