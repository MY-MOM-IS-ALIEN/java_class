package ch11_classes.ex02;


import ch11_arrayList.ex3.Book;

import java.util.Scanner;

public class BookService {
    BookRepository bookRepository = new BookRepository();
    Scanner scanner = new Scanner(System.in);

    public void method1() {
        BookDTO bookDTO = new BookDTO("이것이 자바다", "신용권", 36000, "한빛미디어");
        bookRepository.method1(bookDTO);
        System.out.println(bookRepository.method1(bookDTO));
    }

    public void method2() {
        bookRepository.method2();
    }

    public void method3() {
        System.out.println("조회할 id 입력");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.method3(id);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("입력하신 정보를 찾을 수 없습니다.");
        }
    }

    public void method4() {
        System.out.println("조회할 책 제목 입력");
        String bookTitle = scanner.nextLine();
        BookDTO bookDTO = bookRepository.method4(bookTitle);
        if (bookDTO != null) {
            System.out.println("bookDTO = " + bookDTO);
        } else {
            System.out.println("입력하신 정보를 찾을 수 없습니다.");
        }
    }

    public void method5() {
        System.out.println("가격 수정할 책 id");
        Long id = scanner.nextLong();
        System.out.println("변경할 금액");
        int price = scanner.nextInt();
        BookDTO bookDTO = bookRepository.method5(id,price);

        System.out.println("금액이 " + bookDTO + "원으로 변경 되었습니다");
    }

}


