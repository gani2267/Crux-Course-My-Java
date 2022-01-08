package Arrays;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,7,10,12,15,20,27,31,36,42,55,58,60,65,70,80};
		
		System.out.println("55 has index "+LinearSearch(arr,55));
		System.out.println("55 has index "+LinearSearch(arr,100));
		
		System.out.println("55 has index "+BinarySearch(arr,55));
		System.out.println("55 has index "+BinarySearch(arr,100));
		
	}
	
	public static int LinearSearch(int[] a,int b) {
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==b) {
				return i;
			}
		}
		return -1;
	}
	
	public static int BinarySearch(int[] a,int b) {
		int l=0;
		int h=a.length-1;
		
		while(l<=h) {
			int mid=(l+h)/2;
			
			if(b==a[mid]) {
				return mid;
			}
			else if(b>a[mid]) {
				l=mid+1;
			}
			else if(b<a[mid]) {
				h=mid-1;
			}
			
		}
		return -1;
	}

}
