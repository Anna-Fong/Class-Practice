public class Main {

    public static void main(String[] args ) {

        Student student1 = new Student("Aaa");
        Courses course1 = new Courses("Chemistry", 0 );
        Courses course2 = new Courses("English", 0);
        Courses course3 = new Courses("History", 9);
        Courses course4 = new Courses("Biology", 0);
        Courses course5 = new Courses("Math", 0);
        Courses course6 = new Courses("French", 0);
        Courses course7 = new Courses("Art", 0);
        Courses course8 = new Courses("Geography", 0);

        course1.setStudentGrade(81);
        course2.setStudentGrade(80);
        course3.setStudentGrade(79);
        course4.setStudentGrade(84);
        course5.setStudentGrade(86);
        course6.setStudentGrade(78);
        course7.setStudentGrade(91);
        course8.setStudentGrade(80);

        student1.addCourse(course1);
        student1.addCourse(course2);
        student1.addCourse(course3);
        student1.addCourse(course4);
        student1.addCourse(course5);
        student1.addCourse(course6);
        student1.addCourse(course7);
        student1.addCourse(course8);

        System.out.println(student1);

        }

    }

