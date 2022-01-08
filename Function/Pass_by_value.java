package Function;

public class Pass_by_value {
   public static void main(String[] args) {
	   
	   int a=10,b=20;
	   System.out.println(a+" "+b);
	   
	   swap(a,b);
	   System.out.println(a+" "+b);
   }
   
   public static void swap(int p,int q) {
	   int temp=p;
	   p=q;
	   q=temp;
   }
}
