import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    Vehicle luxury =  new Vehicle(1990, "Chrysler", "Lebaron", 200000, 4000);
    Vehicle stationwagon =  new Vehicle(1998, "Toyota", "Rav-4", 150000, 7000);
    Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
    Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
    Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
    Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
    Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);

        List<Vehicle> allVehicles = new ArrayList<Vehicle>();
          allVehicles.add(luxury);
          allVehicles.add(stationwagon);
          allVehicles.add(hatchback);
          allVehicles.add(suv);
          allVehicles.add(sedan);
          allVehicles.add(truck);
          allVehicles.add(crossover);

        boolean progaramRunning = true;

        while(progaramRunning){
           System.out.println("Welcome to our car dealership. What would you like to do? Enter one of the following options: All Vehicles or Search Price or Add Vehicle or Exit");


           String navigationChoice = scanner.nextLine();
           if (navigationChoice.equals("All Vehicles")){
      for ( Vehicle individualVehicle : allVehicles ) {
          System.out.println( "----------------------" );
          System.out.println( individualVehicle.getYear()  );
          System.out.println( individualVehicle.getBrand() );
          System.out.println( individualVehicle.getModel() );
          System.out.println( individualVehicle.getKilometers() );
          System.out.println( individualVehicle.getPrice() );
      }
    } else if (navigationChoice.equals("Search Price")){
        System.out.println("What is your maximum budget for a vehicle?");
        // String stringUserMaxBudget = scanner.next();
        int userMaxBudget = scanner.nextInt();
        System.out.println("Alright, here's what we have in your price range:");
        for ( Vehicle individualVehicle : allVehicles ) {
          if (individualVehicle.worthBuying(userMaxBudget)){
            System.out.println( "----------------------" );
            System.out.println( individualVehicle.getYear() );
            System.out.println( individualVehicle.getBrand() );
            System.out.println( individualVehicle.getModel() );
            System.out.println( individualVehicle.getKilometers() );
            System.out.println( individualVehicle.getPrice() );
          }
        }
      } else if (navigationChoice.equals("Add Vehicle")){
          System.out.println("Alright, let's add a vehicle! What year was this vehicle made?");
          int userVehicleYear = scanner.nextInt();
          System.out.println("Great! What make or brand is the vehicle?");
          String userVehicleBrand = scanner.next();
          System.out.println("Got it! What model is it?");
          String userVehicleModel = scanner.next();
          System.out.println("And how many miles does it have on it?");
          int userVehicleMiles = scanner.nextInt();
          System.out.println("Finally, what's its price?");
          int userVehiclePrice = scanner.nextInt();
          Vehicle userVehicle = new Vehicle(userVehicleYear, userVehicleBrand, userVehicleModel, userVehicleMiles, userVehiclePrice);
          allVehicles.add(userVehicle);
          System.out.println("Alright, here's your new vehicle:");
          System.out.println( "----------------------" );
          System.out.println( userVehicle.getYear() );
          System.out.println( userVehicle.getBrand() );
          System.out.println( userVehicle.getModel() );
          System.out.println( userVehicle.getKilometers() );
          System.out.println( userVehicle.getPrice() );
      } else if
         (navigationChoice.equals("Exit")){
           progaramRunning = false;
      } else {
          System.out.println("I'm sorry, we don't recognize your input");
      }
    }
  }

}
