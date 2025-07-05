import org.junit.Test;
import static org.junit.Assert.*;

public class CompanyTest {
    
    @Test
    public void testSchedulePickupWithAvailableVehicle() {
        Company company = new Company();
        // Add a vehicle to the company's fleet for testing
        company.addVehicle(new Vehicle(4)); // 4-seater vehicle
        
        PassengerSource source = new PassengerSource(company);
        boolean result = source.requestPickup();
        
        assertTrue("Pickup should be scheduled successfully", result);
    }
    
    @Test
    public void testSchedulePickupWithNoAvailableVehicle() {
        Company company = new Company();
        // Don't add any vehicles to simulate no availability
        
        PassengerSource source = new PassengerSource(company);
        boolean result = source.requestPickup();
        
        assertFalse("Pickup should fail with no available vehicles", result);
    }
}