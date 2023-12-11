package exe4;

public class Eagle {
    public int a;
    public int b;
    Eagle(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println(a+""+b);
    }
    void Eat() {
        System.out.println("It can Eat other animal flush");
    }
    void Walk() {
        System.out.println("It can walk");
    }
    void Color() {
        System.out.println("Brown");
    }
    @Override
    public boolean equals(Object obj)
    {
          
    // checking if both the object references are 
    // referring to the same object.
    if(this == obj)
            return true;
          
        // it checks if the argument is of the 
        // type Geek by comparing the classes 
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
          
        // type casting of the argument. 
        Eagle geek = (Eagle) obj;
          
        // comparing the state of argument with 
        // the state of 'this' Object.
        return (geek.a == this.a && geek.b == this.b);
    }
    
}
