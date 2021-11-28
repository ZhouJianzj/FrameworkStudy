import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {TestApp.class, TestOne.class}
)
public class TestAll {
//    会执行 TestApp类 和 TestOne类 中所有的测试用例
//    这种方法叫做套件测试 TestSuite
}
