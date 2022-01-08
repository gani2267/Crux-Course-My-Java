package oops;

public class StudentClient {

	public static void main(String[] args) throws Exception {            //Note throws Exception is used as 
		                                                                 //some of our class constuctor have
		                                                                 //used throws Exception 
		Student[] YuvaMunch=new Student[1000];
		
		for(int i=0; i<YuvaMunch.length; i++) {
			YuvaMunch[i]=new Student(i+"th");
			System.out.println(Student.getNumOfStudents());
		}
		
		
//		Student.Max_Students=2000;  // we can't do this as this variable was declared final in class
//		YuvaMunch[250].rollNo=10;   // we can't do this as this variable was declared final in class
		
		System.out.println("===================================================\n");
		System.out.println(YuvaMunch[250].rollNo);
		
		System.out.println(YuvaMunch[250].getName());
		YuvaMunch[250].setName("ABC");
		System.out.println(YuvaMunch[250].getName());
		System.out.println("===================================================\n");
		
		YuvaMunch[250].ANonStaticFunction();
		YuvaMunch[250].AStaticFunction();
		Student.AStaticFunction();
		System.out.println("===================================================\n");
		
		YuvaMunch[250].setUniformColor("Blue");
		System.out.println(YuvaMunch[350].getUniformColor());
	}

}
