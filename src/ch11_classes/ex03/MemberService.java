package ch11_classes.ex03;

import ch11_classes.ex02.BookDTO;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();
    private static String loginEmail = null;

    public void join() {
        boolean run = true;
        while (run) {
            System.out.println("사용할 이메일 입력");
            String memberEmail = scanner.next();
            System.out.println("사용할 패스워드 입력");
            String memberPassword = scanner.next();
            System.out.println("가입자 이름 입력");
            String memberName = scanner.next();
            System.out.println("가입자 전화번호 입력");
            String memberMobile = scanner.next();
            MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
            boolean result = memberRepository.join(memberDTO);
            if (result) {
                System.out.println("가입 완료");
            } else {
                System.out.println("가입 실패");
            }
        }
    }


    public void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("아이디 입력");
        String memberEmail = scanner.next();
        System.out.println("비밀번호 입력");
        String memberPassword = scanner.next();

        MemberDTO memberDTO = memberRepository.login(memberEmail, memberPassword);

        if (memberDTO != null) {
            loginEmail = memberEmail;
            System.out.println("로그인 성공!");
        } else {
            System.out.println("로그인 실패. 아이디 또는 비밀번호를 확인하세요.");
        }
    }

    public void findAll() {
        List<MemberDTO> memberDTOList = memberRepository.findAll();
        for (MemberDTO memberDTO : memberDTOList) {
            System.out.println("memberDTO = " + memberDTO);
        }
    }

    public void update() {
        if (loginEmail != null) {
            System.out.println("변경할 전화번호를 입력하세요");
            String memberMobile = scanner.next();
            boolean memberDTO = memberRepository.update(memberMobile);

            if (memberDTO) {
                System.out.println("변경 성공");
            } else {
                System.out.println("변경 실패");
            }
        } else {
            System.out.println("로그인 후 변경 가능합니다.");
        }
    }

    public void resign() {
        if (loginEmail != null) {
            System.out.println("비밀번호를 입력하세요");
            String memberPassword = scanner.next();
            boolean memberDTO = memberRepository.resign(memberPassword);
            if (memberDTO) {
                System.out.println("탈퇴 성공");
            }
        } else
            System.out.println("로그인 후 탈퇴 가능합니다.");
    }

    public void logout() {
        if (loginEmail != null) {
            System.out.println("로그아웃 하시겠습니까?");
            System.out.println("1.예 | 2.아니오");
            int choice = scanner.nextInt();
            if (choice == 1) {
                loginEmail = null;
                System.out.println("로그아웃 되었습니다.");
            }
        }
    }
}
