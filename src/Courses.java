public class Courses {

    private String name;
    private int grade;

    Courses(String subjectName, int studentGrade) {
        this.name = name;
        this.grade = grade;
        System.out.println(name + grade);
    }

    public void setSubjectName(String subjectName) {
        name = subjectName;
    }
    public String getSubjectName() {
        return name;
    }

    public void setGrade(int subjectGrade) {
        grade = subjectGrade;

    }
}
