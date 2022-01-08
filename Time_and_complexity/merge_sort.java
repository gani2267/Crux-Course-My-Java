package Time_and_complexity;

public class merge_sort {

	public static void main(String[] args) {
		
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {5,15,30,45,60,70,80};
		
		int[] ans=mergeTwoSortedArray(arr1,arr2);
		display(ans);
		
		int[] arr= {20,10,30,50,60,5,80,25};
		int[] ans2=mergeSort(arr,0,arr.length-1);
		display(ans2);
	}
	
	public static void display(int[] arr) {
		System.out.print("Elements in array are : ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static int[] mergeTwoSortedArray(int[] a,int [] b) {
		
		int[] merged=new int[a.length+b.length];
		
		int i=0,j=0,k=0;
		while(i!=a.length && j!=b.length) {
			if(a[i]<b[j]) {
				merged[k]=a[i];
				i++;k++;
			}else {
				merged[k]=b[j];
				j++; k++;
			}
		}
		
		if(i==a.length) {
			while(j!=b.length) {
			merged[k]=b[j];
			k++; j++;
			}
		}
		
		if(j==b.length) {
			while(i!=a.length) {
			merged[k]=a[i];
			k++; i++;
			}
		}
		
		return merged;
	}
	
	public static int[] mergeSort(int[] arr,int lo, int hi) {
		
		if(lo==hi) {
			int[] baseResult=new int[1];
			baseResult[0]=arr[lo];
			return baseResult;
		}
		
		int mid=(lo+hi)/2;
		int[] firstHalf=mergeSort(arr,lo,mid);
		int[] secHalf=mergeSort(arr,mid+1,hi);
		int[] ans=mergeTwoSortedArray(firstHalf,secHalf);
		
		return ans;
	}

}
