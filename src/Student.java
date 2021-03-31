import java.util.ArrayList;

public class Student {

    private String firstName;
    private static int studentIDGenerator = 0;
    private int studentID;

        //takes student's name and increases ID by 1
        Student(String firstName){
            this.firstName = firstName;
            studentID = studentIDGenerator;
            studentIDGenerator++;
        }

    ArrayList<Courses> arrlist = new ArrayList<>(8);

    double total = 0;
    double average = 0;

        //add course to students array + find average
        public void addCourse(Courses courses) {
            this.arrlist.add(courses);
            total = total + courses.studentGrade;
            average = total / arrlist.size();
        }

        public String formattedArrlist() {
            String formattedArrlist = arrlist.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", "");
            return formattedArrlist;
        }

        public String toString() {
            return "First Name: " + firstName + "\nID: " + studentIDGenerator + formattedArrlist() +
                    "\nAverage Grade: " + average ;
        }

    }



