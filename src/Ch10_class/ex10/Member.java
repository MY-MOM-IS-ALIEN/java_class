package Ch10_class.ex10;

public class Member {
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public Member() {

    }

    public Member(String memberEmail, String memberPassword) {
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberEmail='" + memberEmail + '\'' +
                ", memberPassword=" + memberPassword +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                '}';
    }

    //로그인처리 메서드
    public boolean memberLogin(String param1, String param2) {
        if (param1.equals(memberEmail) && param2.equals(memberPassword)) {
            return true;
        }else{
            return false;
        }

    }
}