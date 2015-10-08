package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C31Test {
    
    private C31 c31;
    
    @Before 
    public void before(){
        c31 = new C31();
    }
    
    @Test
    public void m1Test(){
        assertEquals("m1", c31.m1());  
    }

    @Test
    public void m2Test(){
        assertEquals("m2", c31.m2());  
    }
    
    

}
