package UEN_GroupStudy_Abstract;

// public class class1 implements myAbstract{   // abstract class cannot be implemnted
								
public class class1 extends myAbstract{    // abstract class meant to be extended.
		// after extend the abstract class, we MUST implement the abstract methods!!!

	
	public static void main(String[] args) {
		class1 obj=new class1();
		obj.method2();
	
	//	 myAbstract obj2=new myAbstract();  // abstract class CAN NOT be object
		 myAbstract obj3 = new class1();  // abstract can only be reference type
		 					// only abstract' child class can be object.
		 
		 class1 obj4=new class1();  // child class can only create it's own object (if it's not abstract)
		
		 
		 obj3.xx2();   obj4.xx2();

	}
	
	@Override
	public void method2() {
		System.out.println("hello this is override method");
		
	}   

}