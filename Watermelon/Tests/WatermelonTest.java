import org.junit.Test;

import static org.junit.Assert.*;

public class WatermelonTest {

    @Test
    public void fiftyShouldReturnYes() {
        Watermelon melon = new Watermelon();
        assertEquals("yes",melon.isWeightDivisible(50));
    }
}