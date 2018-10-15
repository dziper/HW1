import org.junit.Test;

import static org.junit.Assert.*;

public class TesterTest {

    @Test
    public void alternateStringsTest1() {
        String result = Tester.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }

    @Test
    public void alternateStringsTest2() {
        String result = Tester.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }

    @Test
    public void alternateStringsTest3() {
        String result = Tester.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }

    @Test
    public void alternateStringsTest4() {
        String result = Tester.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", result);
    }

    @Test
    public void alternateStringsTest5() {
        String result = Tester.alternateStrings("", "");
        assertEquals("", result);
    }

    @Test
    public void abcTest1() {
        Boolean result = Tester.abcTest("123abc");
        assertEquals(true, result);
    }

    @Test
    public void abcTest2() {
        Boolean result = Tester.abcTest("123.abc");
        assertEquals(false, result);
    }

    @Test
    public void abcTest3() {
        Boolean result = Tester.abcTest("abc.123");
        assertEquals(true, result);
    }

    @Test
    public void abcTest4() {
        Boolean result = Tester.abcTest("");
        assertEquals(false, result);

    }


}
