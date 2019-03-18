package UEN_GroupStudy_Recap;

import java.util.*;


public class A08_ArraysSortings {
	public static void main(String[] args) {
		
		// sorting:  sorts from smallest to largest
			// one dimentinal array: 
			int[] my1darr = {100,6543,12321,2345,4,321,2,11};
				Arrays.sort(my1darr);
				System.out.println( Arrays.toString(my1darr) );
				
				// index psoition of 321
				int AA= Arrays.binarySearch(my1darr,321 );
				System.out.println(AA);
				
			
			// multidimentional :   
				int[][] my2Darr = { {89,5,2222,312,0,7,8,5,3,12,1,2,3,4} ,{9999,5634, 231}, {98762,234,123453,89765431}   } ; 
				for(int i=0; i<=2; i++) {
					Arrays.sort( my2Darr[i] );
				}
				
			
				System.out.println(Arrays.deepToString(my2Darr));
				
				// index position of 12
			 int BB =	Arrays.binarySearch( my2Darr[0] , 312 );
			 System.out.println(BB);
				
			
			 
			 // Task: 
			  String[][][]  example1 = { {{"Muhtar", "Mahmut"},{"Mirzat", "Muhtar"} },   { {"Mahpirat", "Aysa"}, {"Ihtipar" , "Yasin"} } ,
					  										{{"Rayisa", "Osman"} , {"Ramila", "Osman"} },  };
			  
			  // example1[0][0] , example[0][1]
			  // example1[1][0],  example[1][1];
			  // example1[2][0],     example[2][1];  
			  // example1[x][y]     x<3,  y<2.   
			  
			  for(int i=0; i < example1.length; i++) {
				  for(int j=0; j<example1[i].length; j++) {
					  Arrays.sort(example1[i][j]);
				  }
			  }
			  System.out.println(Arrays.deepToString(example1));
			  
			  
			
	}

}
