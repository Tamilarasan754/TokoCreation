package EXE3;
class monkey
{
    /**
     * Inner
     */
    public void disp() {
        System.out.println("Hello all");
    }
    public class Inner {
    public void dis() {
        System.out.println("how are u");
    }
        
    }
    Inner in=new Inner();
}

public class test2 {
public static void main(String[] args) {
    monkey mm=new monkey();
    mm.in.dis();
    mm.disp();
    
    
    
}
    
}




