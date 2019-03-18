package UEN_GroupStudy_Recap;

class Animals{
	public void eats() {
		System.out.println("Animal eats Food");
	}
	public void drinks() {
		System.out.println(" Animal drinks Water");
	}
	public void shits() {
		System.out.println("Animal SHits poo");
	}
	public void sleeps() {
		System.out.println(" Animal Sleeps at Night");
	}
}
class Bird extends Animals{
	public void flys() {
		System.out.println("Bird flys");
	}
	public void sings() {
		System.out.println("bird sings");
	}
	public void drinks() {
		System.out.println("Bird Drinks pepsi");
	}
}
class Dog extends Animals{
	public void barks() {
		System.out.println("Dog barks");
	}
	public void fights() {
		System.out.println("Dog fights");
	}
	public void sleeps() {
		System.out.println("Dog sleeps");
	}
	
}
class vegance extends Bird{
	public void drinks(){
		System.out.println("Vodka");
	}
	public void sleeps() {
		System.out.println("on the cauch");
	}
	public void sings() {
		System.out.println("Mukam");
	}
}


public class Polymorphisisim2 {

	public static void main(String[] args) {
		
		//  Polymorphisim:  1. can be reused, 2. flexible, 3. very dynamic  (when it runs)
		
		   Dog myobject= new Dog();
		  myobject.barks();
		  myobject.fights();
		  myobject.sleeps();        // Conclusion:  only the reference class' ( Dog class) methods can be called 
		 
//		  Animals myobj2= new Animals(); //  reference calss Animal creating it's own object
//		   Animals myobj3= new Dog();		//  reference calss Animal creating it's child class' (Dog) object
//		   Animals myobj4 = new Bird();      // eference calss Animal creating it's child class' (Bird) object
		   					//   Conclusion:  a reference class can create it's own object and it's child classe' objects
		   System.out.println("=============================================================");
		   Animals methodcheck1= new Dog();   // reference class is animal , so only animal class's methods can be called.
		   		methodcheck1.eats();      // "Animal Eats food";
		   		
		   		methodcheck1.drinks();    // "Animal Drinks";
		   		
		   		methodcheck1.shits();   // "Animal Shits";
		   		
		   		methodcheck1.sleeps();   // "Dog Sleeps";     // sleeps method is also exist in child class , so therefore it will return child classe' method
		   			//  Conclusion: therefore if a method is exist in both parent and child class, it will return the child classe' method
		
		   System.out.println("\n   ============================================================");
		   
		   Animals methodcheck2= new Bird();
		   		methodcheck2.eats();    // "Anilams eats food";    because child class doesnt have the eats method, therefore system will return parent class' method
		   		
		   		methodcheck2.drinks();  //"Bird Drinks pepsi";    because child class has drinks method, so system will return child class' methd
		   		
		   		methodcheck2.shits();  //"Animal Shits poo";     because child class doesnt have the shitss method, therefore system will return parent class' method
		   		 
		   		methodcheck2.sleeps();  // "Animal Sleeps at night"     = = 
		   		
		   		System.out.println("/n ===========================================  ");
		   
		   Bird myobj5 = new vegance();       // vegance:  drinks,  sleeps, sings                 bird: flys, sings, drinks
		   	  myobj5.drinks(); // Vodka;    because child class also has drink method
		   	  
		   	  myobj5.sings(); // "Mukam" ;  because child class also has sings method
		   	  
		   	  myobj5.flys();  // "bird flys"   because flys method only exist in reference class.

	}
}