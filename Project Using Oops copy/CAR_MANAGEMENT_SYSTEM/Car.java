package CAR_MANAGEMENT_SYSTEM;

import java.util.Scanner;

public class Car extends Showroom implements utility {
    String Carname;
    String Carcolor;
    String Fueltype;
    int Carprice;
    String Cartype;
    String CarTransmissions;

    @Override
    public void get_details() {

        System.out.println("Car Name:" + Carname);
        System.out.println("Car color" + Carcolor);
        System.out.println("Car type" + Cartype);
        System.out.println("Car price" + Carprice);
        System.out.println("Fuel type" + Fueltype);
        System.out.println("Car transmission" + CarTransmissions);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car Details");
        System.out.println();

        System.out.println("Enter the name of car");
        Carname = sc.nextLine();

        System.out.println("Enter the Car color");
        Carcolor = sc.nextLine();

        System.out.println("Enter the fuel type");
        Fueltype = sc.nextLine();

        System.out.println("Enter the car type");
        Cartype = sc.nextLine();

        System.out.println("Enter the car price");
        Carprice = sc.nextInt();

        System.out.println("Enter the Car transmission");
        CarTransmissions = sc.nextLine();
        total_stock_of_car++;

    }

}
