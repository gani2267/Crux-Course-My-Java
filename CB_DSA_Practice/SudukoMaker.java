package CB_DSA_Practice;

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

public class SudukoMaker {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<HashMap<Integer,Integer>> ah=new ArrayList<>();
	static ArrayList<HashMap<Integer,Integer>> ah2=new ArrayList<>();
	static ArrayList<HashMap<Integer,Integer>> block=new ArrayList<>();

	public static void main(String[] args) throws IOException {

		int n = sc.nextInt();
		int[][] suduko = new int[n][n];
		
		for(int i=0; i< n; i++) {
			ah.add(new HashMap<>());
			ah2.add(new HashMap<>());
			block.add(new HashMap<>());
		}

		takeInput(suduko);
		sudukoSolver(suduko,0,0);
		display(suduko);
		
//		System.out.println();
//		System.out.println("linewise : ");
//		System.out.println(ah);
//		
//		System.out.println();
//		System.out.println("columnwise : ");
//		System.out.println(ah2);
//		
//		System.out.println();
//		System.out.println("blockwise : ");
//		System.out.println(block);
	}

	


	private static boolean sudukoSolver(int[][] suduko,int i,int j) {
		
		if(j==suduko.length) {
			i++;
			j=0;
		}
		
		if(i==suduko.length) {
			return false;
		}
		
		boolean backtrack=false;
		
		if(suduko[i][j]!=0) {
			backtrack=sudukoSolver(suduko, i, j+1);
		}else {
			for(int p=1; p<=suduko.length; p++) {
				
				backtrack=false;
				if(ah.get(i).containsKey(p) || ah2.get(j).containsKey(p) || block.get(blockNum(i, j)).containsKey(p)) {
					continue;
				}
				
				if(p>suduko.length) {
					break;
				}
				suduko[i][j]=p;
				ah.get(i).put(p, 1);
				ah2.get(j).put(p, 2);
				block.get(blockNum(i, j)).put(p, 3);
				backtrack=sudukoSolver(suduko, i, j+1);
				if(backtrack) {
				ah.get(i).remove(p);
				ah2.get(j).remove(p);
				block.get(blockNum(i, j)).remove(p);
				suduko[i][j]=0;
				}
				
			}
			if(suduko[i][j]==0) {
				backtrack=true;
			}
		}
		return backtrack;
		
	}

	private static void display(int[][] suduko) {
		// TODO Auto-generated method stub
		for (int i = 0; i < suduko.length; i++) {
			for (int j = 0; j < suduko[0].length; j++) {
				System.out.print(suduko[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void takeInput(int[][] suduko) {

		for (int i = 0; i < suduko.length; i++) {
			for (int j = 0; j < suduko[0].length; j++) {
				suduko[i][j] = sc.nextInt();
			}
			for(int j=0; j<suduko.length; j++) {
				ah.get(i).put(suduko[i][j], 1);
				ah2.get(j).put(suduko[i][j], 2);
				block.get(blockNum(i,j)).put(suduko[i][j],3);
			}
		}
		
		
	}


	private static int blockNum(int i,int j) {
		// TODO Auto-generated method stub
		
		int a=j/3;
		int b=i/3;
		
		int ans=3*a+b;
		return ans;
	}

}
