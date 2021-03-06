package predicate.program.for_user.authentication;
import java.util.Scanner;
import java.util.function.Predicate;
public class Test {

	public static void main(String[] args) {
		
		Predicate<User> user_predicate = user -> user.username.equals("mahesh") && user.password.equals("lamichhane");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Username");
		String username = sc.next();
		System.out.println("Enter Your Password");
		String password = sc.next();
		
		if(user_predicate.test(new User(username,password))) {
			System.out.println("User Access Successful");
		}
		else {
			System.out.println("User Access Unsuccessful");
		}

	}

}
