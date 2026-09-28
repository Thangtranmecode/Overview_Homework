
package TRANNGUYENQUYETTHANG_5626;
import java.util.*;

public class CourseArrayList {
    private final ArrayList<Course> courses = new ArrayList<>();

    public void addCourseToArrayList(Course course) {
        courses.add(course);
    }

    public void updateCourseById(String id) {
        for (Course c : courses) {
            if (c.getId().equals(id)) {
                c.updateCourse();
                return;
            }
        }
        System.out.println("Course not found!");
    }

    public void deleteCourseById(String id) {
        Iterator<Course> it = courses.iterator();
        while (it.hasNext()) {
            Course c = it.next();
            if (c.getId().equals(id)) {
                it.remove();
                System.out.println("Course deleted.");
                return;
            }
        }
        System.out.println("Course not found!");
    }

    public void displayAllCourses() {
        for (Course c : courses) {
            c.displayDetails();
            System.out.println("-------------------");
        }
    }

    public void displayAvailableCourses() {
        for (Course c : courses) {
            if (c.isAvailable()) {
                c.displayDetails();
                System.out.println("-------------------");
            }
        }
    }

    public double calculateTotalFees() {
        double sum = 0;
        for (Course c : courses) {
            sum += c.calculateTotalFee();
        }
        return sum;
    }
}
