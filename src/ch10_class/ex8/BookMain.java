package ch10_class.ex8;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookTitle("책제목1");
        String title = book.getBookTitle();

        book.setBookAuthor("저자1");
        System.out.println(book.getBookAuthor());
    }
}
