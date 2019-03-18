package UEN_GroupStudy_Recap;

public class A06_primitives_Wrapperclass {
	
	public static void main(String[] args) {
		
		
		
		//   Primitives  VS Wrapper class
		
		/*
		Primitives: none can hold null           	Wrapper class:   default value will always be null
		
			1. int				Autoboxing				1. Integer
			2. double	     =========>>>    			2. Double
			3. float									3. Float
			4. byte										4. Byte
			5. short			unboxing				5. Short
			6. long				<<<=========	    	6. Long
			7. boolean									7. Boolean
			8. char										8. Character
			
		 */
		
		// Primitive		    			// WrapperClass
					
//		byte a=127;           		 			Byte A=127;
//		short s =32700;       		            Short S=32700;
//		int i = 9999999;         		        Integer I = 99999999;
//		long l =999999999;     		            Long L=9999999L;     // in wrapperclass Long you must  add L (either upper case or lower).
//		float f=89.233f;        		        Float F=89.233F;     // for wrapperclass and primitve float we must add f at the end
//		double d=98.5;          		        Double D = 199.65;
//		char c='w';             		        Character C='w';
//		boolean b=true;							Boolean B=false;
						
		
		// primitives do not have methods to call, only wrapperclass types has
		// only Wrapper class and String can hold null value .
				//	byte BB= null;   any primitive type cannot hold null
		
					Byte BB=null;
					System.out.println(BB);
			// 	boolean AA; local variable
				
		System.out.println(AA);
		// default values:  byte, short, int , long ===> 0,        float, double ==> 0.0,   boolean ==> false;
		// default value of the Wrapper class ======> null.
		
		// converting primitves to wrapper & wrapper class to primitivesclass:
			int priInt =10;						Integer wrapInt =priInt;   // Auto boxing
												System.out.println(wrapInt);
			Integer myInt1=30;					int myint = myInt1;  // unboxing
												System.out.println(myint);
		
		// converting String values to primitives (without un or auto boxing):     primitive = WrapperclassType.parse(Stringvalue)
			String str1="true";
			boolean bvalue= Boolean.parseBoolean(str1);
			System.out.println(bvalue);
			
			String str2 ="1198";
			int intvalue = Integer.parseInt(str2);
			System.out.println(intvalue +2);
			
			String str3 ="0.9";
			float fvalue = Float.parseFloat(str3);
			double dvalue = Double.parseDouble(str3);
			System.out.println(fvalue+" : "+dvalue);
			
			String str4="u";
			char charvalue = str4.charAt(0);
			System.out.println(charvalue);
			
					// parse method will return primitive type
			
			
		// converting String value to WrapperClass  (without un or auto boxing) :   WrapperClass = Wrapperclasstype.vlaueOf(String value or char)
			String newstr1 ="null";
			Boolean newbValue =Boolean.valueOf(newstr1);      // .valueof methods return wrapper class type.
			System.out.println(newbValue);
			System.out.println(newstr1);
			
			newbValue =Boolean.parseBoolean("true");   // Autoboxing happened. because parse methods returns primitive and we assigned it to wrapper class
			
			boolean Ab =Boolean.valueOf("false");    // unboxing happened, because value of returns wrapper class and we assigned it to primitives.
		System.out.println(Ab);
			String newstr2 ="98.7";
			Double newDvalue = Double.valueOf(newstr2);
			System.out.println(newDvalue);
			
		// default converting:    Wrapperclass(or primitive) varible = new Wrapperclass( any type of value) ;
			String examplevalue ="12345";
			
			Integer variablename = new Integer(examplevalue);    // by default it executes the valueof methods (returns wrapper class).
			System.out.println(variablename+1);
			
			int vvalue= new Integer(examplevalue);    // unboxing 
			System.out.println(vvalue+1);
			
			String T1 ="true";
			Boolean Y1=new Boolean(T1);
			System.out.println(Y1);
			boolean Y2=new Boolean(T1);   /// unboxing
			System.out.println(Y2);
			
			
		
		// casting:
			double d1=4.8;
			int a1=(int)d1;  // 4    because after casting it gives the whole number part.
			System.out.println(a1);
			
			int a2=900;
			double d2=a2;
			System.out.println(d2);
			
			
	}
	boolean AAA; // instance variable
	static Boolean AA;   // static variable

}