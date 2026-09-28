package TRANNGUYENQUYETTHANG_5626;

import java.util.*;

public class OnlineCourse extends Course {

    private String platformName;
    private double discountPercent;

    public OnlineCourse(String platformName, double discountPercent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public String getPlatformName() {
        return platformName;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public OnlineCourse() {
      super();
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void addCourse() {
        super.addCourse();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter platform name: ");
        platformName = sc.nextLine();
        System.out.print("Enter discount percent: ");
        discountPercent = sc.nextDouble();
    }

    public void updateCOurse() {
        super.updateCourse();
        Scanner sc= new Scanner(System.in);
        System.out.print("Update platform name: ");
        platformName = sc.nextLine();
        System.out.print("Update discount percent: ");
        discountPercent = sc.nextDouble();
    }
    @Override
    public void displayDetails(){
    super.displayDetails();
        System.out.print("Platform name: "+ platformName);
        System.out.print("Discount percent: "+ discountPercent);
        
}
    @Override
    public double calculateTotalFee() {
        return getFeePerStudent()* getEnrolledStudents()*(1-discountPercent/100);
    }

}
