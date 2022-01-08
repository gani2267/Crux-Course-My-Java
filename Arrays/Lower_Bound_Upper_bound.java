package Arrays;

public class Lower_Bound_Upper_bound {

	public static void main(String[] args) {
		
		//we have to do all stuff using binary search
		
		int[] arr= {1,2,2,2,2,3,3,3,9,11};
		
		int find=2;
		System.out.println("Lower Bound : "+LowerBound(arr,find));
		System.out.println("Upper Bound : "+UpperBound(arr,find));
		

	}
	
	public static int LowerBound(int[] arr,int b) {
		
		int ans=-1;
		int l=0;
		int h=arr.length-1;
		
		while(l<=h) {
			int mid=(l+h)/2;
			
			if(arr[mid]==b) {
				ans=mid;
				h=mid-1;
			}
			else if(arr[mid]<b) {
				l=mid+1;
			}
			else if(arr[mid]>b) {
				h=mid-1;
			}
			
		}
		
		return ans;
	}
	
    
	public static int UpperBound(int[] arr,int b) {
		
		int ans=-1;
		int l=0;
		int h=arr.length-1;
		
		while(l<=h) {
			int mid=(l+h)/2;
			
			if(arr[mid]==b) {
				ans=mid;
				l=mid+1;
			}
			else if(arr[mid]<b) {
				l=mid+1;
			}
			else if(arr[mid]>b) {
				h=mid-1;
			}
			
		}
		
		return ans;
	}

}
