package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SetToZeroIfMaxFELTest {

    @Test
    public void testZeroOutFELMaxes1() {
        IntList L = IntList.of(1, 22, 15);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("0 -> 0 -> 15", L.toString());
    }

    @Test
    public void testZeroOutFELMaxes2() {
        IntList L = IntList.of(55, 22, 45, 44, 5);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("0 -> 22 -> 45 -> 0 -> 0", L.toString());
    }

    @Test
    public void testZeroOutFELMaxes3() {
        IntList L = IntList.of(5, 535, 35, 11, 10, 0);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("0 -> 0 -> 35 -> 0 -> 10 -> 0", L.toString());
    }

    @Test
    public void testZeroOutFELMaxes4() {
        IntList L = IntList.of(5);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("0", L.toString());
    }

    @Test
    public void testZeroOutFELMaxes5() {
        IntList L = IntList.of(5, 0, 20);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("5 -> 0 -> 20", L.toString());
    }

    @Test
    public void testZeroOutFELMaxes6() {
        IntList L = IntList.of(1001);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("0", L.toString());
    }

    @Test
    public void testZeroOutFELMaxes7() {
        IntList L = IntList.of(20, 14243, 15511, 142, 300000, 16661);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("20 -> 14243 -> 15511 -> 142 -> 300000 -> 0", L.toString());
    }
}

