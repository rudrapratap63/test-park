
import java.time.LocalDate;

//abstract class Pass {
//    public abstract String type();
//}
class Monthly extends Pass {
    public String getExpiryDate(){
        LocalDate currentDateTime = LocalDate.now();
        return currentDateTime.plusMonths(1).toString();
    }
    public String type(){
        return "Monthly";
    }
}
//class Daily extends Pass{
//    public String type(){
//        return "Daily";
//    }
//
//}
//class Annually extends Pass{
//    public String type(){
//        return "Annually";
//    }

//}
