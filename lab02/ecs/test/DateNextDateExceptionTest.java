import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest {
    private int yearInput;
    private int monthInput;
    private int dayInput;

    public DateNextDateExceptionTest(int yearInput, int monthInput, int dayInput) {
        this.yearInput = yearInput;
        this.monthInput = monthInput;
        this.dayInput = dayInput;
    }

    @Parameters
    public static List<Integer[]> data() {
        return Arrays.asList(new Integer[][] {
                { 1500, 2, 31, },
                { 1500, 2, 29, },
                { -1, 10, 20, },
                { 1458, 15, 12, },
                { 1975, 6, -50, }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNextDate() {
        Date input = new Date(yearInput, monthInput, dayInput);
        input.nextDate();
    }

}
