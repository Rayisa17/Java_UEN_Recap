package UEN_GroupStudy_Recap;


public class A03_stringbuilder {

	public static void main(String[] args) {
	//	2.  StringBuilder: Append, insert, replace, delete, reverse, ConvertBuildertoString & StringToBuilder,..
				//		StringBuilder A=new  ...            
		
		// the reason we need is that String is immutable (cannot be modified, read only), STring Builder is mutable.
		
		
		StringBuilder stb=new StringBuilder("here we can only give STring value");
		System.out.println(stb);
		
		// three different ways to initialize:
		StringBuilder initilaize1 = new StringBuilder("value goes here");
		System.out.println(initilaize1);
		
		String str2="hello"; 
		StringBuilder initilize2=new StringBuilder(str2);    // converting struing to stringbuilder
		System.out.println(initilize2);
		
		StringBuilder initialize3 = new StringBuilder();
				initialize3.append(" value goes here ");
		
		// append:    variable.Append(  )     ( we can give anytypes of value in side (); 
		StringBuilder apenmethod =new StringBuilder();
			apenmethod.append('c');                     
			System.out.println(apenmethod);
				// example:
				  String aa= ""+'c'+9+0.6+true;
				  System.out.println(aa);   // c90.6true
				  
		// insert:   .inser( index position, insert value)      insert value can be any type of value
				  StringBuilder insemethod = new StringBuilder("MirzatMuhtar");
				      insemethod.insert(insemethod.lastIndexOf("M"), 8);
				      System.out.println(insemethod);
		
				      StringBuilder example1=new StringBuilder("Cybertekisagreatschoolperson");
				       // cybertek is a great school and the owner is kuzzat and he is a okay person
				      example1.insert(example1.indexOf("i"), " ").insert(example1.indexOf("a"), " ").insert(example1.indexOf("g"), " ")
				      				.insert(example1.indexOf("at")+2,"").insert(example1.indexOf("sc"), " ").insert(example1.indexOf("p"), " and the owner is kuzzat and he is a okay ");
				      				
				      System.out.println(example1);
				      
		// replace       .replace( beginning index , ending index , the vale we wanna replace);    ending index will be excluded (same with substring).
				      StringBuilder replacemethod = new StringBuilder("cyber is a school");     // cybertek is a school
				      		replacemethod.replace(0, 4+1, "cybertek");
				      		System.out.println(replacemethod);
				     
				      
				      		StringBuilder replacemethod2=new StringBuilder("Cyber school a great tek wdasdqwscaassdasxczxvxcv");
				      					// cybertek is not a great school to study in
				      		replacemethod2.replace(0, replacemethod2.length(), "cybertek is not a great school to study in");
				      		System.out.println(replacemethod2);
				      		
		//delete   .delete(beginning index,   ending inedx)   ending index will be excluded
				      		
				      		StringBuilder deletemethod =new StringBuilder("Cyberteasdasczxvddasdasdasdk");   
				      					deletemethod.delete(deletemethod.indexOf("a"), deletemethod.lastIndexOf("k"));								// cybertek
				      		System.out.println(deletemethod);
				      		
				      		StringBuilder deletemethod2= new StringBuilder("Java is not fun");
				      		deletemethod2.delete(deletemethod2.indexOf(" n"), deletemethod2.indexOf(" f"));
				      		System.out.println(deletemethod2);
				      		
		// reverse:
				     // for String:
				      		String rev ="Mirzat";    // tazriM
				      		String newrev="";
				      		for(int i=rev.length()-1; i>=0;i--) {
				      				newrev +=rev.charAt(i);
				      		}
				      		System.out.println(newrev);
				      // different way: 		
				      		String str1="Mirzat", str3="";
				      		for(int i=str1.length(); i>0; i--) {
				      			str3 += str1.substring(i-1, i);
				      		}
				      		System.out.println(str1=str3);
				      		
				    // for STringBuilder:
				      		StringBuilder revbuilder= new StringBuilder("Mirzat");
				      					revbuilder.reverse();
				      		System.out.println(revbuilder);
				   
				 // toString();    stringbuildervariable.toString()     this will return String
				      		StringBuilder myb=new StringBuilder("this is builder");
				      			String newstrvalue = myb.toString();   // now it's immutable.
				      		System.out.println(newstrvalue);	
				     
				 //  Immutable vs Mutable:
				      			String A1="Mirzat";
				      				A1.concat(" Muhtar");
				      			System.out.println(A1);    // String is immutable so cnsole will print  : Mirzat
				      			
				      			A1  =	A1.concat(" Muhtar");
				      			System.out.println(A1);    // Mirzat Muhtar
				      			
				      			
				      			StringBuilder mybuilder1=new StringBuilder("cybertek");
				      					mybuilder1.append(" school");
				      					System.out.println(mybuilder1);
				      					
				      					
				      			StringBuilder newbuilder=new StringBuilder("Kuzzat");
		  newbuilder.append(" is a GOAT").insert(newbuilder.indexOf("G"), "true ").toString().replaceAll("GOAT", "")
				      .toUpperCase().replace("Kuzzat", "Mirzat");
				      			System.out.println(newbuilder);
		// Rayisa: Mirzat is a true goat.
		// Ihtipar hadax: Mirzat is a true
		//  Mirzat:  Mirzat is a goat.
		// Muhtar:   Kuzzat is a true goat
				      			
				      			StringBuilder mybuil= new StringBuilder("Java");
				      			StringBuilder mybuil2= new StringBuilder("Java");
				      			System.out.println(mybuil.equals(mybuil2));  // false
				      			System.out.println(mybuil == mybuil2);   // false
				      			  StringBuilder mybuil3 = mybuil;
				      			System.out.println(mybuil3.equals(mybuil)); // true
				      			
				      		
	}
}