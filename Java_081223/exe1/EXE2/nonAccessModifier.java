public class nonAccessModifier {
     final int count=0;
    public nonAccessModifier() {
        count+=1;
        System.out.println(count++);
    }
    public static void main(String[] args) {
        nonAccessModifier na1=new nonAccessModifier();
        nonAccessModifier na2=new nonAccessModifier();
        nonAccessModifier na3=new nonAccessModifier();
        nonAccessModifier na4=new nonAccessModifier();
    }
    
}
