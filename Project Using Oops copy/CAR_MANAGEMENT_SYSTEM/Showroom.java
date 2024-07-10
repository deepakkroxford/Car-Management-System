package CAR_MANAGEMENT_SYSTEM;

import java.util.*;

public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_Employees;
    int total_stock_of_car = 0;

    @Override
    public void get_details() {
        System.out.println("Showroom Name:-" + showroom_name);
        System.out.println("Showroom Address:-" + showroom_address);
        System.out.println("Total_Employess:- " + total_Employees);
        System.out.println("Total_Stock_OfCar:-" + total_stock_of_car);
    }

    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ShowroomDetails");
        System.out.println();

        System.out.println("Enter the Showroom Name");
        showroom_name = sc.nextLine();

        System.out.println("Enter the Showroom_Address");
        showroom_address = sc.nextLine();

        System.out.println("Enter the Total_No_Employees");
        total_Employees = sc.nextInt();

        System.out.println("Enter the Total_Stock_OfCar:");
        total_stock_of_car = sc.nextInt();

    }
}
