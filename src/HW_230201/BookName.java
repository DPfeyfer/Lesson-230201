package HW_230201;

public class BookName {
    private String bookName;
    private AuthorName author;
    private int yearBook;

    public BookName() {
    }

    public BookName(String bookName, AuthorName authorName, int yearBook) {
        this.bookName = bookName;
        this.author = authorName;
        this.yearBook = yearBook;
    }

    public String getBookName() {
        return this.bookName;
    }

    public AuthorName getAuthorName() {
        return this.author;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(AuthorName authorName) {
        this.author = authorName;
    }

    public String toString() {
        return "Book name: " + this.bookName + this.author + " year of publishing: "
                + this.yearBook;
    }
}
