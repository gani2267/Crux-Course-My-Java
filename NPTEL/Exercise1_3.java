package NPTEL;

import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int result = 0;
	   int sum=0;
	   do{
	     int r=n%10;
	     sum += r*r*r;
	     n=n/10;
	   }while(n>0);

	   if(sum == n){
	     result=1;
	   }

	   System.out.print(result);
	  }
}