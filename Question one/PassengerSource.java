import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random;

    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }

    public boolean requestPickup() {
        // Generate random pickup location (0-100 range)
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        
        // Generate random destination location (0-100 range)
        Location destination = new Location(random.nextInt(101), random.nextInt(101));
        
        // Create new passenger
        Passenger passenger = new Passenger(pickup, destination);
        
        // Request company to schedule vehicle
        return company.schedulePickup(passenger);
    }
}
