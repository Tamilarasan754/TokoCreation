package exe4;
public abstract class Birds implements LivingBeings {
    public void title()
    {
        System.out.println("Birds");
    }
    public void Fly()
    {
        System.out.println("hello");
    }
    abstract void Eat();
    abstract void Walk();
    abstract void Color();
    
}
