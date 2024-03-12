package Inheritance;

public class Admin extends Developer {
//  public void read(){
//       System.out.println("Read Code");
//    }

//   public void write(){
//       System.out.println("Write Code");
//   }

    //Adding or deleting of the products/applications
    public void manage(){
        super.read(); // Access the super class if not access the local
        write();
        System.out.println("Manage Code");
        }
    public void read(){
        System.out.println("Admin Code Updated");
    }

    
}
