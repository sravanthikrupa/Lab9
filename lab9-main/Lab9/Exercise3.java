package Lab9;

interface Validation{
	public boolean doValidation(String userName, String password);
}
public class Exercise3 {

	public static void main(String[] args) {
		Exercise3 obj = new Exercise3();
		obj.createValidation();

	}
	
	public void createValidation() {
		Validation v = (userName, password)-> userName.equals("Tejashwini")&&
				password.equals("Tejas@123");
		boolean res = v.doValidation("Tejas]hwini", "Tejas@123");
		System.out.println("validation is: "+res);
		
	}
}
