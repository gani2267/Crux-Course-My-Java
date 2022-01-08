package CB_practice;

import java.util.*;
import java.lang.Math;

public class JavaFundamental {

	static Scanner sc=new Scanner(System.in);

    public static void main(String args[]) {
    	
    	int T=sc.nextInt();
    	for(int i=0; i<T; i++){
    		int[] arr=takeInput1D();
    		
    		rearrange(arr,arr.length);
    		for(int j=0; j<arr.length; j++) {
    			System.out.print(arr[j]);
    		}
    	}
    }
    
    public static int[] takeInput1D() {
    	
    	int size=sc.nextInt();
    	int[] arr=new int[size];

		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		
		return arr;
    }
    
    public static void display1D(int[] arr) {
    	
    	for(int i: arr) {
    		System.out.print(i+" ");
    	}
    }
    
    public static int[][] takeInput2D(){
    	
    	int row=sc.nextInt();
    	int col=sc.nextInt();
    	int[][] arr=new int[row][col];
    	
    	for(int i=0; i<row; i++) {
    		for(int j=0; j<col; j++) {
    			arr[i][j]=sc.nextInt();
    		}
    	}
    	
    	return arr;
    }
    
    public static void display2D(int[][] arr) {
    	
    	for(int i=0; i<arr.length; i++) {
    		for(int j=0; j<arr[i].length; j++) {
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
    
    public static void WavePrintColumnWise(int[][] arr) {
    	
    	for(int j=0; j<arr[0].length; j++) {
    		if(j%2==0) {
    			for(int i=0; i<arr.length; i++) {
    				System.out.print(arr[i][j]+", ");
    			}
    		}else {
    			for(int i=arr.length-1; i>=0; i--) {
    				System.out.print(arr[i][j]+", ");
    		    }
    		}
    	}
    	System.out.print("END");
    }
    
    public static void QuickSort(int[] arr,int lo,int hi) {
    	
    	if(lo>=hi) {
    		return ;
    	}
    	
    	int left=lo;
    	int right=hi;
    	int mid=(lo+hi)/2;
    	
    	int pivot=arr[mid];
    	
    	while(left<=right) {
    		if(arr[left]>=pivot) {
    			if(arr[right]<=pivot) {
    				swipe(arr,left,right);
    				left++; right--;
    			}else {
    				right--;
    			}
    		}else {
    			left++;
    		}
    	}
    	
    	QuickSort(arr,lo,right);
    	QuickSort(arr,left,hi);
    }
    
    public static void swipe(int[] arr,int i,int j) {
    	int temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }
    
    public static int[] MergeSortTwoArray(int[] a,int[] b) {
    	
    	int[] merged=new int[a.length+b.length];
    	int i=0,j=0,k=0;
    	
    	while(i!=a.length && j!=b.length) {
    		if(a[i]<=b[j]) {
    			merged[k]=a[i];
    			i++; k++;
    		}else {
    			merged[k]=b[j];
    			j++; k++;
    		}
    	}
    	
    	if(i==a.length) {
    		while(j!=b.length) {
    			merged[k]=b[j];
    			j++; k++;
    		}
    	}
    	
    	if(j==b.length) {
    		while(i!=a.length) {
    			merged[k]=a[i];
    			i++; k++;
    		}
    	}
    	return merged;
    }
    
    public static int[] MergeSort(int[] arr,int lo,int hi) {
    	
    	if(lo>=hi) {
    		int[] b=new int[1];
    		b[0]=arr[lo];
    		return b;
    	}
    	
    	int mid=(lo+hi)/2;
    	
    	int[] fh=MergeSort(arr,lo,mid);
    	int[] sh=MergeSort(arr,mid+1,hi);
    	int[] ans=MergeSortTwoArray(fh,sh);
    	
    	return ans;
    }
    
    public static int KadanesAlgo(int[] arr) {
    	
    	int j=0; int ans=0;
		for(int i=0; i<arr.length; i++) {
			
			j=j+arr[i];
			if(ans<j) {
				ans=j;
			}
			if(j<0) {
				j=0;
			}
		}
		return ans;
    }
    
    public static void SpiralPrintAntiClockwise(int[][] arr,int r,int c,int nr,int nc) {
    	
    	
    	for(int i=r; i<nr; i++) {
    		System.out.print(arr[i][c]+", ");
    	}
    	for(int i=c+1; i<nc; i++) {
    		System.out.print(arr[nr-1][i]+", ");
    	}
    	for(int i=nr-2; i>=r; i--) {
    		System.out.print(arr[i][nc-1]+", ");
    	}
    	for(int i=nc-2; i>c; i--) {
    		System.out.print(arr[r][i]+", ");
    	}
    	
    	r++; c++; nr--; nc--;
    	if(c<nc && r<nr) {
    	SpiralPrintAntiClockwise(arr,r,c,nr,nc);
    	}
    	
    }
    
    public static void fac(int n) {
    	
    	int[] arr=new int[2000];
    	arr[0]=1;
    	int arrused=1;
    	int hatachya=0;
    	
    	for(int i=2; i<=n; i++) {
    		hatachya=0;
    		
    		for(int j=0; j<arrused; j++) {
    			arr[j]=arr[j]*i+hatachya;
    			
    			hatachya=arr[j]/10;
    			arr[j]=arr[j]%10;
    		}
    		
    		while(hatachya!=0) {
    			arr[arrused]=hatachya%10;
    			arrused++;
    			hatachya=hatachya/10;
    		}
    	}
    	
    	for(int i=arrused-1; i>=0; i--) {
    		System.out.print(arr[i]);
    	}
    }
    
    public static int arrToInt(int[] arr) {
    	
    	int sum=0;
    	for(int i=0; i<arr.length; i++) {
    		sum=sum*10+arr[i];
    	}
    	return sum;
    }
    
    public static int maxLengthOfBitonicSubarray(int[] arr,int n) {
    	
    	int[] inc=new int[n];
    	int[] dec=new int[n];
    	inc[0]=1;
    	dec[n-1]=1;
    	
    	for(int i=1; i<arr.length; i++) {
    		if(arr[i]>=arr[i-1]) {
    			inc[i]=inc[i-1]+1;
    		}else {
    			inc[i]=1;
    		}
    	}
    	
    	for(int j=arr.length-2; j>=0; j--) {
    		if(arr[j]>=arr[j+1]) {
    			dec[j]=dec[j+1]+1;
    		}else {
    			dec[j]=1;
    		}
    	}
    	int max=inc[0]+dec[0]-1;
    	for(int i=1; i<arr.length; i++) {
    		int a=inc[i]+dec[i]-1;
    		if(a>max) {
    			max=a;
    		}
    	}
    	
    	return max;
    	
    }
    
    public static void rearrange(int[] arr,int n) {
    	
    	for(int i=0; i<n-1; i++) {
    		for(int j=0; j<n-1-i; j++) {
    			
    			String s1=arr[j]+""+arr[j+1];
    			String s2=arr[j+1]+""+arr[j];
    			
    			long l1=Long.valueOf(s1);
    			long l2=Long.valueOf(s2);
    			
    			if(l2>l1) {
    				int temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}
    		}
    	}
    }
    
    
    
}
	

    
