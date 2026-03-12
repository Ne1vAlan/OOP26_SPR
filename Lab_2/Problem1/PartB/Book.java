package Lab_2.Problem1.PartB;

public class Book extends LibraryItem {

    private int numberOfPages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.numberOfPages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + ", pages: " + numberOfPages;
    }
}