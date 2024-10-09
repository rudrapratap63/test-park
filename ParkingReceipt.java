//
//import java.util.Scanner;
//
//abstract class Printer {
//    abstract void generateReceipt();
//}
//class ParkingReceipt extends Printer {
//    void generateReceipt(){
//        Scanner scan = new Scanner(System.in);
//        User user = null;
//        Vehicle vehicle = null;
//        int price = 0 ;
//        String vehicleType = null;
//        String duration = null;
//        System.out.println("Enter Name");
//        String name = scan.nextLine();
//        System.out.println("Tell Role");
//        String role = scan.nextLine();
//        if(role.equals("Student")){
//            System.out.println("Enter " + role + " id");
//            String id = scan.nextLine();
//            user = new Student(name,"8824427953",id);
//            System.out.println("Enter Vehicle Type");
//            vehicleType = scan.nextLine();
//            if(vehicleType.equals("Cycle")){
//               vehicle = new Cycle("Cycle");
//
//            }
//            System.out.println("Enter Duration");
//            duration = scan.nextLine();
//            price = price(vehicleType,duration);
//        }
//        else if(role.equals("Faculty")){
//            System.out.println("Enter " + role + " id");
//            String id = scan.nextLine();
//            user = new Faculty(name,"8824427953",id);
//            System.out.println("Enter Vehicle Type");
//            System.out.println("Enter Duration");
//            duration = scan.nextLine();
//        }
//        else{
//            System.out.println("Invalid Role");
//        }
//        user.getInfo();
//        System.out.println(user.getRole());
//        System.out.println(price);
//        System.out.println(duration);
//
//
//
//
//
//    }
//    public static int price(String vehicleType, String duration){
//        switch (vehicleType) {
//            case "Cycle" -> {
//                switch (duration) {
//                    case "Daily" -> {
//                        return 5;
//                    }
//                    case "Monthly" -> {
//                        return 50;
//                    }
//                    case "Annually" -> {
//                        return 500;
//                    }
//                }
//            }
//            case "Bike" -> {
//                switch (duration) {
//                    case "Daily" -> {
//                        return 20;
//                    }
//                    case "Monthly" -> {
//                        return 200;
//                    }
//                    case "Annually" -> {
//                        return 2000;
//                    }
//                }
//            }
//            case "Car" -> {
//                switch (duration) {
//                    case "Daily" -> {
//                        return 50;
//                    }
//                    case "Monthly" -> {
//                        return 500;
//                    }
//                    case "Annually" -> {
//                        return 5000;
//                    }
//                }
//            }
//        }
//        return 0 ;
//    }
//}
