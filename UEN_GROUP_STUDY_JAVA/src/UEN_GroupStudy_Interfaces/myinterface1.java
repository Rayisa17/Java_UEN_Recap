package UEN_GroupStudy_Interfaces;

public interface myinterface1 {    // an interface is not a class!
	
	static int a=10;    		  // in interface we can also create static and none static varaible.
	int b=20;
	
	
	public void mm();     				// in interface we can create none static method without the body
	
	//	public void static mm2(); 		 // in interface we cannot create static method without the body
	
//	public void mm3() {   }   		 // in interface we cannot create none static method with the body 
	
	public static void method1() {    // static method in the interface will not be implements 
		
	}
	// for none static method you must NOT give the body, for static method you must give the body

	
}
