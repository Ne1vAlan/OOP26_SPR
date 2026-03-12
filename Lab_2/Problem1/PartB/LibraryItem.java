package Lab_2.Problem1.PartB;

public class LibraryItem {
	private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String toString() {
        return title + " " + author + " " + publicationYear;
    }
}
