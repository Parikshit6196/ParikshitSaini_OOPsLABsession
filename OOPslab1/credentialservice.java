package greatLearming;

import java.util.Random;

public class credentialservice {

	int length = 10;
	public char[] generatePassword(Employee emp) {
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		char[] password=new char[10];
		
		for(int i=0;i<length;i++) {
			
			password[i]=passwordSet.charAt(random.nextInt(passwordSet.length()));
		
		}
		emp.setPassword(String.valueOf(password));
		return password;
	}
	
	public String generatecredential(Employee emp) {
		String email = emp.getFirstname()+ emp.getLastname()+"@"+emp.getDepartment()+".gl.com";
		emp.setEmail(email);
		return email;
		
	}
	
	public void showcred(Employee emp) {
		System.out.println(" Employee details " +emp.getFirstname() +" are :\n Your email:-  " + emp.getEmail()+ "\n your password:- "+emp.getPassword());
	}
}
