package ch11_classes.ex06.service;

import ch11_classes.ex06.CommonVariables;
import ch11_classes.ex06.DTO.MemberDTO;
import ch11_classes.ex06.repository.MemberRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();
    BoardService boardService = new BoardService();

    public void join() {
        System.out.println("사용할 이메일");
        String memberEmail = scanner.next();
        MemberDTO memberDTO = memberRepository.check(memberEmail);
        if (memberDTO != null) {
            System.out.println("이미 사용중인 이메일 입니다.");
        } else {
            System.out.println("비밀번호 입력");
            String memberPassword = scanner.next();
            System.out.println("가입자 성명");
            String memberName = scanner.next();
            System.out.println("전화번호 입력");
            String memberMobile = scanner.next();
            MemberDTO memberDTO1 = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
            boolean result = memberRepository.join(memberDTO1);
            if (result) {
                System.out.println("가입 완료");
            } else {
                System.out.println("가입 실패");
            }
        }
    }

    public void login() {
        System.out.println("이메일 입력");
        String memberEmail = scanner.next();
        System.out.println("패스워드 입력");
        String memberPassword = scanner.next();
        boolean memberDTO = memberRepository.login(memberEmail, memberPassword);
        if (memberDTO) {
            System.out.println("환영합니다 " + memberEmail + " 님!");
        } else {
            System.out.println("로그인 실패");
            System.out.println("이메일 또는 비밀번호를 확인 해주세요");
        }
    }

    public void list() {
        List<MemberDTO> memberDTOList = memberRepository.list();
        for (int i = 0; i < memberDTOList.size(); i++) {
        }
        System.out.println("memberDTOList = " + memberDTOList);
    }

    public void update() {
        if (CommonVariables.loginId != null) {
            System.out.println("변경할 전화번호 입력");
            String memberMobile = scanner.next();
            boolean memberDTO = memberRepository.update(memberMobile);
            if (memberDTO) {
                System.out.println("수정 완료");
            } else {
                System.out.println("수정 실패");
            }
        } else {
            System.out.println("로그인 후 수정 가능합니다.");
        }
    }

    public void resign() {
        if (CommonVariables.loginId != null) {
            System.out.println("비밀번호를 입력해주세요");
            String memberPassword = scanner.next();
            boolean memberDTO = memberRepository.checkPass(memberPassword);
            if(memberDTO){
                System.out.println("정말 탈퇴 하시겠습니까?");
                System.out.println("1.예 | 2.아니오");
                int selectNo = scanner.nextInt();
                if(selectNo == 1){
                    boolean memberDTO1 = memberRepository.resign(memberPassword);
                    if(memberDTO1){
                    System.out.println("탈퇴 완료");
                    }
                }else{
                    System.out.println("메인으로 돌아갑니다.");
                }
            }else{
                System.out.println("비밀번호가 틀렸습니다.");
            }
        }else{
            System.out.println("로그인 후 탈퇴 가능합니다.");
        }
    }
    public void logout(){
        CommonVariables.loginId = null;
        System.out.println("로그아웃 되었습니다");
    }

    public void board(){
        boolean run = true;
        if(CommonVariables.loginId != null){
            while (run){
                System.out.println("-------------------------------------게시판-------------------------------------");
                System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 99.sample | 0.메인메뉴");
                System.out.println("-------------------------------------------------------------------------------");
                int selectNo = scanner.nextInt();
                if(selectNo == 1){
                    boardService.newPost();
                } else if (selectNo == 2) {
                    boardService.postList();
                } else if (selectNo == 3) {
                    boardService.findById();
                }
            }
        }else{
            System.out.println("로그인 후 이용 가능합니다.");
        }
    }
}
