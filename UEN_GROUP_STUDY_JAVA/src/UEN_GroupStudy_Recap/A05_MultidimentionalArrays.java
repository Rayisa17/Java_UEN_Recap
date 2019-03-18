package UEN_GroupStudy_Recap;

import java.util.Arrays;

public class A05_MultidimentionalArrays {

	public static void main(String[] args) {
		
		// how to initilize array's size
		int[] aa=new int[5];
		System.out.println(aa.length);
		
		int[] AA=new int[] {1,2,3,4,5};
		System.out.println(AA.length);
		
	
		int[] singleDArray= { 1,2,3,4,5};
		System.out.println(Arrays.toString(singleDArray));
		
		// 2D Arrays:  contains multiple single dimentional array. 
		int[][] multi2Darrays = { { 1,2,3,4,5,8,9,0} , { 1,2,3,4,5}, { 1,2,3,4,5}, { 1,2,3,4,5} };
			System.out.println(Arrays.deepToString(multi2Darrays));
		
//		int[][] C= new int[4][8];
		
		// Array [piont at to the 1D array] [ each elemnt inside 1d array]
		
		String[][] multi2dstr = { {"muhtar","mamat"} , {"Ihtipar", "Rayisa"} , {"Mirzat", "Ramiyla","a" , "bh"}  };
//		String[][] multi2dstr1 = new String[3][4];
		
		// in order to print  ramiyla
		System.out.println(multi2dstr[2][1]);
		// mamat:
		System.out.println(multi2dstr[0][1]);
		
		// ["ihtipar", "Rayisa"];
		System.out.println( Arrays.toString( multi2dstr[1]));
		
		
		String[][] example1={ {"Muhtar", "mamat", "mirzat"}, {"Ramyla","Ihtepar", "Rayisa"}, {"AA", "BB", "CC"} };
		System.out.println("From excel: "+ Arrays.deepToString(example1));
		
		// deepToString():   Arrays.deepToString( multiDArrayname);
		System.out.println(Arrays.deepToString(multi2dstr));
		
	
		
		// 3D arrays: contains multiple 2D.
		
		int[][][] my3darray= {   { {1,23,4,5,56,00} ,{45,67,981} }  , { {1,23,4,5,56,00} ,{45,67,98} }  , { {1,23,4,5,56,00} ,{451,67,98} }      } ;
		// [ pointing at the 2D array ] [ pointing at the 1d array inside that 2D array] [ each elemnt insde 1d array]
		
		// print 45:
		System.out.println( my3darray[2][1][0]);
		
		
	}

}
