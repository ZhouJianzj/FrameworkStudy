import com.ZhouJian.service.someServiceImple;
import com.ZhouJian.service.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOne {
    @Test
public void test01(){
        //  一原先的方法去创建对象，实现了接口的方法
        someService someService = new someServiceImple();
        someService.doMethod();
    }
    @Test
    public void test02(){
        //  使用spring框架创建对象
        //spring获取配置文件
        String config = "ConfigSpring.xml";
        //使用class路径获取配置文件，返回的是一个容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取bean，然后根据之前的配置文件中的bean中的id创建对象
        someServiceImple someServiceImple = (someServiceImple) ac.getBean("someServiceImple");
        //执行对象中的方法
        someServiceImple.doMethod();
    }

}
