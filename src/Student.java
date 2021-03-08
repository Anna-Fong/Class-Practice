public class Student {

    private String firstName;
    private static int studentIDGenerator = 0;
    private int studentID;


    Student(String firstName, int StudentID){
        this.firstName = firstName;
        firstName = "Anna";
        System.out.println(firstName);
        System.out.println("Default Constructor");
        StudentID = studentID;
        studentID = studentIDGenerator;
        studentIDGenerator++;
        System.out.println("ID: " + studentIDGenerator);
    }

}
/*
    String StudentID;
    Courses[] array;
    int index = 0;



    Student(String courseArray) {
        this.Student = courseArray;
        array = new Courses[8];
    }

    private Courses[] addItem(Courses course) {
        Courses[] returnVal = new Courses[array.length + 1];
        return returnVal;
    }

    public void addCourse(Courses course) {
        if (index < 2) {
            array[index] = course;
            index++;
        } else {
            array = addItem(course);

        }

    }
}




/*Create a class called Student.  Students should have the following:
	• First name
	• Student ID  (use static variables)
	• An array to hold Courses (8 Maximum)

Create a class called Courses.  Courses should have the following:
	• Subject Name
	• Student grade

When a Course object is printed the Subject name should print
When a Student object is printed the Student ID and Name should print --
Course Constructor should take in a subject name and grade

Student Constructor should take in a name and increase the student ID by 1 --
Create a method to add a course to the students array
Create a method to find the average grade in all of a student's courses
Create a method that prints out the students courses */


