package UEN_GroupStudy_Recap;

public class exampleStatic {
	
	public exampleStatic() {
	    //  	this(10,"11",false);      // examplesss(int b, String c, boolean aa)   has two contsructore.  
								// YOU CAN ONLY CALL ONE CONSTRUCTOR
	}
	public exampleStatic(int a, String b){
		this();   // in order to call constructore we must use "this" , cant call the methods name
		System.out.println("constructor"+a+b);
	//   	this(11,"x",true);              in a one constructor method u can only use or call one constructor ( cannot be more than one)
	}
	
	public exampleStatic(int b, String c, boolean aa) {
		this(10, "pp");
		System.out.println(b+"  "+c+"  "+aa);
		
	}
	
	int a = 10;
	static int b = 20;
	{
		System.out.println("initlize step 1");
	}
	
	{
		System.out.println("initilize step 2");  
	}
	static {
		System.out.println("static step 3");   // static block will make the 
	}
	static {
		System.out.println("static step 4");
	}

	public void nonestaticmethod() {
		System.out.println("I am none static");
	}

	public static void staticmethod() {
	     // 	exampleStatic(11, "11");   none constructore method cannot call constructore method
		System.out.println("I am static method");
	}
	
	/* Constructore conclusion:
	 * 1. one constructore method can only call one constructore method (cannot be more than one).
	 * 2. we need to use this() to call the constructore menthod.
	 * 3. none constructore methods cannot call constructore methods
	 * 4. when we create the object of class, it always looking ofr the matched constructore
			
	*/
}
