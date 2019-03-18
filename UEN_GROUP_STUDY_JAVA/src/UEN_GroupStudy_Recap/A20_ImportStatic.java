package UEN_GroupStudy_Recap;

// import static UEN_GroupStudy_Recap.exampleStatic.*;  // any static that has variable name can be called
//import java.util.*;    //

public class A20_ImportStatic extends exampleStatic {

	public static void main(String[] args) {
	
		exampleStatic obj=new exampleStatic(10, "hhh");			// static block will only be printed once
		obj.a=9;
		
		exampleStatic ob2= new exampleStatic(19, "88", false);
		ob2.a=10;
		System.out.println();
	
		
		/*Conclusion for static block:
		 * 1. in order to print static block we must extend or create the objective of the class.
		 * 2. static block will only be executed once regardless of how many class objects have been created
		 * 3. static block always come at the very top( because it's already available to class) 
		 */
		
		/*Conclusion for initialized block:
		 * 1. in order to execute initilized block, we must create object of the class
		 * 2. initilized block executed after the static before constructore method
		 * 3. how many object we create how many time initilized block will be executed.
		 */
		
		/*Conclusion for import static:
		 *  // any static variable and static method will be available to the class.
		 * 
		 */
	}
	
	
}