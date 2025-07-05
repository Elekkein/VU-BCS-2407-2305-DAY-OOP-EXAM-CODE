// Base class
class TaxCategory {
    public double calculateVAT(double amount) {
        return 0; // Default implementation (can be abstract)
    }
}

// Subclass for Retailer
class Retailer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.18; // 18% VAT
    }
}

// Subclass for Wholesaler
class Wholesaler extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.15; // 15% VAT
    }
}

// Subclass for Importer
class Importer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.10; // 10% VAT
    }
}

public class EFRISTaxSystem {
    public static void main(String[] args) {
        // Create an array of different taxpayer categories
        TaxCategory[] taxpayers = {
            new Retailer(),
            new Wholesaler(),
            new Importer()
        };
        
        // Test amounts
        double[] amounts = {10000, 50000, 250000};
        
        // Demonstrate runtime polymorphism
        for (TaxCategory taxpayer : taxpayers) {
            System.out.println("Calculating VAT for " + taxpayer.getClass().getSimpleName() + ":");
            for (double amount : amounts) {
                double vat = taxpayer.calculateVAT(amount);
                System.out.printf("  Amount: %.2f, VAT: %.2f%n", amount, vat);
            }
            System.out.println();
        }
    }
}