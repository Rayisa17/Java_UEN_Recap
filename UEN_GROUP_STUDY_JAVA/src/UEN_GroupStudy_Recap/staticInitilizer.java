package UEN_GroupStudy_Recap;
import static UEN_GroupStudy_Recap.staticInitilizerSub.*;
import java.util.Arrays;

class staticInitilizerSub {
	 static int a,
		b, c,d,e,f;
	 

	 static String aa, 
	 bb, cc, dd, ee, ff, gg;


	 static boolean A,
	 B, C, D, E, F, G, H, I;

	 static String[] myarray=new String[5];

}


public class staticInitilizer {
	
	
	static {
		a=10;	b=20;	c=30;	
		d=40;	e=50; 	f=60;
		bb="muhtar"; cc="mirzat"; dd="b";
		A=false; B=true; C=false;
		myarray[0] ="a";
		
		for(int i=1; i<myarray.length; i++) 
			myarray[i]="C";
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(f);
		System.out.println(Arrays.toString(myarray));
		
	}
	

}