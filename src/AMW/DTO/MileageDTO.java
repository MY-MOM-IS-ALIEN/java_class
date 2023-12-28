package AMW.DTO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MileageDTO {
    private Long id;
    private String loginId;
    private long amount;
    private long withdraw;
    private String bankingAt;
    public static long balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(long withdraw) {
        this.withdraw = withdraw;
    }

    public String getBankingAt() {
        return bankingAt;
    }

    public void setBankingAt(String bankingAt) {
        this.bankingAt = bankingAt;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    private static Long idValue = 1L;
    public MileageDTO(String loginId,long amount, long withdraw) {
        this.loginId = loginId;
        this.id = idValue++;
        this.amount = amount;
        this.withdraw = withdraw;
        this.bankingAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "MileageDTO{" +
                "id=" + id +
                ", loginId='" + loginId + '\'' +
                ", amount=" + amount +
                ", withdraw=" + withdraw +
                ", bankingAt='" + bankingAt + '\'' +
                ", balance=" + balance +
                '}';
    }
}
