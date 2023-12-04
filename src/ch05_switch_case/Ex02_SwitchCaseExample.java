package ch05_switch_case;

import java.util.Scanner;

public class Ex02_SwitchCaseExample {
    public static void main(String[] args) {
        //4개의 단어만 들어있음
        // desk(책상) chair(의자) monitor(모니터) mouse(마우스)
        // 프로그램을 실행하면 영어단어를 입력받고 위의 네 단어중 하나를 입력했을떄
        // 해당의미를 출력해줌. 없는단어를 입력하면 없는 단어입니다.

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력하세요");

        String ans = scanner.next();


        switch(ans){
            case"desk":
                System.out.println("책상 입니다");
                break;
            case"chair":
                System.out.println("의자 입니다");
                break;
            case"monitor":
                System.out.println("모니터 입니다");
                break;
            case"mouse":
                System.out.println("마우스 입니다");
                break;
            default:
            System.out.println("없는 단어 입니다.");
            break;
        }
        System.out.println("");




        }



    }
