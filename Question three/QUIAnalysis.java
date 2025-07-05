import java.util.Arrays;
import java.util.Random;

public class AQIMonitor {
    public static void main(String[] args) {
        //  Generate 30 random AQI readings between 1 and 300
        int[] aqiReadings = generateAQIReadings(30);
        System.out.println("Generated AQI Readings: " + Arrays.toString(aqiReadings));
        
        //  Compute and display the median AQI value
        double median = calculateMedian(aqiReadings);
        System.out.println("Median AQI: " + median);
        
        //  Identify and count number of hazardous days (AQI > 200)
        int hazardousDays = countHazardousDays(aqiReadings);
        System.out.println("Number of hazardous days (AQI > 200): " + hazardousDays);
    }
    
    // Generate n random AQI readings between 1 and 300
    public static int[] generateAQIReadings(int n) {
        int[] readings = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            readings[i] = random.nextInt(300) + 1; // 1-300 inclusive
        }
        return readings;
    }
    
    // Calculate median of AQI readings
    public static double calculateMedian(int[] readings) {
        Arrays.sort(readings);
        int n = readings.length;
        if (n % 2 == 0) {
            return (readings[n/2 - 1] + readings[n/2]) / 2.0;
        } else {
            return readings[n/2];
        }
    }
    
    // Count days with AQI > 200
    public static int countHazardousDays(int[] readings) {
        int count = 0;
        for (int aqi : readings) {
            if (aqi > 200) {
                count++;
            }
        }
        return count;
    }
}