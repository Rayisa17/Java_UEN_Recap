package UEN_GroupStudy_Recap;

class parent{
	
	int mynum=20;
	String str1="Zohra";
	static int mynum2=40;
	static String str2="Mirzat";
	
	public static void method1() {
		System.out.println("I am static method");
	}
	public void method2() {
		System.out.println("I am none static method");
	}
	
}

class child1 extends parent  {         // parent becomes the super class of child1
		public void mm() {
			mynum=30;     // none static method can accept static and instance variable both
			mynum2=40;
		}
		public static void mm2() {
	//		 mynum=50;      // mynum is none static varaible, there fore static method cannot accept none static varible
			 mynum2=60;
	//		mm3();     // none static method cannot be accepted in a static method
			 
	// to call super class' none static variable and method inside a static method:	
			 child1 newobj = new child1();
			 newobj.mynum = 60; 
			 newobj.mm3();
				
	//		 parent obj=new parent();   // super class can create it's own object 
	//		 parent obj2 = new child1();  // a super class can be reference type and create it's child class(es) object(s)	
	//	   	 child1 obj3 = new parent();   // a child class cannot be reference and create it's super class' object
	//		 child1 obj4 = new child1();  // a child class can only be it's own reference and it's own object
			 
			 
		}
		
		public void mm3() {
			
		}	
}

public class A19_Inheritance extends parent{  // parent becaome the super class for A19_Inheritance
		String yy="muhtar"; 
		
		int z=mynum;   // any static and none static variable can be called to initilize for an instance varible.
		int y=mynum2;  
	
	public static void main(String[] args) {   // static only accepts static
		System.out.println(mynum2);   // static varible i can access directly after use inheritance (extends). 
		
	}
	
	public static void staticmethod() {
		// only the static varible and methods from the super class can be called directly
			mynum2=80;
			str2 ="zzzzz";
		//  mynum=90;   // mynum is none static
			method1();
		// 	method2();   this method is none static 		
			
	}
	
	public void nonestaticmethod() {
		System.out.println(mynum);  // none static methods accepts static and none static variable.
		System.out.println(mynum2);
		
		method1();  // none static method can accept static and none static methods
		method2();
	}
	
}