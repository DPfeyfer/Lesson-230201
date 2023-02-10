package HW_230201;

public class Homework230201 {
    public static void main(String[] args) {
        Author astrid = new Author("Astrid", "Lindgren");
        Author astrid1 = new Author("Astrid", "Lindgren");
        Author lyman = new Author("Lyman", "Frank");
        BookName karlsson = new BookName("Karlsson", astrid, 1955);
        BookName karlsson1 = new BookName("Karlsson", astrid, 1955);
        BookName wizard = new BookName("The Wizard of Oz", lyman, 1939);

//        karlsson.setYearBook(1965);
        wizard.setYearBook(1939);

        System.out.println(karlsson);
        System.out.println(wizard);
        System.out.println(astrid.equals(astrid1));
        System.out.println(karlsson.equals(karlsson1));
    }
}
