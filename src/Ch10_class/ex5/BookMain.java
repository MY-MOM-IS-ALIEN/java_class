package Ch10_class.ex5;

import java.util.Arrays;

public class BookMain {
    public static void main(String[] args) {
        //책 정보는 시중에 있는 실제 책으로 ㄱㄱ
        //기본생성자로 객체 만들고 필드값 채우기
        Book book1 = new Book();
        book1.bookTitle = "밴드오브브라더스";
        book1.bookAuthor = "스티븐 앰브로스";
        book1.bookPublisher = "월간베스트인코리아";
        book1.isbn = "8995259914";
        book1.bookPrice = "8,550원";

        System.out.println("bookTitle = " + book1.bookTitle + ", bookAuthor = " + book1.bookAuthor + ", bookPublisher = " + book1.bookPublisher + ", isbn = " + book1.isbn + ", bookPrice = " + book1.bookPrice);

        // 매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기
        Book book2 = new Book("밴드오브브라더스", "스티븐 앰브로스");


        // 모든 매개변수 있는 생성자로 객체 만들고 필드값 채우기
        Book book3 = new Book("밴드오브브라더스", "스티븐 앰브로스", "월간베스트인코리아", "8995259914", "8,550원");
    }
}
