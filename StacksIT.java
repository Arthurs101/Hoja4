

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author inmar
 */
public class StacksIT {
    /*
    Tests encargados de comprobar que sirvan push y pull
    */
    @Test
    public void testEvaluate() {
    IStack testArray = new StackUsingArrayList<Integer>();
    testArray.push(5);
    int expresut = 5;
    assertEquals(expresut, testArray.pull());
    }
    @Test
    public void testEvaluate2() {
    IStack testArray = new StackUsingDoubleLinkedList<Integer>();
    testArray.push(5);
    int expresut = 5;
    assertEquals(expresut, testArray.pull());
    }
    @Test
    public void testEvaluate3() {
    IStack testArray = new StackUsingLinkedList<Integer>();
    testArray.push(5);
    int expresut = 5;
    assertEquals(expresut, testArray.pull());
    }
    /*
    Verificar que devuelva null al ser inicializada
    */
    @Test
    public void testEvaluate4() {
    IStack testArray = new StackUsingLinkedList<Integer>();
    assertEquals(null, testArray.pull());
    }
    @Test
    public void testEvaluate5() {
    IStack testArray = new StackUsingDoubleLinkedList<Integer>();
    assertEquals(null, testArray.pull());
    }
    @Test
    public void testEvaluate6() {
    IStack testArray = new StackUsingArrayList<Integer>();
    assertEquals(null, testArray.pull());
    }
}
