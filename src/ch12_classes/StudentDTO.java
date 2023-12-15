package ch12_classes;

public class StudentDTO {
    /**
     * 필드
     * 관리번호(id)
     * 이름(sudentName)
     * 학번(studentNumber)
     * 학과(studentMajor)
     * 전화번호(studentMobile)
     *
     */

    private Long id;
    private String sudentName;
    private String studentNumber;
    private String studentMajor;
    private String studentMoblie;

    public String getSudentName() {
        return sudentName;
    }

    public void setSudentName(String sudentName) {
        this.sudentName = sudentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentMajor(String 데이터사이언티스트) {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentMoblie() {
        return studentMoblie;
    }

    public void setStudentMoblie(String studentMoblie) {
        this.studentMoblie = studentMoblie;
    }

    private static Long idValue = 1L;
    public StudentDTO(){

    }
    public StudentDTO(String sudentName, String studentNumber, String studentMajor, String studentMoblie) {
        this.id = idValue++;
        this.sudentName = sudentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMoblie = studentMoblie;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", sudentName='" + sudentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMoblie='" + studentMoblie + '\'' +
                '}';
    }
}
