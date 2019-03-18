package UEN_GroupStudy_Recap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A2_Overloading {

	static Scanner scan=new Scanner(System.in);
	static int myintnumber =10;
	public static void main(String[] args) {
		
			
		
		String mystr="true";
		 boolean bvalue2 =new Boolean(mystr);
		
		 
		
			additionmethod(Integer.valueOf(10), Integer.valueOf("20"));
			additionmethod(new Integer("10"), new Integer("20"));
			additionmethod((Integer)10 , (Integer)20);
			additionmethod(null, null);
			additionmethod(1, 2.5);
			
			
			// wrapper class can hold null, primitives cannot
			
			
			int i='R';
			int z='J';
			 additionmethod( i, z);
			 subtract(10, 20);
				
	}
	public static void subtract(int a, int b) {
		
		System.out.println((a-b));
		a=scan.nextInt();
		System.out.println(a-b);
	}
	
	public static void additionmethod(int a, int b) {     // static methods must accept static variable

		System.out.println("Int version "+(a+b));
	}
	
	public static void additionmethod(Integer a, Integer b) {
		
		System.out.println("Integer version "+a+b);
	}
	
	public static void additionmethod(double a, double b) {
		System.out.println("double version"+(a+b));
	}
	
	public static void additionmethod(char a, char b) {
		
		System.out.println("char version"+(a+b));
	}
}