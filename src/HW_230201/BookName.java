package HW_230201;

import java.util.Objects;

public class BookName {
    private String bookName;
    private Author author;
    private int yearBook;

    public BookName() {
    }

    public BookName(String bookName, Author authorName, int yearBook) {
        this.bookName = bookName;
        this.author = authorName;
        this.yearBook = yearBook;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
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

    public void setAuthorName(Author authorName) {
        this.author = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookName bookName1 = (BookName) o;
        return yearBook == bookName1.yearBook && Objects.equals(bookName, bookName1.bookName) && Objects.equals(author, bookName1.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearBook);
    }

    public String toString() {
        return "Book name: " + bookName + author + " year of publishing: "
                + yearBook;
    }
}
