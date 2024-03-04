package Frontend;
import java.lang.*;

public class Programmer extends Frontend {
    private String name;
    private String email;

    public Programmer (String name, String email, int Fid,String Fname){
        super(Fid,Fname);
        this.name=name;
        this.email=email;
        System.out.println("This is para cons for programmer.");
    }

   public void setName(String name){
    this.name=name;
   }

   public void setEmail(String email){
    this.email=email;
   }
   
   public String getName(){
    return name;
   }

   public String getEmail(){
    return email;
   }

   public void viewdetails(){
    System.out.println("Programmer name: "+name);
    System.out.println("Programmer email" +email);
   }
}
