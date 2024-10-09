abstract class User {
    int id ;
    String contact;
    String name;
    User(String name,String contact){
        this.id = Constant.id ;
        this.name = name;
        this.contact = contact;
    }
    User(){
        this.id = Constant.id;
        this.name = null;
    }
    void getInfo() {
        System.out.println(Constant.USER_ID+ id +Constant.USER_NAME + name
                           +" User Contact " + contact);
    }
    public abstract String getRole();
    public abstract String getVehicleType();
}