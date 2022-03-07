/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author inmar
 */
public class SingleLinkedListTest {
    
    

    /**
     * Test of DeleteAtStart method, of class SingleLinkedList.
     */
    @Test
    public void testDeleteAtStart() {
        System.out.println("DeleteAtStart");
        SingleLinkedList instance = new SingleLinkedList();
        Object expResult = null;
        Object result = instance.DeleteAtStart();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of DeleteAtEnd method, of class SingleLinkedList.
     */
    @Test
    public void testDeleteAtEnd() {
        System.out.println("DeleteAtEnd");
        SingleLinkedList instance = new SingleLinkedList();
        Object expResult = null;
        Object result = instance.DeleteAtEnd();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of Get method, of class SingleLinkedList.
     */
    @Test
    public void testGet() {
        System.out.println("Get");
        int index = 0;
        SingleLinkedList instance = new SingleLinkedList();
        Object expResult = null;
        Object result = instance.Get(index);
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of IsEmpty method, of class SingleLinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        SingleLinkedList instance = new SingleLinkedList();
        boolean expResult = true;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of Count method, of class SingleLinkedList.
     */
    @Test
    public void testCount() {
        System.out.println("Count");
        SingleLinkedList instance = new SingleLinkedList();
        int expResult = 0;
        int result = instance.Count();
        assertEquals(expResult, result);
       
       
    }
    
}
