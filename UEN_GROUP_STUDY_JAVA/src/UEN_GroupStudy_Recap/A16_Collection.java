package UEN_GroupStudy_Recap;

import java.util.*;
 // import java.util.function.Predicate;

public class A16_Collection {

	public static void main(String[] args) {
		// Collection && Collections : 
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(9,11,2222,18,0,-1,2));
			
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		// Collection ==> List (Contains ArrayList and LInkedList), Set, Quere. 
		//Collections.methods(type)   also applys to all the Collection types
		
		// Collection:
//			List<String> mystrList = new ArrayList<>();
//			List<String> mystrlist2 = new LinkedList<>();
			
//			Collection<Integer> mycol = new ArrayList<>();    // storing arraylist into collection
//			Collection<Integer> mycol2 = Arrays.asList(1,2,3,4,5,6);  // storing list into collection
//			Collection<Integer> mycol3 = new LinkedList<>();
			
//			 ArrayList<Integer> list2 = new ArrayList<>();
//			 Collection<Integer> newcol = list2;
//			 LinkedList<Integer> variablename = new LinkedList<>();
			 
	//		 RemoveAll(Coolections), AddAll(Collection):
			 List<Integer> mylist1=new ArrayList<>();
			// mylist1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,10,12,12321,1231));
			
			 Collection<Integer> addvalues = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,10,12,12321,1231));	
			 mylist1.addAll(addvalues);
			 
		//	 mylist1.removeAll(Arrays.asList(1,3,5,7,9));
			 System.out.println(mylist1);
			 
//		Predicate<Integer> larger = Rayisa -> Rayisa %2== 0;
	//	mylist1.removeIf(larger);
		mylist1.removeIf(zohra -> zohra > 10);	
			 
		System.out.println(mylist1);
		
		//Task:
		List<String> RayisaKillList = new ArrayList<>();
		RayisaKillList.addAll(Arrays.asList("Muhtar", "Mirzat", "Ihtibar", "Obama", "Trump", "Yashar"));
		
	//	Predicate<String> z = p -> p.startsWith("M");
	//	RayisaKillList.removeIf(z);
		RayisaKillList.removeIf( p -> p.startsWith("M"));
		System.out.println(RayisaKillList);
		
		
		// Set && Collection : 
//		Set<String> set0= new Set<>();   // set can only be reference. ( interface cannot create it's own object) 
		
//		Set<String> set1= new HashSet<>();
//		HashSet<String> set2 = new HashSet<>();   // Hashset can be ref and object both 
		
//		SortedSet<Integer> set3 = new TreeSet<>();
//		 SortedSet<Integer> set4 = new SortedSet<>(); // SortedSet can only be reference tye  ( interface cannot create it's own object) 
						 
		Set<Integer> variable =new HashSet<>();
		variable.add(1);
		variable.add(1);
		variable.add(2);
		variable.add(3);         //  [1,1,1,1]  ,[1]
		variable.add(4);
		variable.add(5);
		variable.add(6);
		System.out.println(variable);	
			
			System.out.println( new TreeSet<>(Arrays.asList(1,1,2,2,3,3,4,4)) );
			System.out.println( new HashSet<>(Arrays.asList(1,1,2,2,3,3,4,4)) );
			
//			System.out.println( new Set<>(Arrays.asList(1,1,2,2,3,3,4,4)) );
//			System.out.println( new Set<>(Arrays.asList(1,1,2,2,3,3,4,4)) );
			 	 
//			boolean a="Zohra".equals("Good person");
			String AA="\"Zohra\".equals(\"Good person\")";
			System.out.println( new Boolean(AA) );
			 
			Collection<Integer>  xx= variable;    // any set type can directly be assign to collection.
			
			Set<Integer> sss= new HashSet<>();
			sss.addAll(xx);
			System.out.println(sss);
			
			sss.removeIf(p -> p%2==0);
			System.out.println(sss);
			
			// any collection type can use predicate' method!!!	

	}
}