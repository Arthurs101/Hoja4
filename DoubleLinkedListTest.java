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
public class DoubleLinkedListTest {


    /**
     * Test of DeleteAtStart method, of class DoubleLinkedList.
     */
    @Test
    public void testDeleteAtStart() {
        System.out.println("DeleteAtStart");
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.InsertAtStart(10);
        Object expResult = 10;
        Object result = instance.DeleteAtStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of DeleteAtEnd method, of class DoubleLinkedList.
     */
    @Test
    public void testDeleteAtEnd() {
        System.out.println("DeleteAtEnd");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.DeleteAtEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Get method, of class DoubleLinkedList.
     */
    @Test
    public void testGet() {
        System.out.println("Get");
        int index = 0;
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.Get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsEmpty method, of class DoubleLinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Count method, of class DoubleLinkedList.
     */
    @Test
    public void testCount() {
        System.out.println("Count");
        DoubleLinkedList instance = new DoubleLinkedList();
        int expResult = 0;
        int result = instance.Count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
