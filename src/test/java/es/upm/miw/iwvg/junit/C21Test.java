package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C21Test {
    
    private C21 c21;
    
    @Before 
    public void before(){
        c21 = new C21();
    }
    
    @Test
    public void m1Test(){
        assertEquals("m1", c21.m1());  
    }

    @Test
    public void m2Test(){
        assertEquals("m2", c21.m2());  
    }
    
    

}
