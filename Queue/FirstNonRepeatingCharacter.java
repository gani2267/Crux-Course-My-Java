package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
//		method1();
		
		method2();
		
	}
	
	public static void method1() {
		//kindly use small letter as input
		int[] arr=new int[26];
		
		StringBuilder sb=new StringBuilder();
		int i=0;
		
		char ch='x';
		while(ch != '.') {
			ch =sc.next().charAt(0);
			if(ch== '.') {
				break;
			}
			sb.append(ch);
			arr[(int) ch-97]++;
			
			while(arr[(int) sb.charAt(i) -97 ] != 1){
				i++;
				if(i == sb.length()) {
					System.out.print(-1 + " ");
					break;
				}
			}
			
			if( i < sb.length()   &&(arr[(int) sb.charAt(i) -97 ] == 1)){
				System.out.print(sb.charAt(i)+ " ");
			}
		}
	}
	
	
	
	public static void method2() {
		//kindly use small letter as input
				int[] arr=new int[26];
				
		Queue<Character> q=new LinkedList<>();
		
		char ch='x';
		while(ch != '.') {
			ch =sc.next().charAt(0);
			if(ch== '.') {
				break;
			}
			q.add(ch);
			arr[(int) ch-97]++;
			
			while(arr [(int) q.peek()- 97] !=1 ) {
				q.poll();
				if(q.isEmpty()) {
					System.out.print(-1 + " ");
					break;
				}
			}
			
			if(!q.isEmpty()) {
				System.out.print(q.peek()+" ");
			}
			
		}
		
	}

}
