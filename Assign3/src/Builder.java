import java.util.Scanner;

public class Builder {
    
    
    public static void main(String[] args) {
    	System.out.println("Enter String : Java Is Fun!");
    	int len1;
        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();
        StringBuilder sb = new StringBuilder(s);
        len1 = sb.length();
       
        System.out.print(sb + " Length=" + sb.length());
        sb.append("I Love it!");
        System.out.print(sb + " Length=" + sb.length());
        System.out.println("Enter Yes!");
        s = in.nextLine(); // user enter "Yes,"
        sb.insert( len1 , s);
        System.out.print(sb +" " + " Length=" +" "+ sb.length());
    }
}
