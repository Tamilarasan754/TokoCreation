package com.KGiSL.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    public void AddTest()
    {
        int er=6;
       
         Calculator c=new Calculator();
         int ar= c.add(2,4);
     
         assertEquals(er,ar);
      
         
    }
   // @Test
    @Disabled
    public void mul()
    {
        int er=1;
        Calculator c=new Calculator();
        int ar=c.mul(4,2);
        assertEquals(er, ar);
    }
    @Test
    public void sub()
    {
        int er=4;
        Calculator c=new Calculator();
        int ar=c.sub(4,2);
        assertEquals(er, ar);
    }
      // @Test
    @Disabled
    public void div()
    {
        int er=8;
        Calculator c=new Calculator();
        int ar=c.div(4,2);
        assertEquals(er, ar);
    }


   
}
