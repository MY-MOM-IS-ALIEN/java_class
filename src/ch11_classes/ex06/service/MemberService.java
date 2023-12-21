package ch11_classes.ex06.service;

import ch11_classes.ex06.DTO.MemberDTO;
import ch11_classes.ex06.repository.MemberRepository;

import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();

    public void join(){
        System.out.println("사용할 이메일");
        String memberEmail = scanner.next();
        MemberDTO memberDTO = memberRepository.check(memberEmail);
        if(memberDTO != null){
            System.out.println("이미 사용중인 이메일 입니다.");
        }else {
            System.out.println("비밀번호 입력");
            String memberPassword = scanner.next();
            System.out.println("가입자 성명");
            String memberName = scanner.next();
            System.out.println("전화번호 입력");
            String memberMobile = scanner.next();
            MemberDTO memberDTO1 = new MemberDTO(memberEmail,memberPassword,memberName,memberMobile);
            boolean result = memberRepository.join(memberDTO1);
            if(result){
                System.out.println("가입 완료");
            }else {
                System.out.println("가입 실패");
            }
        }

    }
}
