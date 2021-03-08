public class Main {

    public static void main(String[] args ) {
        Student student1 = new Student("", 42354);
        Courses course1 = new Courses("", 0);
        student1.setFirstName("Anna");
        course1.setSubjectName("Math");
        course1.setGrade(80);
  
        System.out.println(student1);



    }
}
