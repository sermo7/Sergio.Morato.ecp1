package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C51Test {
    
    private C51 c51;
    
    @Before 
    public void before(){
        c51 = new C51();
    }
    
    @Test
    public void m1Test(){
        assertEquals("m1", c51.m1());  
    }

    @Test
    public void m2Test(){
        assertEquals("m2", c51.m2());  
    }
    
    

}
