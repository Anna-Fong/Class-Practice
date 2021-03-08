public class Student {

    private String firstName;
    private static int studentIDGenerator = 0;
    private static int studentID;


    Student(String firstName, int studentID) {
        firstName = firstName;

        this.firstName = firstName;
        System.out.println(firstName);
        for(studentIDGenerator = 0; studentIDGenerator < 8;) {
            studentIDGenerator++;
            System.out.println("Student ID: " + studentIDGenerator);
            if (studentIDGenerator == 8) {
                break;
            }
        }
    }

    public void setFirstName(String firstname) {
        firstName = firstname;
        //System.out.println(firstname);


    }

    public String toString() {
        return "First name: " + firstName;

    }
}




/*
    String courseArray;
    Courses[] array;
    int index = 0;

    Student(String courseArray) {
        this.courseArray = courseArray;
        array = new Courses[8];
    }

    private Courses[] addItem(Courses course) {
        Courses[] returnVal = new Courses[array.length + 1];
        return returnVal;
    }

    public void addCourse(Courses course) {
        if (index < 2) {
            array[index] = course;
            index ++;
        }
        else{
            array = addItem(course);

        }

    }
*/