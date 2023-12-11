public class copy {
   String str;
    public copy(String a) {
        this.str=a;
        System.out.println("hi");
    }
    public copy(copy b) {
        System.out.println(b.str);
    }
    public static void main(String[] args) {
        copy cvt=new copy("Tamil");
        
    }
}
