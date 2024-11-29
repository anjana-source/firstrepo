package encapsulation2;

public class User {

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setPinnumber(1234567);
		System.out.println("pin number : "+obj.getPinnumber());

	}

}
