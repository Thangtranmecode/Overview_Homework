package TRANNGUYENQUYETTHANG_5626;

import java.util.*;

public class OfflineCourse extends Course {

    private String classroomNumber;
    private double materialFeePerStudent;

    public OfflineCourse(String classroomNumber, double materialFeePerStudent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.classroomNumber = classroomNumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public OfflineCourse() {
        super();
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public double getMaterialFeePerStudent() {
        return materialFeePerStudent;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public void setMaterialFeePerStudent(double materialFeePerStudent) {
        this.materialFeePerStudent = materialFeePerStudent;
    }

    @Override
    public void addCourse() {
        super.addCourse();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter classroom number: ");
        classroomNumber = sc.nextLine();
        System.out.print("Enter material fee student: ");
        materialFeePerStudent = sc.nextDouble();
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter classroom number: ");
        classroomNumber = sc.nextLine();
        System.out.print("Enter material fee student: ");
        materialFeePerStudent = sc.nextDouble();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Classroom number: " + classroomNumber);
        System.out.println("Material fee per student: " + materialFeePerStudent);
    }

    @Override
    public double calculateTotalFee() {
        return (getFeePerStudent() + materialFeePerStudent) * getEnrolledStudents();
    }

}
