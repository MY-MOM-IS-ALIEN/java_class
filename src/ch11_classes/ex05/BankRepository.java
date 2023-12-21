package ch11_classes.ex05;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    public static List<ClientDTO> clientDTOList = new ArrayList<>();
    public static List<AccountDTO> accountDTOList = new ArrayList<>();

    public ClientDTO check(String accountNumber) {
        ClientDTO result1;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                result1 = clientDTOList.get(i);
                return result1;
            }
        }
        return null;
    }

    public boolean join(ClientDTO clientDTO) {
        return clientDTOList.add(clientDTO);
    }

    public List<ClientDTO> accountCheck() {
        return clientDTOList;
    }

    public boolean deposit(String accountNumber, long deposit) {
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                long result = clientDTOList.get(i).getBalance();
                result = result + deposit;
                clientDTOList.get(i).setBalance(result);
                return true;
            }
        }
        return false;
    }

    public boolean addToDeposit(String accountNumber, long deposit) {
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                AccountDTO accountDTO = new AccountDTO(accountNumber, deposit, 0);
                result = accountDTOList.add(accountDTO);
            }
        }
        return result;
    }

    public boolean checkPass(String clientPass) {
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (clientPass.equals(clientDTOList.get(i).getClientPass())) {
                return true;
            }
        }
        return false;
    }

    public ClientDTO withdraw(String accountNumber, long withdraw) {
        ClientDTO result = null;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                if (withdraw > clientDTOList.get(i).getBalance()) {
                    return null;
                } else {
                    long result1 = clientDTOList.get(i).getBalance();
                    result1 = result1 - withdraw;
                    clientDTOList.get(i).setBalance(result1);
                    result = clientDTOList.get(i);
                    return result;
                }
            }
        }
        return result;
    }

    public boolean addToWithdraw(String accountNumber, long withdraw) {
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                AccountDTO accountDTO = new AccountDTO(accountNumber, 0, withdraw);
                result = accountDTOList.add(accountDTO);
            }
        }
        return result;
    }

    public List<AccountDTO> history() {
        return accountDTOList;
    }

    public void transfer(String accountNumberFrom, String accountNumberTo, long money) {
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumberFrom.equals(clientDTOList.get(i).getAccountNumber())) {
                long balance = clientDTOList.get(i).getBalance();
                balance = balance - money;
                clientDTOList.get(i).setBalance(balance);
                AccountDTO accountDTO = new AccountDTO(accountNumberFrom, 0, money);
                accountDTOList.add(accountDTO);
            } else if (accountNumberTo.equals(clientDTOList.get(i).getAccountNumber())) {
                long balance = clientDTOList.get(i).getBalance();
                balance = balance + money;
                clientDTOList.get(i).setBalance(balance);
                AccountDTO accountDTO = new AccountDTO(accountNumberTo, money, 0);
                accountDTOList.add(accountDTO);
            }
        }
    }
}

