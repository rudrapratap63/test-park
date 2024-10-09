import java.util.Scanner;

class Bike extends Vehicle{
    String Id;
    Bike(String Id){
        this.Id = Id;
    }
    String getLicence(Scanner scan) {
        return scan.nextLine();
    }
}