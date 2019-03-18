package UEN_GroupStudy_Recap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A21_Collection_Maps {

	public static void main(String[] args) {
		// Map: Map is an Interface.
//		Map<String, Integer> obj=new Map<>();   since Map is an interface, i cannot create it's own object.
					// Interface can only be reference type. 
		
		Map<StringBuilder, StringBuilder> obj2=new HashMap<>();
		obj2.put(new StringBuilder("Hello"),new StringBuilder("Hello"));
					// if we give mutables for key and value , when we put values in them we must create thier object type.
		System.out.println(obj2);
		
		Map<String,Integer> obj3=new HashMap<>();
		obj3.put(new String("Muhtar"), new Integer( 123123));
		obj3.put("Mirzat", 0);
		System.out.println(obj3);
		
		
		Map<String, LocalDate> dateOfBirth=new HashMap<>();    // map is first in first out
			dateOfBirth.put("Muhtar", LocalDate.of(1994, 5, 19));
			dateOfBirth.put("Mirzat", LocalDate.of(1994, 11, 12));
	//		dateOfBirth.put(888, "kkkk);   we need to give the key and value as thier own own type
			System.out.println(dateOfBirth);
			
			System.out.println(dateOfBirth.get("Mirzat")); 
	//		System.out.println(dateOfBirth.get(LocalDate.of(1994, 11, 12)));// in get method we can only give Key value
			
			
	// 	HashMap<String, boolean> AA2=new HashMap<>();    for key and value we must give Class type, not primitives
			
			HashMap<String, Boolean> AA3=new HashMap<>();
			AA3.put("AB", null);
			AA3.put("AC",  1 >2);
			AA3.put("AD", "Mirzat".equals("GoodGuy"));
			AA3.put("AE", true);
			AA3.put("AF", false);
				
		// MapName.containsKey(key):  retuns boolean expression
						// it checks if the given value is exist in KEY of map or not.
			System.out.println( AA3.containsKey("GF"));
				System.out.println();
				
				HashMap<String, Integer> AA4=new HashMap<>();
				AA4.put("12", 12);
		//		System.out.println( AA4.containsKey(12) ); // false
			
				HashMap<Double, Integer> AA5=new HashMap<>();
				AA5.put((double)4, 4);
			//	System.out.println(AA5.containsKey(4));  // false
				System.out.println(AA5.containsKey(4.0));  //true
				System.out.println(AA5.containsKey(new Double("4"+".0")));  // true
				System.out.println(AA5.containsKey((new Double((int)4.0))));  // true
				
				HashMap<List<Integer>, List<Double>> AA6=new HashMap<>();
				AA6.put(Arrays.asList(1,2,3), Arrays.asList(1.0,2.0));
				Collection<Integer> col=Arrays.asList(1,2,3,5,64);
				List<Integer> mylist=new ArrayList<>();
				mylist.addAll(col);
				System.out.println("xxxx: "+AA6.containsKey(mylist));
				
				System.out.println(AA6.get(Arrays.asList(1,2,3)).get(1));  // in order to print 2.0
				
			// Mapname.containsValue(Value): retuns boolean expression
				// it checks if the given value is exist in VALUE of map or not.
			
				double zz=4.0;
				Double ZZ2=4.0;
				
				boolean A="A"=="B";
		
				mm("Muhtar"=="Muhtar");  
				mm(true);   // primitive tye
				mm(null);   // class
				System.out.println(zz+":"+ZZ2+":"+A);
				
	}
	
	public static void mm(Boolean a) {
		System.out.println("class version");
	}
	public static void mm(boolean b) {
		System.out.println("primitive version");
	}
	
}