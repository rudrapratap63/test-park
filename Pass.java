import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

abstract class Pass {
    String duration ;
    Pass(String duration){
        this.duration = duration;
    }
    Pass(){
        this.duration = null;
    }
    public abstract String type();
    public abstract String getExpiryDate();
    public void generateReceipt(){
        {
            Scanner scan = new Scanner(System.in);
            User user = null;
            Vehicle vehicle = null;
            Pass pass = null;
            int price = 0;
            String vehicleType = null;
            String duration = null;
            System.out.println("Enter Name");
            String name = scan.nextLine();
            System.out.println("Tell Role");
            String role = scan.nextLine();
            if (role.equals("Student")) {
//                role = user.getRole();
                System.out.println("Enter " + role + " id");
                String id = scan.nextLine();
                System.out.println("Enter " + role + " Contact");
                String contact = scan.nextLine();
                user = new Student(name, contact, id);
                System.out.println("Enter Vehicle Type");
                vehicleType = scan.nextLine();
                if (vehicleType.equalsIgnoreCase("Cycle")) {
                    String Id = scan.nextLine() ;
                    vehicle = new Cycle(Id);
                }
                else if (vehicleType.equalsIgnoreCase("Bike")) {
                    String Id = scan.nextLine() ;
                    vehicle = new Bike(Id);

                }
                else if (vehicleType.equalsIgnoreCase("Car")) {
                    System.out.println("Enter vehicle Id");
                    String Id = scan.nextLine() ;
                    vehicle = new Car(id);
                }
                System.out.println("Enter Duration");
                duration = scan.nextLine();
                if(duration.equalsIgnoreCase("Daily")){
                    pass = new Daily();
                }
                else if(duration.equalsIgnoreCase("Monthly")){
                    pass = new Daily();
                }
                else {
                    pass = new Annually();
                }
                price = price(vehicleType, duration);
            } else if (role.equals("Faculty")) {
                System.out.println("Enter " + role + " id");
                String id = scan.nextLine();
                System.out.println("Enter " + role + " Contact");
                String contact = scan.nextLine();
                user = new Faculty(name, contact, id);
                System.out.println("Enter Vehicle Type");
                vehicleType = scan.nextLine();
                System.out.println("Enter Duration");
                duration = scan.nextLine();
                if(duration.equalsIgnoreCase("Daily")){
                    pass = new Daily();
                }
                else if(duration.equalsIgnoreCase("Monthly")){
                    pass = new Daily();
                }
                else {
                    pass = new Annually();
                }
            }
            else {
                System.out.println("Invalid Role");
            }
            user.getInfo();
            System.out.println(user.getRole());
            System.out.println("Amount tp be Paid is : "+price);
            System.out.println("Duration : " +duration);
            System.out.println("Vehicle is : "+vehicleType);
            System.out.println("Vehicle Id is :"+vehicle.vehicleId);
            System.out.println("Start Date : "+LocalDate.now().toString());
            System.out.println("Current Time : " + LocalTime.now().toString());
            System.out.println("EndDate : "+pass.getExpiryDate());


        }
    }
    public static int price(String vehicleType, String duration){
        switch (vehicleType) {
            case "Cycle" -> {
                switch (duration) {
                    case "Daily" -> {
                        return 5;
                    }
                    case "Monthly" -> {
                        return 50;
                    }
                    case "Annually" -> {
                        return 500;
                    }
                }
            }
            case "Bike" -> {
                switch (duration) {
                    case "Daily" -> {
                        return 20;
                    }
                    case "Monthly" -> {
                        return 200;
                    }
                    case "Annually" -> {
                        return 2000;
                    }
                }
            }
            case "Car" -> {
                switch (duration) {
                    case "Daily" -> {
                        return 50;
                    }
                    case "Monthly" -> {
                        return 500;
                    }
                    case "Annually" -> {
                        return 5000;
                    }
                }
            }
        }
        return 0 ;
    }
}
