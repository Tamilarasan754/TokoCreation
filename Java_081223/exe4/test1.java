package exe4;

public class test1 {
    public static void main(String[] args) {
        int x=10;
        int y=x;
    System.out.println(x==y);
        Eagle Eg=new Eagle(1,2);
        // Eg.Color();
        // Eg.Eat();
        // Eg.LayEgg();
        // Eg.title();
        Eagle Eg1=null;
        Eagle eg2=new Eagle(1,2);
         System.out.println("Equals "+Eg1.equals(Eg));
         System.out.println(Eg1);
         System.out.println(Eg.hashCode());
         System.out.println(Eg1.hashCode());
         System.out.println(Eg.toString());
         System.out.println(Eg1.toString());
        System.out.println(LivingBeings.a);
        LivingBeings.Type();

    }
}
