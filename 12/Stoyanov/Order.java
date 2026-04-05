package com.example;

public class Order {
    private final String productName;
    private final double basePrice;
    private final int quantity;
    private final String currency; // e.g. "USD", "EUR"
    private final double discountPercent; // e.g. 10.0 for 10%

    public Order(String productName, double basePrice, int quantity,
                 String currency, double discountPercent) {
        this.productName = productName;
        this.basePrice = basePrice;
        this.quantity = quantity;
        this.currency = currency;
        this.discountPercent = discountPercent;
    }

    public String getProductName()    { return productName; }
    public double getBasePrice()      { return basePrice; }
    public int getQuantity()          { return quantity; }
    public String getCurrency()       { return currency; }
    public double getDiscountPercent(){ return discountPercent; }
}
