
package TRANNGUYENQUYETTHANG_5626;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Course implements ICourse {
    private String id;
    private double feePerStudent;
    private Date startDate;
    public boolean isAvailable;
    public int enrolledStudents;

    public Course(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        this.id = id;
        this.feePerStudent = feePerStudent;
        this.startDate = startDate;
        this.isAvailable = isAvailable;
        this.enrolledStudents = enrolledStudents;
    }
    public Course(){
        
    }
    public String getId() {
        return id;
    }

    public double getFeePerStudent() {
        return feePerStudent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFeePerStudent(double feePerStudent) {
        this.feePerStudent = feePerStudent;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
    
    @Override
    public void addCourse(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Course ID: ");
        id = sc.nextLine();
        System.out.print("Enter fee per student: ");
        feePerStudent= sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter start date(dd/MM/yyyy): ");
        String dateStr=sc.nextLine();
        try{
            startDate= new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        }catch(ParseException e){
            e.printStackTrace();
        }
        System.out.print("Is course Available(true/false): ");
        isAvailable=sc.nextBoolean();
        System.out.print("Enter number of enrolled student: ");
        enrolledStudents=sc.nextInt();
    }
    @Override
    public void updateCourse(){
     Scanner sc= new Scanner(System.in);
        System.out.print("Update fee per student: ");
        feePerStudent=sc.nextDouble();
        sc.nextLine();
        System.out.print("Update Start date(dd/MM/yyyy): ");
        String dateStr=sc.nextLine();
        try{
            startDate= new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        }catch(ParseException e){
            e.printStackTrace();
        }
         System.out.print("Update Avaibility(true/false): ");
        isAvailable=sc.nextBoolean();
        System.out.print("Update enrolled student: ");
        enrolledStudents=sc.nextInt();
    }
    @Override
    public void displayDetails(){
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Course ID: "+id);
        System.out.println("Fee/Student: "+feePerStudent);
        System.out.println("Start Date: "+sdf.format(startDate));
        System.out.println("Available: "+ isAvailable);
        System.out.println("Enrolled students:  "+enrolledStudents);
    }

    boolean isAvailable() {
       
        return false;
       
    }
}
