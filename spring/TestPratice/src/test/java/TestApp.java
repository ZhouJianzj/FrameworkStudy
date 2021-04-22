import com.zhouJian.Calculator;
import com.zhouJian.DoMain;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestApp {
    @Test
    public void doMain(){
        DoMain doMainOne = new DoMain();
        doMainOne.doMainOne();
    }
    @Test
    public void testCa(){
        Calculator calculator = new Calculator();
        int add = calculator.add(3, 2);
        assertEquals(5,add);
    }
}
