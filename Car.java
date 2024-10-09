import java.util.Scanner;

class Car extends Vehicle{
    String vehicleType;
    Car(String vehicleId){
       super(vehicleId);
    }
    String getLicence(Scanner scan) {
        return scan.nextLine();
    }
}