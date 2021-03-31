import entity.Book;
import entity.StuClass;
import entity.Student;
import entity.StudentSchool;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void testOne(){
        String config = "Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("Student");
        //附初始值
        System.out.println(student.getName());
        System.out.println(student.getAge());
        //set注入
        System.out.println(student.getEmail());
        System.out.println(student.getId());
    }
    @org.junit.Test
    public void TestStudentSchool(){
        String config = "Beans.xml";
            ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentSchool studentSchool = (StudentSchool) ac.getBean("studentSchool");
        System.out.println(studentSchool.toString());
    }
    @org.junit.Test
    /**
     * 使用构造注入的方式去实现注入
     */
         public  void testStuClass(){
        String config = "Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StuClass stuClass = (StuClass) ac.getBean("stuClass");
        System.out.println(stuClass);
    }
    @org.junit.Test
    /**
     * 测试使用byName
     */
    public void testByName(){
             String config = "Beans.xml";
             ApplicationContext ac =  new ClassPathXmlApplicationContext(config);
             Book book =  (Book) ac.getBean("book");
             System.out.println(book.toString());
    }
    @org.junit.Test
    /**
     * 测试使用byType
     */
    public void testBooks(){
        String config = "Beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Book book2 = (Book) ac.getBean("book2");
        System.out.println(book2.toString());
    }


    @org.junit.Test
    public void testModel(){
        String config = "Total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Object sBook = ac.getBean("book");
        System.out.println(sBook.toString());
    }
}
