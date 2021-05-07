import com.zhouJian.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.TestRule;

import java.util.Date;

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
    @Test
    public void testNumberUtil(){
        NumberUntil numberUntil = new NumberUntil();
        boolean divisible = numberUntil.isDivisible(19);
        boolean prime = numberUntil.isPrime(19);
//        内部比较的是哈希值是否相等，
//        而assertSame内部是使用的== 的方式去比较的，如过是基本的数据类型比较的是哈希值，
//        如果是引用类型的话比较的是对象的内存地址
        Assert.assertEquals(false,divisible);
        Assert.assertEquals(true,prime);
    }
    @Test
    public void testTriangle(){
        Triangle triangle = new Triangle();
        triangle.isNoTriangle(2,3,4);

    }
    @Test
    public void  sum(){
        Sum doSum = new Sum();
        long start = System.currentTimeMillis();
//        Date date = new Date();
        int sum = doSum.sum(1, 1000000000);
//        Date date1 = new Date();
        long end = System.currentTimeMillis();
        System.out.println("和：" + sum);
        System.out.println("start :" + start  );
        System.out.println("end : " + end );
        System.out.println("耗时：" + (end  - start));

    }
}
