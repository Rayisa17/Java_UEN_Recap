package UEN_GroupStudy_Interfaces;

// public class my_implement_class extends myinterface1  {     //  class extends class, interface extends interface

public class my_implement_class  implements myinterface1 {
					// interface can only be implemented
							// interfaces' method must be implemented!
	
	public static void main(String[] args) {
		my_implement_class obj=new my_implement_class();
		obj.mm();
		
	//	myinterface1 obj2= new myinterface1();   // we cannot create object out of interface
		
		myinterface1 obj3= new my_implement_class();    
				// interface can only be reference  and its implemnts has to be it's object
		obj3.mm();
	}

	@Override
	public void mm() {
		System.out.println("Hello");   // after tghe interface' method has been override, only the body of method can be modified
	}
	
		// interface' methods cannot be overload!
		// if we have to use extends and impelemnt together,  extends has to come before implement
}