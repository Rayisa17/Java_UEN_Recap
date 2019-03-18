package UEN_GroupStudy_Recap;


class webdriver{
	public void gEt() {
		System.out.println("just a driver");
	}
	public void nevigatemethod() {
		System.out.println("driver nevigated");
	}
	public void j() {
		System.out.println("my J");
	}
}
class chromedriver extends webdriver{
	
	public void gEt() {
		System.out.println("crhome exeuted");
	}	
	public void nevigatemethod() {
		System.out.println("nevigated");
	}
	public void n() {
		System.out.println("my n");
	}
}
class firefoxdriver extends chromedriver {
	
	public void gEt() {
		System.out.println("firefox executed");
	}
	public void nevigatemethod() {
		System.out.println("fire fox nevigated");
	}
	public void m() {
		System.out.println("my m");
	}
}


public class polymorphismsss {

	public static void main(String[] args) {
		webdriver driver=new chromedriver();
		  driver.nevigatemethod();  // it will give the chrome driver' nevigate method
		  driver.j();  // // it will give the web driver's j() method's value, because chromere driver does not have j() method
		  	//  driver.n()     will give compile because refrence class webdriver doesnt have n() method
		  				// only the reference class's (webdriver)  methods are executable.
		  
		  
	// 	chromedriver driver2 =new webdriver();     child class can not be reference. 
		  chromedriver driver3= new firefoxdriver();  // a class can be create it's own object or child class' object.
		  driver3.n();
		  driver3.nevigatemethod();
		  driver3.gEt();
		//    driver3.m();      only the reference class's(chrome driver) methods are executable 
		  
	}
}
