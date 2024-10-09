import java.util.Scanner;

//abstract class Vehicle{
//    String vehicleId;
//    Vehicle(String vehicleId){
//        this.vehicleId = vehicleId;
//    }
//    Vehicle(){
//        this.vehicleId = null;
//    }
//
//    String getLicence(Scanner scan) {
//        return scan.nextLine();
//    }
//}
class Cycle extends Vehicle {
    String vehicleId;
    Cycle(String vehicleId){
        super(vehicleId);
    }

    String getLicence(Scanner scan) {
        return scan.nextLine();
    }
}
//class Car extends Vehicle{
//    String getLicence(Scanner scan) {
//        return scan.nextLine();
//    }
//}
//class Bike extends Vehicle{
//    String getLicence(Scanner scan) {
//        return scan.nextLine();
//    }
//}

