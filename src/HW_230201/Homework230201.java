package HW_230201;

public class Homework230201 {
    public static void main(String[] args) {
        AuthorName astrid = new AuthorName("Astrid", "Lindgren");
        AuthorName lyman = new AuthorName("Lyman", "Frank");
        BookName karlsson = new BookName("Karlsson", astrid, 1955);
        BookName karlsson1 = new BookName("Karlsson", astrid, 1955);
        BookName wizard = new BookName("The Wizard of Oz", lyman, 1939);

//        karlsson.setYearBook(1965);
        wizard.setYearBook(1939);

        System.out.println(karlsson);
        System.out.println(wizard);
        System.out.println(karlsson.equals(karlsson1));
    }
}
