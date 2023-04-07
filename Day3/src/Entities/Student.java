package Entities;

public class Student {
    private String nationalityId;
    private String firstName;
    private String lastName;
    private int studentNo;
    private int group;

    public String getNationalityId() {
        return nationalityId;
    }

    public Student(String nationalityId, String firstName, String lastName, int studentNo, int group) {
        this.nationalityId = nationalityId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNo = studentNo;
        this.group = group;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
