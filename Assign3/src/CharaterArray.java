import java.util.Scanner;

public class CharaterArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] Str ;
        String s = in.nextLine();
        int len = s.length();
        Str = new char[len];
        for (int i=0; i<len; i++){
            Str[i] = s.charAt(i);
        }
        //loop thru all charaters in the array
        for (int i=0; i<len; i++){
            System.out.print(Str[i]);
            if (Character.isDigit(Str[i])){
                //System.out.println(Str[i] + " is Digit.");
                System.out.print('*');
            }else if(Character.isLetter(Str[i])){
                System.out.println(Str[i] + " is Alphabet Letter.");
                if(Character.isLowerCase(Str[i])){
                    //System.out.println(Str[i] + ": The lower case is:" + Character.toUpperCase(Str[i]));
                    System.out.print(Character.toUpperCase(Str[i]));
                }else{
                    //System.out.println(Str[i] + ": The upper case is:" + Character.toLowerCase(Str[i]));
                    System.out.print(Character.toLowerCase(Str[i]));
                }
            }
        }
    }
}
