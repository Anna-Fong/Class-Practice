public class Main {

    public static void main(String[] args ) {

        for(int i = 0; i < 8; i++) {
            Student student1 = new Student("Anna", 0);

            Courses course1 = new Courses("", 0);
            course1.setSubjectName("Math");
            course1.setGrade(80);

            System.out.println(course1);
            


        }




    }
}
