public class Vehicle {
    private int capacity;
    private boolean isAvailable;
    private Location currentLocation;
    private String driverId;

    public Vehicle(int capacity) {
        this.capacity = capacity;
        this.isAvailable = true;
        this.currentLocation = new Location(0, 0); // Default location
    }

    // Encapsulated getters and setters with validation
    public int getCapacity() { 
        return capacity; 
    }

    public boolean isAvailable() { 
        return isAvailable; 
    }

    public void setAvailable(boolean available) {
        // Could add validation logic here if needed
        this.isAvailable = available;
    }

    public Location getCurrentLocation() { 
        return currentLocation; 
    }

    public void setCurrentLocation(Location location) {
        if (location != null) {
            this.currentLocation = location;
        }
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        if (driverId != null && !driverId.isEmpty()) {
            this.driverId = driverId;
        }
    }

    // Business methods
    public boolean canAccommodate(int passengers) {
        return isAvailable && passengers <= capacity;
    }
}