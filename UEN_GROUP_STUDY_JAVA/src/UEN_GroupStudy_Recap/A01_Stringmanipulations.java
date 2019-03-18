package UEN_GroupStudy_Recap;

public class A01_Stringmanipulations {

	public static void main(String[] args) {
	//	1.  String Manipulations:  substring, indexof, lastIndexof, upperLowercase,
	//	 	 StartsEndswith, replace,	replacefirst, tocompare,  contains, 
	//   	equals&equalsIgnorecase, concate, trim,	 replaceAll, 
	//   	charAt, toCharArray,.. 	     Done					
				
	//		String str = "any letters";   // this is how we declare string
			
	// 1.	substring:	  Stringvariablename.substring(beginning index, ending index) ending index will be excluded
			String fullname="Mirzat Muhtar";  // character: 13,  index num: 12
			
			String firstname, lastname;
			
			firstname =fullname.substring(0,6);
			System.out.println(firstname);
			
			lastname=fullname.substring(7);
			System.out.println(lastname);
			
	// indexof, last index of:  stringvariable.indexof("specific character") ==> returns as int num
			
			String str1="Tomorrow is new year!";
			int indexnum1=str1.indexOf("y");     // index number of y
			System.out.println(indexnum1);
			
			String str2="my name is muhtar mahmut";
			int indexnum2=str2.indexOf("m"); // return 0
			int indexnum3 =str2.indexOf("mu");
			System.out.println(indexnum2);
			System.out.println(indexnum3);
			
			System.out.println(str2.indexOf(" mu")+1);
			
			int indexnum4 = str2.lastIndexOf("mu");
			System.out.println(indexnum4);
			
	
		//upper case lower case:
			
			String strname="mirzetahun";
				strname.substring(0, 1).toUpperCase();
				System.out.println("\n"+strname);   // won't print nay , because string is immutable
				
				strname=strname.substring(0, 1).toUpperCase() + strname.substring(1); 
				System.out.println(strname);
				
			String str2name ="cybertek is a great school in virginia and the owner is kuzzat"; //C, V, K	
				int innumV=str2name.indexOf("virginia");
				int innumK = str2name.lastIndexOf("k"); 
				int innumC= str2name.indexOf("c");
				
			str2name = str2name.substring(innumC, innumC+1).toUpperCase() + str2name.substring(1,innumV)
						+ str2name.substring(innumV, innumV+1).toUpperCase() + str2name.substring(innumV+1, innumK)
						+ str2name.substring(innumK, innumK+1).toUpperCase() + str2name.substring(innumK+1);
			
			System.out.println(str2name);
			
			
		// StartsEndswith:   boolean expression
			String AA="Rayisa";
			boolean myboolean=AA.startsWith("R");
			System.out.println(myboolean);
			
			boolean myboolean2= AA.endsWith("H");
			System.out.println(myboolean2);
			
		//replace:  it accepts char and string values 
			String newname="cybertek";
			newname = newname.replace("cybertek", "Cybertek School");
			System.out.println(newname);
			
			newname =newname.replace('e', 'K');
			System.out.println(newname);
			
			
		// replacefirst:   only accpets string value
			String newname2="muhtar mahmut";
			newname2=newname2.replaceFirst("m","M");
			newname2=newname2.replace("ma", "Ma");
			System.out.println(newname2);
			
		// Compareto:   only looks for first different character's differences 
			String name1="amazon";     // K= 97
					String name2="BOOk";   //k=66
		int A =	name1.compareTo(name2);   // 97 -66 =31
			System.out.println(A);
			
			boolean Z= name1.compareTo(name2)==0;
			System.out.println(Z);
			
			String sentance1="tomorrow is a holiday and we atre gonnahave some party tomorrow night at 6 pm";
			String sentance2="tomorrow is a holiday and we atre gonnahave somee party tomorrow night at 6 pm";
			boolean samevalue = sentance1.compareTo(sentance2)==0 && sentance2.compareTo(sentance1)==0;
			System.out.println(samevalue);
			
		// contains:   boolean expression 
			String mywords="hello cybertek";
			 boolean myboolean1=mywords.contains("Hello");
			 System.out.println(myboolean1);
			 
	 // equals & equalsignorecase: boolean expression
			 String hisname="mirzat", hisname2="mirzat";
			 
			 System.out.println(hisname.equals(hisname2));
			 
			 hisname="MiRZat"; hisname2="mIrzAT";
			 System.out.println(hisname.equalsIgnoreCase(hisname2));
			 
		// concat: 
			 String newstr1="cyber";    // immutable: read only .  mutable: can be written
			 		 newstr1.concat("tek");  // it doesnt make any change , because of immutability
			System.out.println(newstr1);
			
			newstr1= newstr1.concat("tek");
			System.out.println(newstr1);
			
			// trim: reomves white spaces. 
			String emptystr="    muhtar 1         ";
			emptystr=emptystr.trim();
			System.out.println(emptystr);
			
			// replaceAll: accepts string value only
			String rpexample1="Muhtar mahmut mirzat muhtar";
			rpexample1 =rpexample1.replaceAll("m", "M");
			System.out.println(rpexample1);
			
			// charAt:    stringvariable.charat(indexnumber)==>char
			String mycharstr="IhtiparrY Yasen";
			
			char mychar2 = mycharstr.charAt(5);
			System.out.println(mychar2);
			
			
			
	}

}