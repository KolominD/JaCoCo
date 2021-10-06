package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxWithLargeValue(){
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {111,144, 1000, 20000, 599999, 99111919};
        long expected = 99111919;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}