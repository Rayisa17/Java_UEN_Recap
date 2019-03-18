package UEN_GroupStudy_Recap;

import java.util.Scanner;

		final class  rayisa{
			
		}
		
	//	class Mirzat extends rayisa{     final calss cannot be extended.     }



class Yashar {
	
	int num1=30;
	static int num2=40;
	
}
public class A19_Inheritance_Part2 extends Yashar{
	 static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		Yashar obj1= new Yashar();
		obj1.num1=40;
		
		Yashar obj2= new Yashar();
		obj2.num1=50;
		
		Yashar obj3= new Yashar();
		obj3.num1=60;
		System.out.println(obj1.num1+" : "+obj2.num1+" : " +obj3.num1 );
		
		
	
		 
		//  static neg iqiga none static ne direct qakergele bommaydu, in order to accept none static we have to create class object
		// none static method can accept anything (method and variable ) static or none static 
	}
	
	public static void method1() {
		
		
		
	}
	
	public void method2() {
		
		
	}
}
