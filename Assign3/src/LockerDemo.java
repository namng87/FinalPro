import java.util.Scanner;

public class LockerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locker locker1 = new Locker(100,"Mickey Mouse",3, new CombinationLock(28,17,39));
        Locker locker2 = new Locker(275,"Donald Duck",0, new CombinationLock(36,16,27));
        locker1.openLocker(); // Enter 15 , 18, 18 when promted
        // Add three books into Mouse's locker
        locker1.putBookInLocker();
        locker1.putBookInLocker();
        locker1.putBookInLocker();
        // Remove one book from Duck's locker
        locker2.removeBookFromLocker();
        
        System.out.print(locker1);
        System.out.print(locker2);
    }
}