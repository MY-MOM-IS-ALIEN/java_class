package ch11_classes.ex02;


import ch11_arrayList.ex3.Book;

import java.util.List;
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
        BookDTO bookDTO = bookRepository.method5(id, price);

        System.out.println("금액이 변경 되었습니다");
        System.out.println(bookDTO);
    }

    public void method6() {
        System.out.println("삭제할 책 id");
        Long id = scanner.nextLong();
        boolean result = bookRepository.method6(id);
        if (result) {
            System.out.println("삭제 완료");
        } else {
            System.out.println("삭제 실패");
        }

//    public void search(){
//        System.out.println("검색어 : ");
//        String bookTitle = scanner.next();
//        List<BookDTO>bookDTOList = bookRepository.search(bookTitle);
//        if(bookDTOList.size() > 0){
//            for (BookDTO bookDTO : bookDTOList){
//                System.out.println("bookDTO = " + bookDTO);
//            }
//        }else {
//            System.out.println("결과가 없습니다.");
//        }
//    }
    }
}


