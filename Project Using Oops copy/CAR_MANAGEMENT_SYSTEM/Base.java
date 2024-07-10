package CAR_MANAGEMENT_SYSTEM;

import java.util.Scanner;

interface utility {
    public void get_details();
    public void set_details();
}
public class Base {
    static void main_menu() {
        System.out.println();
        System.out.println("#######    Welcome the showroom management System    #######");
        System.out.println();
        System.out.println("******** ===== Enter your choice ====== *******");
        System.out.println();
        System.out.println("1]Add Showroom\t\t\t2]Add Employee\t\t\t3]Add Cars");
        System.out.println();
        System.out.println("4]Get Showrrom\t\t\t5]Get Employee\t\t\t6]Get Cars");
        System.out.println();
        System.out.println("Enter 0 for exist?");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employee employee[] = new Employee[5];
        Car car[] = new Car[5];

        int carcounter = 0;
        int showroomcounter = 0;
        int employeecounter = 0;
        int choice = 100;
        while (choice != 0) {
            main_menu();
            choice = sc.nextInt();

            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroomcounter] = new Showroom();
                        showroom[showroomcounter].set_details();
                        showroomcounter++;
                        System.out.println();
                        System.out.println("1]Add New Showroom");
                        System.out.println("9]Go back to main Menu");
                        choice = sc.nextInt();
                        break;

                    case 2:
                        employee[employeecounter] = new Employee();
                        employee[employeecounter].set_details();
                        employeecounter++;
                        System.out.println();
                        System.out.println("1]Add New Employee");
                        System.out.println("9]Go back to main Menu");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        car[carcounter] = new Car();
                        car[carcounter].set_details();
                        carcounter++;
                        System.out.println();
                        System.out.println("1]Add New Car");
                        System.out.println("9]Go back to main Menu");
                        choice = sc.nextInt();
                        break;

                    case 4:
                          if(showroomcounter==0)
                          {
                            System.out.println("No Showroom is Availabe First Add");
                          }
                        for (int i = 0; i < showroomcounter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9]Go back to main Menu");
                        System.out.println("0] exit");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for (int i = 0; i < employeecounter; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9]Go back to main Menu");
                        System.out.println("0] exit");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        for (int i = 0; i < carcounter; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9]Go back to main Menu");
                        System.out.println("0] exit");
                        choice = sc.nextInt();
                        break;

                    default:
                        System.out.println("Enter the valid Choice");
                        break;
                }
            }
        }

    }
}