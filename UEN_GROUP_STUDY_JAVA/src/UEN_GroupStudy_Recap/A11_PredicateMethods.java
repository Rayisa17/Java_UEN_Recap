package UEN_GroupStudy_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class A11_PredicateMethods {

	public static void main(String[] args) {
		
		int[] myarr= {1,2,3,4,5,6,7,2,3,4,5,1,2,3,4,5,4,3,2,2,4,6,7,8,9};
		
		Predicate<Integer> lessthan5 = t -> t == 2;
		int count2=0;
		
		for(int i=0; i< myarr.length;i++) 
			if(lessthan5.test(myarr[i])) {
				count2++;
				System.out.print(myarr[i]+" ");
		}
		System.out.println("\n"+count2);
		
		ArrayList<String> mylist = new ArrayList<>(Arrays.asList("Mirzat","Muhtar Mahmut","Ihtipar yasen"));
		
		Predicate<String> myp = Y -> Y.contains(" ");
		
	for (int i=0; i<mylist.size(); i++) {
		if(!myp.test(mylist.get(i)))
			System.out.println(mylist.get(i));
	}
	
	
	String[] myarr1 = {"Apple","TEa","Orange","Bread","Bananna","Beef"};
	Predicate<String> removeB = o -> !o.startsWith("B");
	
	for(String each: myarr1)
		if(removeB.test(each))
			System.out.println(each);
	
	
	int[] mynums= {100,1000,100,100,2000,3000,4000,5000,99,45};
		
	Predicate<Integer> greaterthan100 = u -> u > 100;
	
	for(int each: mynums)
		if(greaterthan100.test(each))
			System.out.println(each);
	
	

	}
}