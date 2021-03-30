import entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void testOne(){
        String config = "Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("Student");
        student.setAge(22);
        student.setName("zhouajian");
        student.setEmail("299083y@qq.com");
        student.setId(20001);
        System.out.println(student.toString());
    }

}
