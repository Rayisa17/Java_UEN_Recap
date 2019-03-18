package UEN_GroupStudy_Recap;

class sensitiveInfo {
	// private: can only use it with in class
	private String phonenumber = "12123312";
	private int SSN = 7812312;
	private int account = 999;
	private String userpassword = "test";

	public void set() {
		System.out.println(phonenumber);
		System.out.println(SSN);
		System.out.println(account);
		System.out.println(userpassword);
	}
	
	// getter and setters: grant access to confidential data through sub class
	public String getPHN() {
		return phonenumber;
	}

	public void setPHN(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int a) {
		SSN = a;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;

	}

	public void setupinfo(String phonenumber, int SSN, int account, String userpassword) {
		this.phonenumber = phonenumber;
		this.SSN = SSN;
		this.account = account;
		this.userpassword = userpassword;
	}

	public String getuserpassword() {
		return userpassword;
	}
}

public class A17_Encapsulation {
	public static void main(String[] args) {
		// hiding data within class, grants other specific class access to it with the
		// certain ways.
		// protect the intigrity and confidentiality of the data.!

		sensitiveInfo info = new sensitiveInfo();

		System.out.println(info.getPHN());
		info.setPHN("987654");
		System.out.println(info.getPHN() + "\n");

		System.out.println(info.getSSN());
		info.setSSN(8231);
		System.out.println(info.getSSN() + "\n");

		System.out.println(info.getAccount());
		info.setAccount(888);
		System.out.println(info.getAccount() + "\n");

		System.out.println("========================");

		info.setupinfo("911", 9876543, 901234, "test");
		System.out.println(info.getPHN());
		System.out.println(info.getAccount());
		System.out.println(info.getSSN());
		System.out.println(info.getuserpassword());
	}
	
	// Conclusion:  Encapsulation hides the sensitive data within the class, 
	// and can grant access to other classes so that other classes can access to private data(variables) 

}