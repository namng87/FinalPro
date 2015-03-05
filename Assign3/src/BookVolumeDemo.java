
public class BookVolumeDemo {
    public static void main(String[] args) {
        Book [] books = new Book[5];
        books[0] = new Book("The Java","Mr. Me", 100);
        books[1] = new Book("The Wondeful World","Mr. A",120);
        books[2] = new Book("7 Days with Java","Mr. C",150);
        books[3] = new Book("Tom and Jerry","Tom Cruise",200);
        books[4] = new Book("Gone With The Wind","The 70s Author",1000);
        BookVolume volume1 = new BookVolume("The #1 Java Volume", 5, books);
        
        System.out.print(volume1);
    }
}