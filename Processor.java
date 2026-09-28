    
package TRANNGUYENQUYETTHANG_5626;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        CourseArrayList courseList = new CourseArrayList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== Course Enrollment Management =====");
            System.out.println("1. Add OnlineCourse");
            System.out.println("2. Add OfflineCourse");
            System.out.println("3. Update course by ID");
            System.out.println("4. Delete course by ID");
            System.out.println("5. Display all courses");
            System.out.println("6. Display available courses");
            System.out.println("7. Calculate total fees");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    OnlineCourse oc = new OnlineCourse();
                    oc.addCourse();
                    courseList.addCourseToArrayList(oc);
                }
                case 2 -> {
                    OfflineCourse ofc = new OfflineCourse();
                    ofc.addCourse();
                    courseList.addCourseToArrayList(ofc);
                }
                case 3 -> {
                    System.out.print("Enter course ID to update: ");
                    String updateId = sc.nextLine();
                    courseList.updateCourseById(updateId);
                }
                case 4 -> {
                    System.out.print("Enter course ID to delete: ");
                    String deleteId = sc.nextLine();
                    courseList.deleteCourseById(deleteId);
                }
                case 5 -> courseList.displayAllCourses();
                case 6 -> courseList.displayAvailableCourses();
                case 7 -> {
                    double totalFees = courseList.calculateTotalFees();
                    System.out.println("Total fees of all courses: " + totalFees);
                }
                case 8 -> {
                    System.out.println("Exiting program...");
                    return;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
