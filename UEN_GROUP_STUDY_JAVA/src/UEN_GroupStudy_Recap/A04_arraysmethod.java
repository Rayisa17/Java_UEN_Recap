package UEN_GroupStudy_Recap;

import java.util.Arrays;

public class A04_arraysmethod {
	public static void main(String[] args) {				
		
		// Single Dimentional Arrays:
		
				
		// Arrays: holds multiple values in one variable.
			int[] myintarray= {1,2,3,4,5}; // size: 5,     largest index number =  size -1;
			
			System.out.println(myintarray[4] );   // in rder to print specific array index:   variablename[index number]
				
			myintarray[2]=6;   // re-initilizing index of the array.
			
			
			System.out.println( Arrays.toString(myintarray));  // in order to pring array to console as array , we need toString methd.
			
			// toString():      Arrays.toString(vriablename);     it will convert Array to String
				String[] mystrarray= {"Mirzat", "Ihtipar", "Rayisa", "Ramila", "muhtar"};
						System.out.println(Arrays.toString(mystrarray) );
						
					String mystr =	Arrays.toString(mystrarray);      // toString method takes an Array and returns String.
					System.out.println(mystr);
					
					System.out.println(mystrarray[3]);
					System.out.println(mystrarray[2]);
					System.out.println(mystrarray[1]);
					System.out.println(mystrarray[0]);
					
					
			// length:    variable.length;   ==> returns the size of array. (how many elements inside).
					int[] myarrs= {44,55,66,77,32,12,34,1,2,3,4,5,6,7,8,9};
					System.out.println( myarrs.length);
					System.out.println(myarrs[myarrs.length-1]);
					
			
			// sort:    Arrays.sort(VariableName);   sorts the array from smallest to largest.
					int[] sortexample= {44,3,2,1,2334,22,4,5,6,8,999,1000,221231,34221,99,88,72,162, 18921112};
						Arrays.sort(sortexample);
						System.out.println(Arrays.toString(sortexample));
						System.out.println("The largest number is: "+sortexample[sortexample.length-1]);
						System.out.println("the smallest number is: "+sortexample[0]);
					
					String[] sortexample2 ={"Mirzat", "Ihtipar", "Rayisa", "Ramila", "Muhtar"};
					Arrays.sort(sortexample2);
					System.out.println(Arrays.toString(sortexample2));
					
			// Binearysearch:  YOU MUST SORT THE ARRAY IN ORDER TO USE BINEARYSEARCH.
					//		Arrays.binarySearch(variablename ,  element )  ==> returns number
					
					int[] bisearch={44,3,2,1,2334,22,4,5,6,8,999,1000,221231,34221,99,88,72,162, 18921112};
					Arrays.sort(bisearch);
					System.out.println(Arrays.toString( bisearch));
					int x=Arrays.binarySearch(bisearch, 999);
					System.out.println(x);
					
			// copyof:  Arrays.copyof( variablename, ending index);   ending index is excluded.    it starts to copy from index 0 till ending index
					int[] copyarray= {3,4,5,6,7,8,9};
					int[] copiedfrom=Arrays.copyOf(copyarray, 5);  // 3,4,5,6,7
					System.out.println(Arrays.toString(copiedfrom));
					
		
			//CopyOfRange:  Arrays.copyofRange( variablename, beginning index , ending index),  ending index is excluded, 
					int[]  arr1= {9,0,3,1,2,5,6,7};
					int[] arr2=Arrays.copyOfRange(arr1, 2, arr1.length-1);
					System.out.println(Arrays.toString(arr2));
					
					
			// Clone: variblename.clone();
					int[] orginal= {82,3,4,5,6,7,8,8};
					int[] madeinchina=orginal.clone();
					System.out.println(Arrays.toString(madeinchina));
					
			
			// .equals:  variablenam1.equals(variablename2).   it will check if the two arrays share the same value or not   .  it return boolean expression
					
					int[] m1= {12,22};
					int[] m2= m1;
					System.out.println( m1.equals(m2));// true
					
					int[] m3= {12,22};
					System.out.println(m1.equals(m3));  // false
					
					String[] godmade= {"Muhtar", "Mirzat","Ihtipar","Rayisa","Ramila"};
					String[] humanmade= godmade.clone();
					System.out.println(Arrays.toString(humanmade));
					
					System.out.println( humanmade.equals(godmade) );  // false
					
					
	}
}