import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;
import java.util.Iterator;

/**
 *
 * @author TAMILARASAN
 */
class UserY
{
    int user_id;
    String userName,password,type;
 
    UserY(int user_id,String userName,String password,String type)
    {
        this.user_id=user_id;
        this.userName=userName;
        this.password=password;
        this.type=type;
    }
    @Override
    public String toString()
    {
        return " UserId : "+user_id+" "+"UserName : "+userName+" "+"Type: "+type;
    }
    
}
public class UserXTest {

    /**
     * @param args the command line arguments
     * 
     */
   private static TreeSet<UserY> map=new TreeSet<UserY>(); 
 //  static User user=new User();
    public static void main(String[] args) {
        // TODO code application logic here
        
        map.add(new UserY(1,"Tamil","x","y"));
         map.add(new UserY(3,"saj","x","y"));
         map.add(new UserY(2,"saa","a","b"));
         map.add(null);
         display();
        // update();
      //   display();
         //edit();
        // display();
       
    }
    private static void display()
    {
        Iterator<UserY> it=map.iterator();
        //  for(Map.Entry<Integer,UserY> en:map.entrySet())
        // {
        //     UserY user=en.getValue();
        //     System.out.println(user.user_id+" "+user.userName+" "+user.password+" "+user.type);
        // }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    // private static void update()
    // {
    //    System.out.println((UserY)map.);
    //    System.out.println("\n");
      
    // }
    // public static void edit()
    // {
    //    UserY x=new UserY(2,"Sak","x","y");
    //    UserY y=new UserY(2,"trick","x","z");
    //      map.replace(1,y);
    //      display();
    // }
    
}