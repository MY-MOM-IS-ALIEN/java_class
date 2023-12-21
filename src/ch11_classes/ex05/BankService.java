package ch11_classes.ex05;

import ch11_classes.ex04.BoardDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankService {
    BankRepository bankRepository = new BankRepository();
    Scanner scanner = new Scanner(System.in);

    public void join() {
        System.out.println("희망하는 계좌번호");
        System.out.println("xxx-xxx 형식으로 입력");
        String accountNumber = scanner.next();
        ClientDTO result1 = bankRepository.check(accountNumber);
        if (result1 != null) {
            System.out.println("계좌 중복 다른 계좌를 입력 해주세요.");
        } else {
            System.out.println("가입자 이름");
            String clientName = scanner.next();
            System.out.println("비밀번호 4자리 입력");
            String clientPass = scanner.next();
            long balance = 0;
            ClientDTO clientDTO = new ClientDTO(clientName, accountNumber, clientPass, balance);
            boolean result = bankRepository.join(clientDTO);
            if (result) {
                System.out.println("가입 완료");
            } else {
                System.out.println("가입 실패");
            }
        }
    }

    public void accountCheck() {
        System.out.println("조회할 계좌번호 입력");
        String accountNumber = scanner.next();
        List<ClientDTO> clientDTOList = bankRepository.findByAccount();
        if (clientDTOList == null) {
            System.out.println("없는 계좌번호 입니다 다시 확인 해주세요");
        } else {
            ClientDTO clientDTO = bankRepository.check(accountNumber);

            System.out.println("현재 잔액 : " + clientDTO.getBalance() + "원 입니다.");
        }
    }

    public void deposit() {
        System.out.println("입금할 계좌번호 입력");
        String accountNumber = scanner.next();
        ClientDTO result = bankRepository.check(accountNumber);
        if (result != null) {
            System.out.println("입금할 금액 입력");
            long deposit = scanner.nextLong();
            boolean result1 = bankRepository.deposit(accountNumber, deposit);
            if (result1) {
                System.out.println("입금 완료");
                System.out.println("현재 잔액은 " + result.getBalance() + "원 입니다.");
                boolean result2 = bankRepository.addToDeposit(accountNumber, deposit);
                if (result2) {
                } else {
                    System.out.println("입금 실패");
                }
            }
        } else {
            System.out.println("없는 계좌번호 입니다 다시 확인 해주세요");
        }
    }

    public void withdraw() {
        System.out.println("출금할 계좌번호 입력");
        String accountNumber = scanner.next();
        List<ClientDTO> clientDTOList = bankRepository.findByAccount();
        if (clientDTOList != null) {
            System.out.println("계좌의 비밀번호를 입력");
            String clientPass = scanner.next();
            boolean result1 = bankRepository.checkPass(clientPass);
            if (result1) {
                System.out.println("출금할 금액 입력");
                long withdraw = scanner.nextLong();
                ClientDTO result2 = bankRepository.withdraw(accountNumber, withdraw);
                if (result2 != null) {
                    System.out.println("출금 완료");
                    System.out.println("현재 잔액은 " + result2.getBalance() + "원 입니다.");
                    boolean result3 = bankRepository.addToWithdraw(accountNumber, withdraw);
                    if (result3) {
                    }
                } else {
                    System.out.println("잔액 부족");
                }
            } else {
                System.out.println("비밀번호가 다릅니다.");
            }
        } else {
            System.out.println("없는 계좌번호 입니다 다시 확인 해주세요");
        }

    }

    public void history() {
        boolean run = true;
        System.out.println("조회할 계좌 입력");
        String accountNumber = scanner.next();
        ClientDTO clientDTO = bankRepository.check(accountNumber);
        if (clientDTO != null) {
            while (run) {
                System.out.println("****************거래내역조회****************");
                System.out.println("1.전체내역 | 2.입금내역 | 3.출금내역 | 4.종료");
                System.out.println("******************************************");
                int selectNo = scanner.nextInt();
                List<AccountDTO> accountDTOList = bankRepository.history();
                if (selectNo == 1) {
                    for (int i = 0; i < accountDTOList.size(); i++) {
                        if (accountNumber.equals(accountDTOList.get(i).getAccountNumber())) {
                            System.out.println("거래번호 : " + accountDTOList.get(i).getId() + " 계좌번호 : " + accountDTOList.get(i).getAccountNumber() + " 입금액 : " + accountDTOList.get(i).getDeposit() + " 출금액 : " + accountDTOList.get(i).getWithdraw() + " 거래시간 : " + accountDTOList.get(i).getBankingAt());
                        }
                    }
                } else if (selectNo == 2) {
                    for (int i = 0; i < accountDTOList.size(); i++) {
                        if (accountNumber.equals(accountDTOList.get(i).getAccountNumber())) {
                            if (accountDTOList.get(i).getDeposit() > 0) {
                                System.out.println("거래번호 : " + accountDTOList.get(i).getId() + " 계좌번호 : " + accountDTOList.get(i).getAccountNumber() + " 입금액 : " + accountDTOList.get(i).getDeposit() + " 거래시간 : " + accountDTOList.get(i).getBankingAt());
                            }
                        }
                    }
                } else if (selectNo == 3) {
                    for (int i = 0; i < accountDTOList.size(); i++) {
                        if (accountNumber.equals(accountDTOList.get(i).getAccountNumber())) {
                            if (accountDTOList.get(i).getWithdraw() > 0)
                                System.out.println("거래번호 : " + accountDTOList.get(i).getId() + " 계좌번호 : " + accountDTOList.get(i).getAccountNumber() + " 출금액 : " + accountDTOList.get(i).getWithdraw() + " 거래시간 : " + accountDTOList.get(i).getBankingAt());
                        }
                    }
                } else if (selectNo == 4) {
                    run = false;
                }
            }
        } else {
            System.out.println("없는 계좌번호 입니다 다시 확인 해주세요");
        }
    }
    public void transfer() {
        System.out.print("보내실 분 계좌번호: ");
        String accountNumberFrom = scanner.next();
        System.out.print("받으실 분 계좌번호: ");
        String accountNumberTo = scanner.next();
        System.out.print("보낼 금액: ");
        long money = scanner.nextLong();
        ClientDTO clientTo = bankRepository.check(accountNumberTo);
        ClientDTO clientFrom = bankRepository.check(accountNumberFrom);
        if (clientTo != null && clientFrom !=null) {
            System.out.println("받으실 분이 " + clientTo.getClientName() + "님이 맞습니까?");
            System.out.println("맞으면 1번, 틀리면 2번을 입력해주세요.");
            System.out.print("입력> ");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.print("비밀번호를 입력해주세요: ");
                String clientPass = scanner.next();
                if (clientPass.equals(clientFrom.getClientPass()) && money <= clientFrom.getBalance()) {
                    bankRepository.transfer(accountNumberFrom, accountNumberTo, money);
                    System.out.println("이체가 완료되었습니다. ");
                } else if (!clientPass.equals(clientFrom.getClientPass())) {
                    System.out.println("비밀번호가 틀립니다!");
                } else if (money > clientFrom.getBalance()) {
                    System.out.println("잔액 부족");
                }
            } else if (selectNo == 2) {
                System.out.println("메인메뉴로 돌아갑니다.");
            }
        } else {
            System.out.println("해당 계좌가 없습니다.");
        }
    }
}




