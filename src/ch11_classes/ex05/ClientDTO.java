package ch11_classes.ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientDTO {
    private Long clientId;
    private String clientName;
    private String accountNumber;
    private String clientPass;
    private String clientCreatedAt;
    private long balance;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClientPass() {
        return clientPass;
    }

    public void setClientPass(String clientPass) {
        this.clientPass = clientPass;
    }

    public String getClientCreatedAt() {
        return clientCreatedAt;
    }

    public void setClientCreatedAt(String clientCreatedAt) {
        this.clientCreatedAt = clientCreatedAt;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public static Long idValue = 1L;

    public ClientDTO(String clientName, String accountNumber, String clientPass,long balance) {
        this.clientId = idValue;
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.clientPass = clientPass;
        this.clientCreatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "id=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", clientPass='" + clientPass + '\'' +
                ", clientCreatedAt='" + clientCreatedAt + '\'' +
                ", balance=" + balance +
                '}';
    }
}
