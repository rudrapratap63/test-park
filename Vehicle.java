import java.util.Scanner;

abstract class Vehicle{
    String vehicleId;
    Vehicle(String vehicleId){
        this.vehicleId = vehicleId;
    }
    Vehicle(){
        this.vehicleId = null;
    }

    String getLicence(Scanner scan) {
        return scan.nextLine();
    }
}