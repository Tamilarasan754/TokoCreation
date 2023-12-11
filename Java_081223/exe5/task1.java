import java.lang.reflect.Field;

class MyClass {
    private int x;
    private int y;
    private String name;
     int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;

    public MyClass(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
       
    }
   
}

public class task1 {
    public static void main(String[] args) {
        Field[] fields = MyClass.class.getDeclaredFields();
        System.out.println("Number of variables: " + fields.length);
    }
}
