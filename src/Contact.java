public class Contact {
    private String name;
    private String email;
    private String phoneNumber;

    public Contact(String name, String email, String phoneNumber){
        this.name = name;
        if(email==null || email.equals("")){
            throw new RuntimeException("email can not be null or empty");
        }
        this.email = email;
        this.phoneNumber = phoneNumber;

    }
    public String getName(){
        return name;
    }
    public  String getEmail(){
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}


