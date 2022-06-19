package greatLearming;
import java.util.Scanner;
public class driver {

	public static void main (String args[]) {
		String firstname;
		String lastname;
		String department = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name = ");
	  
		firstname = sc.next();
		
		System.out.println("Enter last name = ");
		lastname = sc.next();
		
		System.out.println("Please from the following options : \n 1. Technical \n 2. Admin \n 3. Human resource \n 4. Legal");
		int dep = sc.nextInt();
		switch(dep) {
		case 1: 
			department = "Technical";
			break;
		case 2:
			department = "Admin";
			break;
		case 3: 
			department = "Human Resource";
		break;
		case 4: 
			department = "Legal";
		break;
		}
		Employee emp = new Employee(firstname, lastname, department);
		credentialservice obj = new credentialservice();
		obj.generatecredential(emp);
		obj.generatePassword(emp);
		obj.showcred(emp);
	}
}
