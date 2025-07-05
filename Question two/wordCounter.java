import java.util.Scanner;

public class UgandaWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the book description:");
        String description = scanner.nextLine();
        
        // Convert to lowercase for case-insensitive comparison
        String lowerDescription = description.toLowerCase();
        String target = "uganda";
        
        int count = 0;
        int index = 0;
        
        while ((index = lowerDescription.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }
        
        System.out.println("The word 'Uganda' appears " + count + " times in the description.");
        
        scanner.close();
    }
}