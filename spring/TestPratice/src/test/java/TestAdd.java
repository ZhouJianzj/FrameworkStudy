import com.zhouJian.AddTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * 参数化测试
 */
@RunWith(Parameterized.class)
public class TestAdd {
    private int expected;
    private int input;
    private int output;

    public TestAdd(int expected, int inPut, int outPut) {
        this.expected = expected;
        this.input = inPut;
        this.output = outPut;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> date() {
//        测试参数的赋值，第一个是expert预期的结果，后面的是参数
        Object[][] objects = {{5, 2, 3}, {6, 2, 4}};
        return Arrays.asList(objects);
    }

    @Test
    public void testAdd() {
        AddTest addTest = new AddTest();
//        书写预期结果，和实际的执行方法
        Assert.assertEquals(expected, addTest.doAdd(input, output));
    }
}
