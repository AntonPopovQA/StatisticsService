package ru.netology.statistic.StatisticsService.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void FindMaxAllBranch() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 13, 14, 15, 16, 17, 18, 19, 25, 23, 20};
        long expected = 25;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected,actual);
    }
    }
