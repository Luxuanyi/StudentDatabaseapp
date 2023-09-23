import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private static int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter your last name: ");
        this.lastName = in.nextLine();

        System.out.println("1- Fresh man \n 2- Sophmore\n 3-Junior \n 4-Senior Enter your grade Level: ");
        this.gradeYear = in.nextInt();

        setStudentId();

    }

    private void setStudentId(){
        this.studentID = gradeYear + "" + id;
    }

    public void Enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n   " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (true);
    }

    public void viewBalance(){
        System.out.println("Your balance is : " + tuitionBalance);
    }

    public void payTuition(int i) {
        viewBalance();
        System.out.print("Enter your payment");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thanks for your payment " + payment);
        viewBalance();
    }

    public String toString(){
        return "Name:" + firstName + " " + lastName +
                "\nGrade level :" + gradeYear +
                "\nStudent ID: " + studentID+
                "\nCourses Enrolled:" + courses +
                "\nBalance " + tuitionBalance;
    }
}
