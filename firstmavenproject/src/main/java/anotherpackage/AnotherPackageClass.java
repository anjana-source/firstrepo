package anotherpackage;

import accessspecifier.Access11;

public class AnotherPackageClass extends Access11 {

	public static void main(String[] args) {
		AnotherPackageClass obj=new AnotherPackageClass();
		obj.protectedMethod();
		obj.publicMethod();
	

	}

}
