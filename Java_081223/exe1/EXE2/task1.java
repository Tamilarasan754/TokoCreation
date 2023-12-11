public class task1 {
    String str;
    public task1() {
        str="hello";
    }
    public task1(task1 t) {
        System.out.println(t.str);
    }
    public static void main(String[] args) {
        task1 t1=new task1();
        task1 t2=new task1(t1);

    }
}
