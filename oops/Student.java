package oops;

public class Student {
	
	private String name;
	public String getName() {
		return this.name;
	}
	public void setName(String name) throws Exception {
		
		// business rules checked
		if(name.equals("") || name==null) {
			throw new Exception("Names can't be null or empty");
		}
		
		this.name = name;
	}
	
	//final means can be set only once.Can be public , but can't be modified once given the value
	public final int rollNo;
	
	//static means , it belongs to the class (doesn't belong to object)
	private static int NumOfStudents=0;
	public static int getNumOfStudents() {
		return Student.NumOfStudents;
	}
	public static void setNumOfStudents(int numOfStudents) {
		Student.NumOfStudents = numOfStudents;
	}
	
	public static final int Max_Students=1000;
	
	public Student(String name) throws Exception{
		if(Student.NumOfStudents==Student.Max_Students) {
			throw new Exception("Max limit reached");
		}
		
		this.setName(name);
		
		Student.NumOfStudents++;
		this.rollNo=Student.NumOfStudents;
	}
	
	
	private static String UniformColor="White";
	public static String getUniformColor() {
		return Student.UniformColor;
	}
	public static void setUniformColor(String uniformColor) {
		Student.UniformColor = uniformColor;
	}
	
	
	//can access both static and non-static variables and functions
	//i.e. we can use this.  and also Class_name.
	public void ANonStaticFunction() {
		System.out.println(this.name + " says hello to "+ Student.NumOfStudents + "students");
	}
	
	
	//can access only static data members(variable ,function)
	//can't use non static data members
	//i.e. we can't use this.  but can use Class_name.
	public static void AStaticFunction() {
		System.out.println(Student.NumOfStudents + " out of possible "+ Student.Max_Students);
	}
	
	
}
