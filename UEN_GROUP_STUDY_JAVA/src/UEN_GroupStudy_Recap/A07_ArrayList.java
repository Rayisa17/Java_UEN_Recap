package UEN_GroupStudy_Recap;
import java.util.*;
public class A07_ArrayList {
	
	public static void main(String[] args) {
	//  8. ArrayList: Add, remove, set, get, clear, Sort, subList 
		
		// Array vs ArrayList ===> Array is immutable (read only),  ArrayList is mutable (can be modifed)
		
		// 4 diffrent ways to create arraylist:
//				ArrayList<Integer> variable1=new ArrayList<Integer>();
//				ArrayList<Integer> variable2=new ArrayList();
//				List<Integer> variable3= new ArrayList<Integer>();
//				List<Integer> variable4= new ArrayList();
		
		
		// Add method().:   
				//listvariable.add(vlaue);
			List<String> GroupList=new ArrayList<>();
				GroupList.add("Rayisa");
				GroupList.add("Ihtipar");
				GroupList.add("Mirzat");
				GroupList.add("Ramila");
				GroupList.add("Muhtar");
				System.out.println(GroupList);
		
			// listvariable.add(index position, vlaue).    // must go in index order
				GroupList.add(2,"Muradil");
				System.out.println(GroupList);
			
	
			//		mylist.add(2,"Muhtar");  // aldida yixnem yok waketta akega narsa koxkele bommaydu
					
				//	System.out.println(mylist);
			
			ArrayList<String> mystrlist = new ArrayList<>();
					mystrlist.add("C");
					mystrlist.add("D");
					mystrlist.add(1,"A");
					mystrlist.add(2,"B");
					
					System.out.println(mystrlist);
				
		
		// Romve:  
				// listvariable.remove(index position);    listvariable.remove(new Wrapperclas(value) )
					List<Integer> mynums=new ArrayList<>();
						mynums.add(1);
						mynums.add(2);
						mynums.add(10);
						mynums.add(4);
					
				//	mynums.remove(2);       //  listvariable.remove(index position);
						mynums.remove(new Integer(10));    // listvariable.remove(new Wrapperclas(value) )
					
					System.out.println(mynums);
					
					
	// Set():  replace the value.
				// listvariable.set(index position,  newvalue);
			List<String> list1=new ArrayList<>();
				list1.add("Muhtar");
				list1.add("Muhtar");
				
				list1.set(1, "Mahmut");
				System.out.println(list1);
				
		
	// get(): returns the element of the index.
				// listvariable.get(index psotion);
				ArrayList<String> list2=new ArrayList<>();
							list2.add("A");
							list2.add("y");
							list2.add("f");
							list2.add("c");
							list2.add("x");
							list2.add("z");
					System.out.println(list2);	
					
					// toprint "y":
					String Y=list2.get(1);
					System.out.println(Y);
							
							
					// clear():  removes all elemnts in the list
							list2.clear();
							System.out.println(list2);
							
							
	// ArrayList sorting:
				// Collections.sort(listVariableName);
				ArrayList<Integer> myintlist=new ArrayList<>();
					myintlist.add(9);
					myintlist.add(19);
					myintlist.add(7);
					myintlist.add(1);
					myintlist.add(0);
					System.out.println(myintlist);
					
				Collections.sort(myintlist);   // MUST!!!
				System.out.println(myintlist);
							
							
		// sublist(): it takes partial of an original arraylist and store them in sub arraylist
					// list1.sublist(beginning index, ending index)   ending index will be excluded.
				List<Integer> sublist=myintlist.subList(2, 5);
					System.out.println(sublist);
				
					sublist.set(0, 100);
					System.out.println(sublist);
					System.out.println(myintlist);   // original list' elemnt will also be effected 
				
					// if sublist being modified, original list' vlauie will also change.
		
					// size(): retuns total numbers of element:
					System.out.println(myintlist.size());
					
	}
}