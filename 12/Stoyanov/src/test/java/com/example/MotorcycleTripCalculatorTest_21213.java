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
 * Unit тестове за MotorcycleTripCalculator.
 *
 * Фреймуърк: JUnit 5
 * Мокинг:    Mockito  (мокира се FuelPriceService)
 *
 * Курсов номер: 21213
 */
@ExtendWith(MockitoExtension.class)          // Mockito интеграция с JUnit 5
class MotorcycleTripCalculatorTest_21213 {

    // -------------------------------------------------------------------------
    // Mockito автоматично създава mock обект за FuelPriceService.
    // Реална мрежова заявка НИКОГА не се прави - всичко е изолирано.
    // -------------------------------------------------------------------------
    @Mock
    private FuelPriceService fuelPriceService;

    private MotorcycleTripCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new MotorcycleTripCalculator(fuelPriceService);
    }

    // =========================================================================
    //  HAPPY PATH тестове
    // =========================================================================

    @Test
    @DisplayName("[21213] Стандартен бензинов път → правилна цена на гориво")
    void test_21213_standardPetrolTrip_returnsCorrectFuelCost() {
        // Arrange — настройваме мока: getFuelPrice("petrol") → 2.50
        when(fuelPriceService.getFuelPrice("petrol")).thenReturn(2.50);

        MotorcycleTrip trip = new MotorcycleTrip("София", 200, "petrol", 5.0);
        //   fuelNeeded = (200 / 100) * 5.0 = 10 liters
        //   totalCost  = 10 * 2.50 = 25.00

        // Act
        double result = calculator.calculateFuelCost(trip);

        // Assert
        assertEquals(25.00, result, 0.001,
                "Цената на горивото трябва да е 25.00 BGN");

        // Проверяваме, че мокът е извикан точно веднъж с "petrol"
        verify(fuelPriceService, times(1)).getFuelPrice("petrol");
    }

    @Test
    @DisplayName("[21213] Дизелов път с различен разход → правилна цена")
    void test_21213_dieselTrip_returnsCorrectFuelCost() {
        // Arrange
        when(fuelPriceService.getFuelPrice("diesel")).thenReturn(2.20);

        MotorcycleTrip trip = new MotorcycleTrip("Пловдив", 150, "diesel", 4.5);
        //   fuelNeeded = (150 / 100) * 4.5 = 6.75 liters
        //   totalCost  = 6.75 * 2.20 = 14.85

        // Act
        double result = calculator.calculateFuelCost(trip);

        // Assert
        assertEquals(14.85, result, 0.001);

        verify(fuelPriceService).getFuelPrice("diesel");
    }

    @Test
    @DisplayName("[21213] Късо разстояние → минимална цена")
    void test_21213_shortTrip_returnsMinimalCost() {
        when(fuelPriceService.getFuelPrice("petrol")).thenReturn(2.50);

        MotorcycleTrip trip = new MotorcycleTrip("Къде", 10, "petrol", 5.0);
        //   fuelNeeded = (10 / 100) * 5.0 = 0.5 liters
        //   totalCost  = 0.5 * 2.50 = 1.25

        double result = calculator.calculateFuelCost(trip);

        assertEquals(1.25, result, 0.001);
    }

    @Test
    @DisplayName("[21213] FuelPriceService се извиква с точно правилния тип гориво")
    void test_21213_fuelPriceServiceCalledWithCorrectType() {
        when(fuelPriceService.getFuelPrice("diesel")).thenReturn(2.20);

        calculator.calculateFuelCost(new MotorcycleTrip("Test", 100, "diesel", 5.0));

        // Mockito проверява: мокът трябва да е получил "diesel", не друга тип
        verify(fuelPriceService).getFuelPrice("diesel");
        verify(fuelPriceService, never()).getFuelPrice("petrol");
    }

    // =========================================================================
    //  EDGE CASE и ERROR тестове
    // =========================================================================

    @Test
    @DisplayName("[21213] Невалидна цена от мока (0) → хвърля IllegalStateException")
    void test_21213_invalidPriceFromMock_throwsIllegalStateException() {
        // Arrange — мокът връща невалидна цена 0
        when(fuelPriceService.getFuelPrice("invalid")).thenReturn(0.0);

        MotorcycleTrip trip = new MotorcycleTrip("Test", 100, "invalid", 5.0);

        // Act & Assert
        IllegalStateException ex = assertThrows(IllegalStateException.class,
                () -> calculator.calculateFuelCost(trip));

        assertTrue(ex.getMessage().contains("invalid"));
    }

    @Test
    @DisplayName("[21213] null пътуване → хвърля IllegalArgumentException")
    void test_21213_nullTrip_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculateFuelCost(null));

        // FuelPriceService НЕ трябва да се извика при невалидни данни
        verifyNoInteractions(fuelPriceService);
    }

    @Test
    @DisplayName("[21213] Отрицателно разстояние → хвърля IllegalArgumentException")
    void test_21213_negativeDistance_throwsIllegalArgumentException() {
        MotorcycleTrip trip = new MotorcycleTrip("Test", -10, "petrol", 5.0);

        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculateFuelCost(trip));

        verifyNoInteractions(fuelPriceService);
    }

    @Test
    @DisplayName("[21213] Разстояние 0 → хвърля IllegalArgumentException")
    void test_21213_zeroDistance_throwsIllegalArgumentException() {
        MotorcycleTrip trip = new MotorcycleTrip("Test", 0, "petrol", 5.0);

        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculateFuelCost(trip));

        verifyNoInteractions(fuelPriceService);
    }

    @Test
    @DisplayName("[21213] null FuelPriceService при конструиране → хвърля IllegalArgumentException")
    void test_21213_nullFuelPriceService_throwsOnConstruction() {
        assertThrows(IllegalArgumentException.class,
                () -> new MotorcycleTripCalculator(null));
    }
}