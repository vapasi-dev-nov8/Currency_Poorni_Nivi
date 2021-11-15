package com.currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RupeeTest {

    @Test
    void shouldEqualSameValueRupee() {
        Rupee rupee = new Rupee(10);
        assertTrue(rupee.equals(new Rupee(10)));
    }

    @Test
    void shouldNotEqualRupeesOfDifferentValue() {
        Rupee rupee = new Rupee(10);
        assertFalse(rupee.equals(new Rupee(20)));
    }


    @Test
    void shouldAddValueOfRupeeObject() {
        Rupee rupee = new Rupee(5);
        Rupee expectedResult = new Rupee(7);
        assertEquals(expectedResult,rupee.add(new Rupee(2)));
    }

}