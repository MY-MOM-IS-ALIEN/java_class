package ch11_arrayList.ex2;

public class Student {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getStudentMajor() {
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

    public Student(){

    }
    public Student(Long id, String sudentName, String studentNumber, String studentMajor, String studentMoblie) {
        this.id = id;
        this.sudentName = sudentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMoblie = studentMoblie;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sudentName='" + sudentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMoblie='" + studentMoblie + '\'' +
                '}';
    }
}
