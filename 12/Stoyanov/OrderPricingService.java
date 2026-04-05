package com.example;

/**
 * Service that calculates the final price of an Order in BGN.
 *
 * Formula:
 *   subtotal     = basePrice * quantity
 *   discounted   = subtotal * (1 - discountPercent / 100)
 *   converted    = discounted * exchangeRate          (via CurrencyService)
 *   finalPrice   = converted * (1 + TAX_RATE)
 */
public class OrderPricingService {

    static final double TAX_RATE = 0.20; // 20% ДДС

    private final CurrencyService currencyService;

    public OrderPricingService(CurrencyService currencyService) {
        if (currencyService == null) {
            throw new IllegalArgumentException("CurrencyService не може да е null");
        }
        this.currencyService = currencyService;
    }

    /**
     * Изчислява крайната цена на поръчката в BGN.
     *
     * @param order поръчката, чиято цена се изчислява
     * @return крайна цена в BGN, закръглена до 2 десетични знака
     * @throws IllegalArgumentException при невалидна поръчка
     */
    public double calculateFinalPrice(Order order) {
        validateOrder(order);

        double subtotal   = order.getBasePrice() * order.getQuantity();
        double discounted = subtotal * (1.0 - order.getDiscountPercent() / 100.0);
        double rate       = currencyService.getCurrencyRate(order.getCurrency());

        if (rate <= 0) {
            throw new IllegalStateException(
                "Невалиден курс за валута: " + order.getCurrency());
        }

        double converted   = discounted * rate;
        double withTax     = converted * (1.0 + TAX_RATE);

        // Закръгляме до 2 знака след десетичната запетая
        return Math.round(withTax * 100.0) / 100.0;
    }

    // -------------------------------------------------------------------------

    private void validateOrder(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Поръчката не може да е null");
        }
        if (order.getBasePrice() < 0) {
            throw new IllegalArgumentException("Цената не може да е отрицателна");
        }
        if (order.getQuantity() <= 0) {
            throw new IllegalArgumentException("Количеството трябва да е поне 1");
        }
        if (order.getDiscountPercent() < 0 || order.getDiscountPercent() > 100) {
            throw new IllegalArgumentException("Отстъпката трябва да е между 0 и 100");
        }
        if (order.getCurrency() == null || order.getCurrency().isBlank()) {
            throw new IllegalArgumentException("Валутата не може да е празна");
        }
    }
}
