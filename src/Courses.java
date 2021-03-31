public class Courses {

    private String subjectName;
    public int studentGrade;

    Courses(String subjectName, int studentGrade) {
        this.subjectName = subjectName;
        this.studentGrade = studentGrade;
    }

    public void setSubjectName(String SubjectName) {
        subjectName = SubjectName;
    }
    public String getSubjectName() {
        return subjectName;
    }

    public void setStudentGrade(int StudentGrade) {
        studentGrade = StudentGrade;
    }
    public int getStudentGrade() {
        return studentGrade;
    }

    //prints out students courses
    public String toString() {
        return "\nGrade: " + studentGrade + "\tSubject: " + subjectName;
    }
}
