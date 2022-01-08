package oops;

public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person p2=new Person();
		System.out.println(p2);
		p2.name="Gani"; p2.age=18;
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		
		System.out.println("================================");
//		p1.reg_no=33;             //will give error as Private access specifiers are used
//		System.out.println(p1.reg_no);            //give error
	    
		p1.setReg_no(33);
		System.out.println(p1.getReg_no());
	}

}
