import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        System.out.println("Enter number of new student to enroll :");
        Scanner in = new Scanner(System.in);
        int numOfStudent = in.nextInt();
        Student[] students = new Student[numOfStudent];

        //Create  n number of new students
        for(int n = 0 ; n<numOfStudent;n++){
            students[n] = new Student();
            students[n].Enroll();
            students[n].payTuition(900);
            System.out.println(students[n].toString());

        }
        for(int n = 0;n<numOfStudent;n++){
            System.out.println(students[n].toString());
        }
    }
}