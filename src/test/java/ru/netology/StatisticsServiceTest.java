package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxNext() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {0, 7, 9, 14, 25, 103, 88, 65, 1, 51, 12};
        long expected = 103;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}