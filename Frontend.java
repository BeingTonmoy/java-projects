package Frontend;
import java.lang.*;

public class Frontend {
    private int Fid;
    private String Fname;

    public Frontend (int Fid, String Fname) {
        this.Fid=Fid;
        this.Fname=Fname;
        System.out.println("This is para cons");
    }

    public void setFid(int Fid){
       this.Fid=Fid;
    }

    public void setFname(String Fname) {
        this.Fname=Fname;
    }

    public int getFid(){
        return Fid;
    }

    public String getFname(){
        return Fname;
    }

   public void Fdetails(){
    System.out.println("Frontend ID: "+Fid);
    System.out.println("Frontend Name: "+Fname);
   }
}
