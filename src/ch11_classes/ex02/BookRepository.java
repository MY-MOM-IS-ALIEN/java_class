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
            BookDTO bookDTO1 = bookDTOList.get(i);
            if (id.equals(bookDTO1.getBookPrice())) {
                if (bookDTO1.equals(bookDTO)) {
                    bookDTO1.setBookPrice(price);
                    bookDTO = bookDTO1;
                    break;
                }
            }
        }
        return bookDTO;
    }
}


