package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    ru.netology.sqr.SQRService sqrService = new ru.netology.sqr.SQRService();

    @Test
    void calculateSQR() {
        int expected = 3;
        int actual = sqrService.calculateSQR(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresExceedingMinimumLimit() {

        int expected = 0;
        int minNumber = 10;
        int maxNumber = 99;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateNumberOfSquaresMinimumLimit() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();

        int expected = 1;
        int minNumber = 100;
        int maxNumber = 100;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateNumberOfSquaresMaximumLimit() {
        ru.netology.sqr.SQRService service;
        service = new ru.netology.sqr.SQRService();

        int expected = 90;
        int minNumber = 100;
        int maxNumber = 9801;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberOfSquaresExceedingMaximumLimit() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();

        int expected = 90;
        int minNumber = 100;
        int maxNumber = 100_000;

        int actual = sqrService.calculateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }
}
