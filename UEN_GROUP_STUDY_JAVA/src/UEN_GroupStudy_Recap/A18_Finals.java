package UEN_GroupStudy_Recap;

class A{
	public final static void m(double b){
		System.out.println(b);
		}
}
public class A18_Finals extends A {

	public static void main(String[] args) {
		// final ==> absulute, cannot change, cannot be extended.
		
				final int a = 10;
				System.out.println(a);
		
				// a=20; // final is absoulyte, cannot be re initlized.
				System.out.println(a);
		
				final String tax = "10";
				int b = Integer.valueOf(tax); // valueOf return wrapperclass type, so there is unboxing
				int c = Integer.parseInt(tax); // parseint return primitive. no auto or un boxing is happening
				int d = new Integer(tax);
		System.out.println(a+"  "+b+"  "+c+"  "+d);
				Integer e = Integer.parseInt(tax); // parseint returns primitive type,
		
				System.out.println();
		
				// differences between primitives and wrapper class
				boolean z = false;
				// z.method primitives does not have methods
				Boolean j = false;
				j.toString(); // wrapper class has methods
		
				// double dub=null; any primitives cannot hold null;
				Double dub2 = null; // only class type can hold null;
				
				
			final boolean rayisa=false;
			// 	rayisa= true; final variable' valuye cannot be changed.
	
	// conclusion :
//			for final variable: value is absolute ( cannot be changed).
//			final method can be overload but cannot be override
			
				m(10);
				m(10.5);
				
				System.out.println(a+"  "+b+"  "+c+"  "+d+"  "+e+"  "+z+"  "+dub2+"  "+rayisa);

	}

	public final static void m(int a) {
		System.out.println(a);
	}
 //	 public final static void m(double b){         final method can be overload but cannot be override(look above class)
	//	System.out.println(b);   }
}