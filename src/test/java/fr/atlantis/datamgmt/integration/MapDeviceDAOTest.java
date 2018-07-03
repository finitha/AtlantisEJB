/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.atlantis.datamgmt.integration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gmartin
 */
public class MapDeviceDAOTest {
    
    public MapDeviceDAOTest() {
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
     * Test of lookUpAllUserDevices method, of class MapDeviceDAO.
     */
    @Test
    public void testLookUpAllUserDevices() {
        System.out.println("lookUpAllUserDevices");
        String id = "d178e4ff-5f98-4727-a9bf-bc48d51d4f9a";
        MapDeviceDAO instance = new MapDeviceDAO();
        int expResult = 14;
        int result = instance.lookUpAllUserDevices(id).size();
        //assertEquals(expResult, result);
        assertTrue(expResult < result);

    }

    /**
     * Test of lookUpAllDeviceMeasures method, of class MapDeviceDAO.
     */
    @Test
    public void testLookUpAllDeviceMeasures() {
        System.out.println("lookUpAllDeviceMeasures");
        String id = "00:1B:44:11:3A:B7";
        MapDeviceDAO instance = new MapDeviceDAO();
        int expResult = 1;
        int result = instance.lookUpAllDeviceMeasures(id).size();
        assertEquals(expResult, result);

    }

    /**
     * Test of lookUpAllDeviceCalculated method, of class MapDeviceDAO.
     */
    @Test
    public void testLookUpAllDeviceCalculated() {
        System.out.println("lookUpAllDeviceCalculated");
        String id = "00:1B:44:11:3A:B7";
        MapDeviceDAO instance = new MapDeviceDAO();
        int expResult = 2;
        int result = instance.lookUpAllDeviceCalculated(id).size();
        assertEquals(expResult, result);
    }

 
    
}
