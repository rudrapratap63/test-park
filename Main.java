import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//         User user = new Faculty("Ojas","22Egjcs153");
//         user.getInfo();
//         User user1 = new Student("Ojas","1234");
//         user1.getInfo();
//         User user2 = new Faculty("Naveen","22cse");
//         user2.getInfo();
//         User user3 = new Student("hello","22gitse455");
//         user3.getInfo();
//        Printer printer = new ParkingReceipt();
//        printer.generateReceipt();
//        LocalDate currentDateTime = LocalDate.now();
//        String currentDate = LocalDate.now().toString();
//        String currentTime = LocalTime.now().toString();
//        String startDate = currentDate+" " + currentTime.split("\\.")[0].toString();
//        LocalDate endDateTime = currentDateTime.plusYears(1);
//        System.out.println(startDate);
//        System.out.println(endDateTime);
        Pass pass = new Monthly();
        pass.generateReceipt();

    }

}