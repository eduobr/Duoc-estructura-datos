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
 * @author Sandra
 */
public class busquedasTest {
    
    public busquedasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ordInsercion method, of class busquedas.
     */
    @Test
    public void testOrdInsercion() {
        System.out.println("ordInsercion");
        int[] a = {100,2,3,5,1,220,6,50, 20};
        busquedas.ordInsercion(a);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of intercambiar method, of class busquedas.
     */
    @Test
    public void testIntercambiar() {
        System.out.println("intercambiar");
        int[] a = {100,2,3,5,1,220,6,50, 20};
        int i = 0;
        int j = 0;
        busquedas.intercambiar(a, i, j);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ordSeleccion method, of class busquedas.
     */
    @Test
    public void testOrdSeleccion() {
        System.out.println("ordSeleccion");
        int[] a = {100,2,3,5,1,220,6,50, 20};
        busquedas.ordSeleccion(a);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class busquedas.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int[] numbers = {100,2,3,5,1,220,6,50, 20};
        int key = 220;
        int expResult = 5;
        int result = busquedas.buscar(numbers, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarRepetido method, of class busquedas.
     */
    @Test
    public void testBuscarRepetido() {
        System.out.println("buscarRepetido");
        int[] numbers = {4, 7, 11, 4, 9, 11, 7, 3, 5,7,89};
        int key = 4;
        int pos = 0;
        busquedas instance = new busquedas();
        int expResult = 3; // posicion
        int result = instance.buscarRepetido(numbers, key, pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of busquedaBin method, of class busquedas.
     */
    @Test
    public void testBusquedaBin() {
        System.out.println("busquedaBin");
        int[] a = {1,2,3,5,10,220,600,750, 820};
        int clave = 220;
        busquedas instance = new busquedas();
        int expResult = 5;
        int result = instance.busquedaBin(a, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
