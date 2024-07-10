package CAR_MANAGEMENT_SYSTEM;

// this will generate the unique no 
import java.util.*;
public class Employee extends Showroom implements utility{

    String emp_id;
    String emp_name;
    int emp_age;
    String emp_Department;

    @Override
    public void get_details() {
        System.out.println("Employee ID:" + emp_id);
        System.out.println("Employee Name" + emp_name);
        System.out.println("Employee Age:" + emp_age);
        System.out.println("Employee Department"+emp_Department);
       System.out.println("Showroom Name: "+showroom_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);

        System.out.println("###### Enter the Employe Details ######");
        System.out.println();
        
        UUID uuid = UUID.randomUUID();
        emp_id=String.valueOf(uuid);

        System.out.println("Enter the Name of Employee");
        emp_name = sc.nextLine();

        System.out.println("Enter the Employee Department");
        emp_Department = sc.nextLine();

        System.out.println("Enter The Employee Age");
        emp_age = sc.nextInt();

       
    }
}
