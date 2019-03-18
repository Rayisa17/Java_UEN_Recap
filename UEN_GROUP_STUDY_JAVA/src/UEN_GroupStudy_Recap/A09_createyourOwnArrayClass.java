package UEN_GroupStudy_Recap;

class Arraymethods{
	public static void printarray(myAnimal[] p) {
		String a1="[";
		for(int i=0; i< p.length; i++) {
			a1=a1+p[i];
		}
		a1=a1.substring(0,a1.length()-3)+"]";
		
		System.out.println(a1);
		
	}
}

class myAnimal{
	protected String name;
	protected String gender;
	protected String color;
	protected int age;
	
	public void animalinfo (String name, String gender, String color, int age) {
		this.name=name;
		this.gender =gender;
		this.color =color;
		this.age =age;
		
	}
	public String toString() {
		return  name + ", "+ gender +", "+ color +", "+age+" | "; 
	}
	
}

public class A09_createyourOwnArrayClass {	

	public static void main(String[] args) {
		myAnimal myobj= new myAnimal();
			myobj.animalinfo("Dog", "Male", "white", 7);
			System.out.println("first animal: "+myobj);
			
		myAnimal myobj2 =new myAnimal();
				myobj2.animalinfo("Cat", "Male", "red", 12);
		
		myAnimal myobj3 =new myAnimal();
				myobj3.animalinfo("Tiger", "male", "white", 10);
				
				
				myAnimal[] myownarray = {myobj, myobj2, myobj3 };
			System.out.println(myownarray[0]);
			
			Arraymethods.printarray(myownarray);
			
			

	}
	public static void printArray(myAnimal[] p) {
		String a1="[";
		for(int i=0; i< p.length; i++) {
			a1=a1+p[i];
		}
		a1=a1.substring(0,a1.length()-3)+"]";
		
		System.out.println(a1);
	}
	public static void printeachindexofarray(myAnimal[] p, int a) {
		String A=""+p[a];
		A=A.substring(0, A.length()-2);
		System.out.println(A);
		
	}

}