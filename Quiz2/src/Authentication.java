import java.util.Scanner; 

public class Authentication {
	
	static Scanner sc = new Scanner(System.in);	
	static String correctusername = "Nam";
	static String correctpassword = "Il0vfam12";
	static String username, password;
	
	
	public static boolean authentication(String username, String password){
		boolean status = false;
		if(correctusername.equalsIgnoreCase(username)){
			if(correctpassword.equals(password)){
				status = true;
			}
			else{
			}
		}
		else{
			status = false;
		}
		return status;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Enter Username");
		username = sc.next();
		System.out.println("Enter Password");
		password = sc.next();
		
		if(authentication(username, password)){
			System.out.println("welcome");
		}
		else{
			System.out.println("Invalid");
		}
	}
}
	