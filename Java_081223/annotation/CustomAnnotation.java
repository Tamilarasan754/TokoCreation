//package Test;

import java.lang.reflect.Method;
public class CustomAnnotation {
    public static void main(String[] args) throws Exception{
      toko to=new toko();
      Method m=to.getClass().getMethod("hi");
      helloo h=m.getAnnotation(helloo.class);
      System.out.println(h.value());

    }
}
    

