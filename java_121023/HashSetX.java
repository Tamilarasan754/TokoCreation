import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetX {
    private static Set<Integer> ss=new TreeSet<>();
    public static void main(String[] args) {
        ss.add(1);
        ss.add(5);
        ss.add(2);
        ss.add(3);
        ss.add(3);
        ss.add(3);
        

    Iterator<Integer> it=ss.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }
    }
    
}
