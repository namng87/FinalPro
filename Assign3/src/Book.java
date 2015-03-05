public class Book {
    private String Title;
    private String Author;
    private int numberOfPages;
    
    public Book(String title, String author, int numberOfPages) {
        this.Title = title;
        this.Author = author;
        this.numberOfPages = numberOfPages;
    }
    
    
    public String toString (){
        return "Title: "+ Title + " Author: " + Author + " - Number of Pages:" +numberOfPages;
    }
}
