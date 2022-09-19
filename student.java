import java.util.ArrayList;

/**
 * student
 * I have are private parameters[
 * id, firstname, lastname , phone , birthdate, address
 * ]; 
 * 
 * 
 *  Getter and Setter methods of all parametes
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  
 */








public class student {
    private int id;
    private String firstname;
    private String lastname;
    private int  phone ;
    private int  Birthdate ;
    private String address;


    

    public student(int id, String firstname, String lastname, int phone, int birthdate, String address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        Birthdate = birthdate;
        this.address = address;
    }
   static ArrayList<student> Students= new ArrayList<>(); 
   ArrayList<studentcoure> Studentcourses = new ArrayList<>(); 
  static void printAA(){

    for (student item : Students) {
        System.out.println(item.id);
        System.out.println(item.firstname);
         System.out.println(item.lastname);
         System.out.println(item.phone);
         System.out.println(item.Birthdate);
        System.out.println(item.address);



    }




}




    
    @Override
    public String toString() {
        return "student [Birthdate=" + Birthdate + ", address=" + address + ", firstname=" + firstname + ", id=" + id
                + ", lastname=" + lastname + ", phone=" + phone + "]";
    }
  // Getter and setter functions 
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void setBirthdate(int birthdate) {
        Birthdate = birthdate;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getPhone() {
        return phone;
    }
    public int getBirthdate() {
        return Birthdate;
    }
    public String getAddress() {
        return address;
    }














}
