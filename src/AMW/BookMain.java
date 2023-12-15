package AMW;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
        book1.setId(1L);
        book1.setBookTitle("그리고 아무도 없었다");
        book1.setBookAuthor("애거서 크리스티");
        book1.setBookPrice(10800);
        book1.setBookPublisher("낭만출판");
        bookList.add(book1);

        Book book2 = new Book(2L,"모모","김관진",15000,"책과사람들");
        bookList.add(book2);

        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));

        }
            bookList.get(0).setBookPrice(50000);
            bookList.get(1).setBookPublisher("리얼책방");

        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }
    }
}
