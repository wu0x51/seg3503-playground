import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

    @Test
    void nextDate_sample() {
        Date d = new Date(2020, 5, 3);
        assertEquals(new Date(2020, 5, 4), d.nextDate());
    }

    @Test
    void nextDateTest1() {
        Date actual = new Date(1700, 6, 20);
        assertEquals(new Date(1700, 6, 21), actual.nextDate());
    }

    @Test
    void nextDateTest2() {
        Date actual = new Date(2005, 4, 15);
        assertEquals(new Date(2005, 4, 16), actual.nextDate());
    }

    @Test
    void nextDateTest3() {
        Date actual = new Date(1901, 7, 20);
        assertEquals(new Date(1901, 7, 21), actual.nextDate());
    }

    @Test
    void nextDateTest4() {
        Date actual = new Date(3456, 3, 27);
        assertEquals(new Date(3456, 3, 28), actual.nextDate());
    }

    @Test
    void nextDateTest5() {
        Date actual = new Date(1500, 2, 17);
        assertEquals(new Date(1500, 2, 18), actual.nextDate());
    }

    @Test
    void nextDateTest6() {
        Date actual = new Date(1700, 6, 29);
        assertEquals(new Date(1700, 6, 30), actual.nextDate());
    }

    @Test
    void nextDateTest7() {
        Date actual = new Date(1800, 11, 29);
        assertEquals(new Date(1800, 11, 30), actual.nextDate());
    }

    @Test
    void nextDateTest8() {
        Date actual = new Date(3453, 1, 29);
        assertEquals(new Date(3453, 1, 30), actual.nextDate());
    }

    @Test
    void nextDateTest9() {
        Date actual = new Date(444, 2, 29);
        assertEquals(new Date(444, 3, 1), actual.nextDate());
    }

    @Test
    void nextDateTest10() {
        Date actual = new Date(2005, 4, 30);
        assertEquals(new Date(2005, 5, 1), actual.nextDate());
    }

    @Test
    void nextDateTest11() {
        Date actual = new Date(3453, 1, 30);
        assertEquals(new Date(3453, 1, 31), actual.nextDate());
    }

    @Test
    void nextDateTest12() {
        Date actual = new Date(3456, 3, 30);
        assertEquals(new Date(3456, 3, 31), actual.nextDate());
    }

    @Test
    void nextDateTest13() {
        Date actual = new Date(1901, 7, 31);
        assertEquals(new Date(1901, 8, 1), actual.nextDate());
    }

    @Test
    void nextDateTest14() {
        Date actual = new Date(3453, 1, 31);
        assertEquals(new Date(3453, 2, 1), actual.nextDate());
    }

    @Test
    void nextDateTest15() {
        Date actual = new Date(3456, 12, 31);
        assertEquals(new Date(3457, 1, 1), actual.nextDate());
    }

    @Test
    void nextDateTest16() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Date(1500, 2, 31);
        });
    }

    @Test
    void nextDateTest17() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Date(1500, 2, 29);
        });
    }

    @Test
    void nextDateTest18() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Date(-1, 10, 20);
        });
    }

    @Test
    void nextDateTest19() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Date(1458, 15, 12);
        });
    }

    @Test
    void nextDateTest20() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Date(1975, 6, -50);
        });
    }

}
