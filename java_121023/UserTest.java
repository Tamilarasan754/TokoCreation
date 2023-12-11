import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;



public class UserTest {
    private static Set<User> list=new HashSet<User>();
    public static void main(String[] args) {
        User b1=new User("saj","x","saj123@","sajesh","praveen","athlete",101);
        User b2=new User("sakthi","y","sakthi123@","sakthivel","m","coach",102);
        User b3=new User("vinu","z","vinu123@","vinu","prasanth","athlete",103);
        list.add(b1);
        list.add(b2);
        list.add(b3);
      // System.out.println(list);
        //System.out.println(list.toString());
      UserTest.display();
      System.out.println(" ");
      //UserTest.insert();
      //display();
      System.out.println(" ");
      list.remove(b1);
      display();
      System.out.println(" ");
      // list.set(0, new User("sat","x","saj123@","sajesh","praveen","athlete",101));
   //display();


    
    
    
    }

    public static void insert()
    {
        list.add(new User("Bala","z","vinu123@","vinu","prasanth","athlete",103));
       
    }
    public static void delete()
    {
        list.remove(new User("saj","x","saj123@","sajesh","praveen","athlete",101));
    } 
    public static void display()
    {
        Iterator<User> il=list.iterator(); 
      

      while (il.hasNext()) {
        System.out.println(il.next());
      }

    }


}

