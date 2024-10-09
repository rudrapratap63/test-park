//abstract class User {
//    int id ;
//    String name;
//    User(String name){
//        this.id = Constant.id ;
//        this.name = name;
//    }
//    User(){
//        this.id = Constant.id;
//        this.name = null;
//    }
//        void getInfo() {
//            System.out.println(Constant.USER_ID+ id +Constant.USER_NAME + name);
//        }
//    public abstract String getRole();
//    public abstract String getVehicleType();
//}
class Faculty extends User{
    String facultyId;
    int id;
    Faculty(String name,String contact,String facultyId){
        super(name,contact);
        int id = Constant.id++;
        this.facultyId = facultyId;
    }
   public String getRole(){
       return "Faculty" ;
   }
   public String getVehicleType(){
        return  " ";
   }
}
//class Student extends User{
//    String studentId;
//    Student(String name, String studentId){
//        super(name);
//        this.studentId = studentId;
//    }
//
//    public int priceDecider(String vehicleType, String duration){
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
//        return 0;
//    }
//    public String getRole() {
//        return "Student";
//    }
//    public String getVehicleType(){
//        return  " ";
//    }
//}
