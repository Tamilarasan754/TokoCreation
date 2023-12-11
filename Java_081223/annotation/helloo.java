//package Test;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;


//import java.lang.annotation.*;  

//import CustomAntotation; 

@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE)
@Target(ElementType.METHOD)

 
   
@interface helloo{
    int value();
}
