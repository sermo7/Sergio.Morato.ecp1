package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.iwvg.C12;

public class C12Test {

    private C12 c12;
    
    
    @Before
    public void before(){
        c12 = new C12();
    }
    
    @Test
    public void test() {
        assertEquals("mA", c12.mA()); 
    }

}
