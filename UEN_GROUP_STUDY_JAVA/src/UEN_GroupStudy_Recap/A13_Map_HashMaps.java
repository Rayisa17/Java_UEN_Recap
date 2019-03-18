package UEN_GroupStudy_Recap;

import java.util.*;
public class A13_Map_HashMaps {
	public static void main(String[] args) {
		
		// {muhtar=24, mirzat=34, ihtipar=35, ramila=36} 
		
// Map<KeyType, ValueType> name=new HashMap<>();       cannot take all duplicates will take the last one.
		Map<String, Integer> Employeinfo=new HashMap<>();
				// Map can only be reference type, cannot be the object type
		Employeinfo.put("Mirzat", 34);
		Employeinfo.put("Rayisa", 28);
		Employeinfo.put("Muhtar", 14);
		Employeinfo.put("Muhtar", 35);     // if the key is duplicated, system will take the last stored one
		
		System.out.println(Employeinfo);
//		System.out.println(Employeinfo.get(14));  // cannot find by value, must have to find by Key
		System.out.println(Employeinfo.get("Rayisa"));  // can only be find by Key type
		
		
//	HashMap<KeyType, ValueType> name=new HashMap<>();    cannot take all duplicates will take the last one.
		HashMap<String, Integer> aa = new HashMap<>();
			// Hash map can be reference and object types.
				aa.put("Ramila", 38);
				aa.put("Ihtipar", 40);
				aa.put("Ramila", 45);
			
			System.out.println(aa);
			System.out.println(aa.get("Ramila"));
			

// multi Map:
			Map<Map<String, Integer>, HashMap<String, Integer>> mymulti= new HashMap<>();
			mymulti.put(Employeinfo, aa);
			System.out.println(mymulti.get(Employeinfo));	
		
	}
}