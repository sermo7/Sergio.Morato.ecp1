package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.iwvg.C11;

public class C11Test {
    
    private C11 c11;
    
    @Before 
    public void before(){
        c11 = new C11();
    }
    
    @Test
    public void m1Test(){
        assertEquals("m1", c11.m1());  
    }
    
    @Test
    public void m2Test(){
        assertEquals("m1", c11.m2());  
    }
}
