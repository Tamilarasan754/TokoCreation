import java.util.Scanner;
public class user {
    public String name="Tamil";
    public String password="Toko@7676";
    public boolean validate(String userName,String pwd) 
    {
        if(name.equalsIgnoreCase(userName) && password.equals((pwd)))
        {
        return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the user name:");
   String userName=sc.next();
   System.out.println("Enter The password:");
   String password=sc.next();
   user us=new user();
   if(us.validate(userName,password))
   System.out.println("Login Sucessfully");
   else
   System.out.println("Check userName and password");

    }
}
