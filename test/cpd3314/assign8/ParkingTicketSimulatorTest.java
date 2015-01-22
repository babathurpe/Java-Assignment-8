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

import java.util.HashMap;
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class ParkingTicketSimulatorTest extends ParkingTicketSimulator {

    public ParkingTicketSimulatorTest() {
    }

    /**
     * Test of Getters and Setters
     */
    @Test
    public void testGettersSetters() {
        System.out.println("gettersSetters");
        // Establishes the Parked Car
        ParkedCar car = new ParkedCar();
        car.setMake("Buick");
        assertEquals("Buick", car.getMake());
        car.setModel("LeSabre");
        assertEquals("LeSabre", car.getModel());
        car.setColour("Silver");
        assertEquals("Silver", car.getColour());
        car.setLicenseNumber("ABC 123");
        assertEquals("ABC 123", car.getLicenseNumber());
        car.setMinutesParked(134);
        assertEquals(134, car.getMinutesParked());
        
        // Establishes the Parking Meter
        ParkingTicketSimulator.ParkingMeter meter = new ParkingTicketSimulator.ParkingMeter();
        meter.setMinutesPurchased(15);
        assertEquals(15, meter.getMinutesPurchased());
        
        // Establishes the Officer on the Scene
        ParkingTicketSimulator.PoliceOfficer officer = new ParkingTicketSimulator.PoliceOfficer();
        officer.setName("Jim Lahey");
        assertEquals("Jim Lahey", officer.getName());
        officer.setBadge("AB12345");
        assertEquals("AB12345", officer.getBadge());
        
    }
    /**
     * Test of simulate method, of class ParkingTicketSimulator.
     */
    @Test
    public void testIllegallyParked() {
        System.out.println("illegallyParked");
        // Establishes the Parked Car
        ParkedCar car = new ParkedCar();
        car.setMake("Buick");
        car.setModel("LeSabre");
        car.setColour("Silver");
        car.setLicenseNumber("ABC 123");
        car.setMinutesParked(134);

        // Establishes the Parking Meter
        ParkingTicketSimulator.ParkingMeter meter = new ParkingTicketSimulator.ParkingMeter();
        meter.setMinutesPurchased(15);

        // Establishes the Officer on the Scene
        ParkingTicketSimulator.PoliceOfficer officer = new ParkingTicketSimulator.PoliceOfficer();
        officer.setName("Jim Lahey");
        officer.setBadge("AB12345");

        // The Interaction b/w Officer and Parked Car
        assertTrue("Failed to Check Illegally Parked Car", officer.checkIllegallyParked(car, meter));

        ParkingTicketSimulator.ParkingTicket ticket = officer.writeTicket(car, meter);
        String expectedStr = "License Number: ABC 123\nMake: Buick\nModel: LeSabre\nColour: Silver\nFine: $35.00\nOfficer: Jim Lahey\nBadge: AB12345";
        HashMap<String, String> expectedMap = parseTicket(expectedStr);
        HashMap<String, String> ticketMap = parseTicket(ticket.toString());
        assertEquals("Failed to Match Ticket Format", expectedMap, ticketMap);
    }
    
    /**
     * Test of simulate method, of class ParkingTicketSimulator.
     */
    @Test
    public void testLegallyParked() {
        System.out.println("illegallyParked");
        // Establishes the Parked Car
        ParkedCar car = new ParkedCar();
        car.setMake("Buick");
        car.setModel("LeSabre");
        car.setColour("Silver");
        car.setLicenseNumber("ABC 123");
        car.setMinutesParked(13);

        // Establishes the Parking Meter
        ParkingTicketSimulator.ParkingMeter meter = new ParkingTicketSimulator.ParkingMeter();
        meter.setMinutesPurchased(120);

        // Establishes the Officer on the Scene
        ParkingTicketSimulator.PoliceOfficer officer = new ParkingTicketSimulator.PoliceOfficer();
        officer.setName("Jim Lahey");
        officer.setBadge("AB12345");

        // The Interaction b/w Officer and Parked Car
        assertFalse("Failed to Check Legally Parked Car", officer.checkIllegallyParked(car, meter));
    }

    private HashMap<String, String> parseTicket(String str) {
        Scanner in = new Scanner(str);
        HashMap<String, String> out = new HashMap<>();
        while (in.hasNext()) {
            String[] kvp = in.nextLine().split(":");
            String key = kvp[0].trim();
            String value = kvp[1].trim();
            out.put(key, value);
        }
        return out;
    }
}
