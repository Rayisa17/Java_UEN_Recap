package UEN_GroupStudy_Recap;

import java.util.*;

public class A12_Set {
	public static void main(String[] args) {
		
	// Set & HashSet: cannot accept duplicated values.
			// Set<Integer> name= new HashSet();
			// HashSet<Integer> name= new HashSet();
		
		Set<Integer> myset= new HashSet<Integer>();
			myset.add(10);
			myset.add(10);
			myset.add(30);
			myset.add(20);
			myset.add(10);
			myset.add(10);
		
		System.out.println(myset);
			
		HashSet<Integer> myset2= new HashSet<Integer>();
				myset2.add(10);
				myset2.add(10);
				myset2.add(20);
				myset2.add(30);
				myset2.add(10);
				myset2.add(10);
		System.out.println(myset2);
	
		
		// sortedset:  automatically sorts the values
					// SortedSet<Wrapperclass> name= new TreeSet();
					//TreeSet<Integer> name = new TreeSet<>();
		
			SortedSet<Integer> mySortedSet=new TreeSet<Integer>();
				mySortedSet.add(9999);
				mySortedSet.add(36);
				mySortedSet.add(87);
			System.out.println(mySortedSet);
			
			TreeSet<Integer> mytreeset = new TreeSet<Integer>();
				mytreeset.add(9999);
				mytreeset.add(37);
				mytreeset.add(87);
			System.out.println(mytreeset);
		
			
		//	Set: Hashset, TreeSet;
		// SortedSet: Hashset, TreeSet;
		// cannot make the set(or sortedset) reference to create SortedSet' (or Set's) object
	}

}
