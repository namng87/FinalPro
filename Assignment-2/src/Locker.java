import java.util.Scanner;

public class Locker {
    private int LockerID;
    private String StudentName;
    private int Books;
    private CombinationLock ComLock;
    public Locker(){
        LockerID = 0;
        Books = 0;
        StudentName = "";
        ComLock = null;
    }
    public Locker(int id, String Sname, int books, CombinationLock lock){
        LockerID = id;
        Books = books;
        StudentName = Sname;
        ComLock = lock;
    }
    public void setLockerID(int LockerID) {
        this.LockerID = LockerID;
    }

    public int getLockerID() {
        return LockerID;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setBooks(int Books) {
        this.Books = Books;
    }

    public int getBooks() {
        return Books;
    }
    
    public void setComLock(CombinationLock ComLock) {
        this.ComLock = ComLock;
    }

    public CombinationLock getComLock() {
        return ComLock;
    }
    
    public void putBookInLocker (){
        Books++;
    }
    public boolean removeBookFromLocker(){
        if (Books > 0){
            Books--;
            return true;
        }
        System.out.print("There is NO book in this Locker ...");
        return false;
    }
    public void openLocker(){
        Scanner in = new Scanner(System.in);
        int cn1,cn2,cn3;
        System.out.print("Enter the First Combination Number (0-39)");
        cn1 = in.nextInt();
        System.out.print("Enter the Second Combination Number (0-39)");
        cn2 = in.nextInt();
        System.out.print("Enter the Third Combination Number (0-39)");
        cn3 = in.nextInt();
        boolean lockStatus = ComLock.openLock(cn1, cn2, cn3);
        if(lockStatus)
            System.out.print("Locker has been Opened SUCCESSFULLY");
        else
            System.out.print("Locker CLOSED: The Combination you enter is not Correct ....");
        
    }
    public String toString(){
        String lock = "LockerID:" + LockerID + "\n" +
            "Student:" + StudentName + "\n" +
            "Books: "+ Books + "\n" +  ComLock;
        return lock;
    }
    
}