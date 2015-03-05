
public class BookVolume {
    private String volumeName;
    private int numberOfBooks;
    private Book [] books;
    
    public BookVolume(String volumeName, int numberOfBooks, Book [] books){
        this.volumeName = volumeName;
        this.numberOfBooks = numberOfBooks;
        this.books = books;
    }
    public String toString(){
        String vol = "Colume " + volumeName + " has " + numberOfBooks + " books";
        vol += getBookArray();
        return vol;
    }
    
    public String getBookArray(){
        String bookString = null;
        for (int i=1; i<= numberOfBooks; i++){
            bookString += "Book #" + i + books[i-1];
        }
        return bookString;
    }
}
