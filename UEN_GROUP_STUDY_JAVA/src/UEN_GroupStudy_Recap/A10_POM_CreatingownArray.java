package UEN_GroupStudy_Recap;

import java.util.*;

class neededmethodsForUEN{
	static Scanner scan = new Scanner(System.in);
	public  static String printmyownarray(EmployeesinUEN[] p) {
		String mystr ="";
		for(int i=0; i<p.length; i++) {
			mystr = mystr+ p[i]+"| ";
		}
		mystr ="{"+mystr.substring(0, mystr.length()-2)+"}";   // in order to remove last " | " we need substring 
	
		return mystr;	
		
	}
	public static String capitilize(String a) {
		return a=a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
		
	}
	public static void gettheuserInfo(EmployeesinUEN[] p) {
		System.out.println("Enter your first name");
			String strname=scan.next();   // muhtar   ===> Muhtar
				strname = capitilize(strname);
				
			
		for(int i=0; i < p.length; i++) 
			if(p[i].name.substring(0, p[i].name.indexOf(" ")).equals(strname)) {
				System.out.println("Your full name is: "+p[i].name+"\n"+"You are from: "+p[i].from +"\nYour ID number is: "+p[i].ID+"\nYour Age is: "+p[i].age+
						"\nYour years of experience is: "+p[i].yearsofExperience+"\n Your Boolean value is: "+p[i].bvalue);
				System.exit(0);
			}
			
		for(int i=0; i < p.length; i++) 
			if(!(p[i].name.substring(0, p[i].name.indexOf(" ")).equals(strname))) {
				System.out.println("Not Exist");
				break;
				}
		}
		
	public static void voidgetuserID(EmployeesinUEN[] p) {
		System.out.println("Enter your Id number");
			int userid = scan.nextInt();   // muhtar   ===> Muhtar
			
		for(int i=0; i < p.length; i++) 
			if(p[i].ID == userid) {
				System.out.println("Your full name is: "+p[i].name+"\n"+"You are from: "+p[i].from +"\nYour ID number is: "+p[i].ID+"\nYour Age is: "+p[i].age+
						"\nYour years of experience is: "+p[i].yearsofExperience+"\n Your Boolean value is: "+p[i].bvalue);
				System.exit(0);
			}
			
		for(int i=0; i < p.length; i++) 
			if(p[i].ID != userid) {
				System.out.println("Not Exist");
				break;
				}	
	}
}		
	

class EmployeesinUEN{
	public String name, from;
	 public int ID, age, yearsofExperience;
	 public boolean bvalue;
	 
	 public void setInfos ( String name, String from, int ID, int age, int yearsofExperience, boolean bvalue) {
		 this.name =name;		 this.from = from;		 this.ID =ID;		 this.age = age;		this.yearsofExperience =yearsofExperience;		 this.bvalue=bvalue;
	 
	 }
	 
	 public String toString() {
		 return name+", "+from+", "+ID+", "+age+", "+yearsofExperience+", "+bvalue;
	 }
	
}

public class A10_POM_CreatingownArray {

	public static void main(String[] args) {
		EmployeesinUEN muhtar = new EmployeesinUEN();
			muhtar.setInfos("Muhtar Mahmut", "Yarkan", 1, 24, 40, true);   // muhtar 
			
		EmployeesinUEN Rayisa = new EmployeesinUEN();
			Rayisa.setInfos("Rayisa Abdurehim", "Virginia", 4, 23, 45, false);
			
		EmployeesinUEN Ihtipar = new EmployeesinUEN();
			Ihtipar.setInfos("Ihtipar Yasen", "Virginia", 3, 30, 50, false);
		
		EmployeesinUEN Miirzat = new EmployeesinUEN();
			Miirzat.setInfos("Mirzat Muhtar", "West Virginia", 2, 30, 60, true);
		
			EmployeesinUEN[] myarray = {muhtar, Rayisa,Ihtipar, Miirzat};	
			System.out.println(myarray[3]);
			
			
			
			System.out.println(neededmethodsForUEN.printmyownarray(myarray));

			neededmethodsForUEN.voidgetuserID(myarray);
			
			
			
	}
	
}
