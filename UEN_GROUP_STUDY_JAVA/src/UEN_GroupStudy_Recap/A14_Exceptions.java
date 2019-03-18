package UEN_GroupStudy_Recap;

import java.util.*;
import javax.management.openmbean.InvalidOpenTypeException;

public class A14_Exceptions {

	public static void main(String[] args) {
		// Exceptions:  Checked exception and Unchecked expection
			
	// Checked Exceptions:	
		// any expcetions that JVM (java virtual machine) can check is checked exception. 
		
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {     // cheked exception will give red line but it's not compile error
				e.printStackTrace();
				
			}  
			// this exception gives redline (not compile error) because it's checked exception JVM can check it
				// it gives redline, because checked exceptions needs to be handled immidietly.
		
	// Unchekd Exceptions: 
		// exceptions that JVM (Java Virtual Machine) cannot check, but throws exceptions in the JRE (Java Runtime Environemnt)	
		
	//		int[] myarr = {1,2,3};
	//	System.out.println(myarr[100]);  
		
	// Tasks: 
			ArrayList<Integer> myints =new ArrayList<>(Arrays.asList(1,2,3,4));
			
			try {
			System.out.println(myints.get(8));
			
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Hello");
				
			}
		// any unchecked exceptions after they're catched, the catch' body element can be modified
			
			
			
			try {
			Thread.sleep(2000);
			
			} catch(Exception e){
				System.out.println("World");
				
			}
// any checked exceptions after they're catched, the catch' body element cannot be modified
		
			
		int[] myx = {1,2,3};
		try {
		System.out.println(myx[5]);
		}catch(NullPointerException e) {
			System.out.println("Rayisa");	
		}catch (InvalidOpenTypeException z) {
			System.out.println("Ihtipar Hada");	
		}catch (ClassCastException y) {
			System.out.println("Muhtar");	
		} catch (IndexOutOfBoundsException u) {
			System.out.println("Eldos");
		}catch(ArithmeticException i) {
			System.out.println("Ramila hada");
		}catch (Exception t) {
			System.out.println("ffff");
		} 
		
		// exception catches it's own exception type, so therefore the right catch' body will print out
		
			int[] xxarr = {1,2,3};
			
			try {
			System.out.println(xxarr[5]);
			
			}catch (Exception e) {
	//			System.out.println("Test ended");
				
			}
		//    catch(ArithmeticException z){
		// 			System.out.println("Test ended"); }
			
			// if an exception is smaller than the previous in a catch , then it will give compile error
			
				
		
	}

}