/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cpd3314.assign8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class MonthTest {
    
    public MonthTest() {
    }

    /**
     * Test of setMonthNumber method, of class Month.
     */
    @Test
    public void testSetMonthNumber() {
        System.out.println("setMonthNumber");
        int monthNumber = 3;
        Month instance = new Month();
        instance.setMonthNumber(monthNumber);
        int result = instance.getMonthNumber();
        assertEquals("Failed to Set and Get the Month Number", monthNumber, result);
    }

    /**
     * Test of getMonthName method, of class Month.
     */
    @Test
    public void testGetMonthName() {
        System.out.println("getMonthName");
        Month instance = new Month(4);
        String expResult = "April";
        String result = instance.getMonthName();
        assertEquals("Failed to Retrieve Month Name", expResult, result);        
    }

    /**
     * Test of toString method, of class Month.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Month instance = new Month(7);
        String expResult = "July";
        String result = instance.toString();
        assertEquals("Failed to Retrieve String Value", expResult, result);        
    }

    /**
     * Test of equals method, of class Month.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Month mo = new Month(4);
        Month instance = new Month();
        instance.setMonthNumber(4);
        boolean expResult = true;
        boolean result = instance.equals(mo);
        assertEquals("Failed to Check Equality", expResult, result);
    }

    /**
     * Test of equals method, of class Month.
     */
    @Test
    public void testInequals() {
        System.out.println("equals");
        Month mo = new Month(4);
        Month instance = new Month();
        instance.setMonthNumber(5);
        boolean expResult = false;
        boolean result = instance.equals(mo);
        assertEquals("Failed to Check Inequality", expResult, result);
    }
    
    /**
     * Test of greaterThan method, of class Month.
     */
    @Test
    public void testGreaterThan() {
        System.out.println("greaterThan");
        Month mo = new Month(4);
        Month instance = new Month();
        instance.setMonthNumber(5);
        boolean expResult = true;
        boolean result = instance.greaterThan(mo);
        assertEquals("Failed to Check Greater Than", expResult, result);        
    }

    /**
     * Test of lessThan method, of class Month.
     */
    @Test
    public void testLessThan() {
        System.out.println("lessThan");
        Month mo = new Month(4);
        Month instance = new Month("June");
        boolean expResult = false;
        boolean result = instance.lessThan(mo);
        assertEquals("Failed to Check Less Than", expResult, result);        
    }
    
}
