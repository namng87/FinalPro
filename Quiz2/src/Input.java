import javax.swing.JOptionPane;
	//JOption Input
public class Input {
	public static String username;
	public static String password;
	
	public static void main(String[] args) {
		Authentication A = new Authentication();
		username = JOptionPane.showInputDialog(null, "Enter Username");
		password = JOptionPane.showInputDialog(null, "Enter Password");
		
		
	if(A.authentication(username,password)){
			JOptionPane.showMessageDialog(null, "Welcome");
			
		}
		else{
			JOptionPane.showMessageDialog(null, "Invalid");
		}
	}

}