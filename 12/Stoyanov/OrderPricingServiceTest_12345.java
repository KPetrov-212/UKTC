package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Unit тестове за OrderPricingService.
 *
 * Фреймуърк: JUnit 5
 * Мокинг:    Mockito  (мокира се CurrencyService)
 *
 * Курсов номер: 12345   <-- замени с твоя реален номер
 */
@ExtendWith(MockitoExtension.class)          // Mockito интеграция с JUnit 5
class OrderPricingServiceTest_12345 {

    // -------------------------------------------------------------------------
    // Mockito автоматично създава mock обект за CurrencyService.
    // Реална мрежова заявка НИКОГА не се прави - всичко е изолирано.
    // -------------------------------------------------------------------------
    @Mock
    private CurrencyService currencyService;

    private OrderPricingService service;

    @BeforeEach
    void setUp() {
        service = new OrderPricingService(currencyService);
    }

    // =========================================================================
    //  HAPPY PATH тестове
    // =========================================================================

    @Test
    @DisplayName("[12345] Стандартна USD поръчка без отстъпка → правилна крайна цена")
    void test_12345_standardUsdOrder_noDiscount_returnsCorrectPrice() {
        // Arrange — настройваме мока: getCurrencyRate("USD") → 1.80
        when(currencyService.getCurrencyRate("USD")).thenReturn(1.80);

        Order order = new Order("Лаптоп", 500.0, 2, "USD", 0.0);
        //   subtotal   = 500 * 2  = 1000
        //   discounted = 1000 * 1 = 1000
        //   converted  = 1000 * 1.80 = 1800
        //   withTax    = 1800 * 1.20 = 2160.00

        // Act
        double result = service.calculateFinalPrice(order);

        // Assert
        assertEquals(2160.00, result, 0.001,
                "Крайната цена трябва да е 2160.00 BGN");

        // Проверяваме, че мокът е извикан точно веднъж с "USD"
        verify(currencyService, times(1)).getCurrencyRate("USD");
    }

    @Test
    @DisplayName("[12345] EUR поръчка с 10% отстъпка → правилна крайна цена")
    void test_12345_eurOrderWithDiscount_returnsCorrectPrice() {
        // Arrange
        when(currencyService.getCurrencyRate("EUR")).thenReturn(1.96);

        Order order = new Order("Телефон", 300.0, 3, "EUR", 10.0);
        //   subtotal   = 300 * 3       = 900
        //   discounted = 900 * 0.90    = 810
        //   converted  = 810 * 1.96   = 1587.60
        //   withTax    = 1587.60 * 1.20 = 1905.12

        // Act
        double result = service.calculateFinalPrice(order);

        // Assert
        assertEquals(1905.12, result, 0.001);

        verify(currencyService).getCurrencyRate("EUR");
    }

    @Test
    @DisplayName("[12345] 100% отстъпка → крайната цена е 0.00")
    void test_12345_fullDiscount_returnsZero() {
        when(currencyService.getCurrencyRate("USD")).thenReturn(1.80);

        Order order = new Order("Промоционален продукт", 100.0, 1, "USD", 100.0);

        double result = service.calculateFinalPrice(order);

        assertEquals(0.00, result, 0.001);
    }

    @Test
    @DisplayName("[12345] CurrencyService се извиква с точно правилния код на валутата")
    void test_12345_currencyServiceCalledWithCorrectCode() {
        when(currencyService.getCurrencyRate("GBP")).thenReturn(2.26);

        service.calculateFinalPrice(new Order("Книга", 20.0, 1, "GBP", 0.0));

        // Mockito проверява: мокът трябва да е получил "GBP", не друга валута
        verify(currencyService).getCurrencyRate("GBP");
        verify(currencyService, never()).getCurrencyRate("USD");
        verify(currencyService, never()).getCurrencyRate("EUR");
    }

    // =========================================================================
    //  EDGE CASE и ERROR тестове
    // =========================================================================

    @Test
    @DisplayName("[12345] Невалиден курс от мока (0) → хвърля IllegalStateException")
    void test_12345_invalidRateFromMock_throwsIllegalStateException() {
        // Arrange — мокът връща невалиден курс 0
        when(currencyService.getCurrencyRate("XXX")).thenReturn(0.0);

        Order order = new Order("Стока", 50.0, 1, "XXX", 0.0);

        // Act & Assert
        IllegalStateException ex = assertThrows(IllegalStateException.class,
                () -> service.calculateFinalPrice(order));

        assertTrue(ex.getMessage().contains("XXX"));
    }

    @Test
    @DisplayName("[12345] null поръчка → хвърля IllegalArgumentException")
    void test_12345_nullOrder_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> service.calculateFinalPrice(null));

        // CurrencyService НЕ трябва да се извика при невалидни данни
        verifyNoInteractions(currencyService);
    }

    @Test
    @DisplayName("[12345] Отрицателна цена → хвърля IllegalArgumentException")
    void test_12345_negativePrice_throwsIllegalArgumentException() {
        Order order = new Order("Грешен продукт", -10.0, 1, "USD", 0.0);

        assertThrows(IllegalArgumentException.class,
                () -> service.calculateFinalPrice(order));

        verifyNoInteractions(currencyService);
    }

    @Test
    @DisplayName("[12345] Количество 0 → хвърля IllegalArgumentException")
    void test_12345_zeroQuantity_throwsIllegalArgumentException() {
        Order order = new Order("Нещо", 100.0, 0, "USD", 0.0);

        assertThrows(IllegalArgumentException.class,
                () -> service.calculateFinalPrice(order));

        verifyNoInteractions(currencyService);
    }

    @Test
    @DisplayName("[12345] null CurrencyService при конструиране → хвърля IllegalArgumentException")
    void test_12345_nullCurrencyService_throwsOnConstruction() {
        assertThrows(IllegalArgumentException.class,
                () -> new OrderPricingService(null));
    }
}
