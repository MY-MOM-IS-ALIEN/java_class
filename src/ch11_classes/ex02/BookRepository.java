package ch11_classes.ex02;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookRepository {
    private static List<BookDTO> bookDTOList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public boolean method1(BookDTO bookDTO) {
        return bookDTOList.add(bookDTO);
    }

    public void method2() {
        for (int i = 0; i < bookDTOList.size(); i++) {
            System.out.println(bookDTOList.get(i));
        }

    }

    public BookDTO method3(Long id) {
        BookDTO bookDTO = null;

        for (int i = 0; i < bookDTOList.size(); i++) {
            if (id.equals(bookDTOList.get(i).getId())) {
                bookDTO = bookDTOList.get(i);
            }
        }
        return bookDTO;
    }

    public BookDTO method4(String bookTitle) {
        BookDTO bookDTO = null;

        for (int i = 0; i < bookDTOList.size(); i++) {
            if (bookTitle.equals(bookDTOList.get(i).getBookTitle())) {
                bookDTO = bookDTOList.get(i);
            }
        }
        return bookDTO;
    }

    public BookDTO method5(Long id, int price) {
        BookDTO bookDTO = null;

        for (int i = 0; i < bookDTOList.size(); i++) {
            if (id.equals(bookDTOList.get(i).getId())) {
                BookDTO bookDTO1 = bookDTOList.get(i);
                bookDTO1.setBookPrice(price);
                bookDTO = bookDTO1;
            }
        }
        return bookDTO;
    }

    public boolean method6(Long id) {
        boolean result = false;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (id.equals(bookDTOList.get(i).getId())) {
                bookDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }


    public List<BookDTO>search(String bookTitle){
        List<BookDTO> bookDTOS = new ArrayList<>();
        for (int i = 0; i < bookDTOList.size(); i++) {
            // 저장되어 있는 도서명에 검색어가 포함되어 있으면 true
            if(bookDTOList.get(i).getBookTitle().contains(bookTitle)){
                //조건을 만족하면 bookDTOS에 추가
                bookDTOS.add(bookDTOList.get(i));
            }
        }
        return bookDTOS;
    }
}



