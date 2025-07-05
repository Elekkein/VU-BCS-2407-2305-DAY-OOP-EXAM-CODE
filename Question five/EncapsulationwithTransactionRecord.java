public class TransactionRecord {
    // Private fields to encapsulate sensitive data
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private LocalDateTime transactionTimestamp;

    // Public getter and setter methods for controlled access
    public String getBuyerTIN() {
        return buyerTIN;
    }

    public void setBuyerTIN(String buyerTIN) {
        // Validation could be added here
        this.buyerTIN = buyerTIN;
    }

    public String getSellerTIN() {
        return sellerTIN;
    }

    public void setSellerTIN(String sellerTIN) {
        this.sellerTIN = sellerTIN;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        if (invoiceAmount >= 0) {
            this.invoiceAmount = invoiceAmount;
        }
    }

    public LocalDateTime getTransactionTimestamp() {
        return transactionTimestamp;
    }

    public void setTransactionTimestamp(LocalDateTime transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }
}