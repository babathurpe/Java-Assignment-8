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
public class AreaTest {
    
    public AreaTest() {
    }

    /**
     * Test of calculate method, of class Area.
     */
    @Test
    public void testCalculate_double() {
        System.out.println("calculate");
        double r = 4.0;
        double expResult = 50.26548;
        double result = Area.calculate(r);
        assertEquals("Calculating Area of Circle Failed", expResult, result, 0.0001);        
    }

    /**
     * Test of calculate method, of class Area.
     */
    @Test
    public void testCalculate_double_double() {
        System.out.println("calculate");
        double l = 4.0;
        double w = 5.0;
        double expResult = 20.0;
        double result = Area.calculate(l, w);
        assertEquals("Calculating Area of Rectangle Failed", expResult, result, 0.0001);        
    }

    /**
     * Test of calculate method, of class Area.
     */
    @Test
    public void testCalculate_3args() {
        System.out.println("calculate");
        int n = 3;
        double s = 4.0;
        double r = 3.0;
        double expResult = 18.0;
        double result = Area.calculate(n, s, r);
        assertEquals("Calculating Area of Regular Polygon Failed", expResult, result, 0.0);        
    }
    
}
