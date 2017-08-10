package core;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest2 {
    @Test(timeout=1000) // @Ignore
    public void test_01_add_2() { System.out.println("Test # 01: Add 2 Params");
        assertEquals("Not Correct", Calculator.add(200.0, 150.0), 350.0, 0.09); }
    @Test(timeout=1000) // @Ignore
    public void test_02_add_3() { System.out.println("Test # 02: Add 3 Params");
        assertEquals("Not Correct", Calculator.add(2.0, 3.0, 4.0), 9.0, 0.09);}
    @Test(timeout=1000) // @Ignore
    public void test_03_add_4() { System.out.println("Test # 03: Add 4 Params");
        assertEquals("Not Correct", Calculator.add(10.0, 20.0, 30.0, 40.0), 100.0, 0.09); }
    @Test(timeout=1000) // @Ignore
    public void test_04_divide_2() { System.out.println("Test # 04: Divide 2 Params");
        assertEquals("Not Correct", Calculator.divide(10.0, 5.0), 2.0, 0.09);}
    @Test(timeout=1000) // @Ignore
    public void test_05_divide_3() { System.out.println("Test # 05: Divide 3 Params");
        assertEquals("Not Correct", Calculator.divide(100.0, 10.0, 2.0), 5.0, 0.09);}
    @Test(timeout=1000) // @Ignore
    public void test_06_divide_4() { System.out.println("Test # 06: Divide 4 Params");
        assertEquals("Not Correct", Calculator.divide(128.0, 16.0, 4.0, 2.0), 1.0, 0.09);}
    @Test(timeout=1000) // @Ignore
    public void test_07_multiply_2() { System.out.println("Test # 07: Multiply 2 Params");
        assertEquals("Not Correct", Calculator.multiply(2.0, 3.0), 6.0, 0.09);}
    @Test(timeout=1000) // @Ignore
    public void test_08_multiply_3() { System.out.println("Test # 08: Multiply 3 Params");
        assertEquals("Not Correct", Calculator.multiply(2.0, 3.0, 5.0), 30.0, 0.09);}
    @Test(timeout=1000) // @Ignore
    public void test_09_multiply_5() { System.out.println("Test # 09: Multiply 4 Params");
        assertEquals("Not Correct", Calculator.multiply(5.0, 5.0, 5.0, 5.0), 625.0, 0.09);}
    @Test(timeout=1000) // @Ignore
    public void test_10_substract_2() { System.out.println("Test # 10: Substract 2 Params");
        assertEquals("Not Correct", Calculator.subtract(50.0, 25.0), 25.0, 0.09);}
    @Test(timeout=1000) // @Ignore
    public void test_11_substract_3() { System.out.println("Test # 11: Substract 3 Params");
        assertEquals("Not Correct", Calculator.subtract(220.0, 110.0, 55.0), 55.0, 0.09);}
    @Test(timeout=1000) // @Ignore
    public void test_12_substract_4() { System.out.println("Test # 12: Substract 4 Params");
        assertEquals("Not Correct", Calculator.subtract(625.0, 125.0, 25.0, 4.0), 471.0, 0.09); }
}