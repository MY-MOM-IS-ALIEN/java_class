package AMW.Service;

import AMW.Commonvariables;
import AMW.DTO.MemberDTO;
import AMW.Repository.AirlineRepository;
import AMW.Repository.MemberRepository;

import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    AirlineService airlineService = new AirlineService();
    Scanner scanner = new Scanner(System.in);

    public void save() {
        System.out.println("사용하실 이메일을 입력해주세요. ");
        String memberEmail = scanner.next();
        boolean memberDTO = memberRepository.check(memberEmail);
        if (memberDTO) {
            System.out.println("패스워드를 입력해주세요");
            String memberPassword = scanner.next();
            System.out.println("가입자 성명을 입력해주세요");
            String memberName = scanner.next();
            System.out.println("가입자 전화번호를 입력해주세요");
            String memberMobile = scanner.next();
            MemberDTO memberDTO1 = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile,0);
            boolean result = memberRepository.save(memberDTO1);
            if (result) {
                System.out.println("가입 완료");
            } else {
                System.out.println("가입 실패");
            }
        } else {
            System.out.println("이미 사용중인 이메일입니다 다른 이메일을 입력해주세요.");
        }
    }

    public void login() {
        System.out.println("이메일 입력");
        String memberEmail = scanner.next();
        System.out.println("패스워드 입력");
        String memberPassword = scanner.next();
        boolean memberDTO = memberRepository.login(memberEmail, memberPassword);
        if (memberDTO) {
            System.out.println("로그인 성공");
            System.out.println("환영합니다 " + memberEmail + " 님!");
            Commonvariables.loginEmail = memberEmail;
        } else {
            System.out.println("로그인 실패, 이메일 또는 비밀번호를 확인하세요");
        }
    }

    public void update() {
        if (Commonvariables.loginEmail == null) {
            System.out.println("로그인 후 수정 가능합니다.");
        } else {
            System.out.println("수정할 전화번호 입력");
            String memberMobile = scanner.next();
            boolean memberDTO = memberRepository.update(memberMobile);
            if (memberDTO) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");
            }
        }
    }

    public void delete() {
        if (Commonvariables.loginEmail == null) {
            System.out.println("로그인 후 삭제 가능합니다.");
        } else {
            System.out.println("비밀번호 입력");
            String memberPassword = scanner.next();
            boolean memberDTO = memberRepository.delete(memberPassword);
            if (memberDTO) {
                System.out.println("탈퇴 성공");
            } else {
                System.out.println("비밀번호가 틀립니다.");
            }
        }
    }

    public void logout() {
        Commonvariables.loginEmail = null;
        System.out.println("로그아웃 되었습니다.");
    }

    public void airline() {
        boolean run = true;

        while (run) {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("1.항공권 조회 | 2.항공권 예매 | 3.예매정보 조회 | 4.예매정보 변경 | 5.체크인 | 0.종료");
            System.out.println("----------------------------------------------------------------------------");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                airlineService.findAll();
            } else if (selectNo == 2) {
                airlineService.reservation();
            }
        }
    }
}

