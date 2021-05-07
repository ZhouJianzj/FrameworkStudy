import com.zhoujian.dao.StudentDao;
import com.zhoujian.entity.Student;
import com.zhoujian.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //获取
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //动态的代理，之前的namespace 和 id 去定位的现在不需要了，直接动态代理去实现
        StudentDao stuDaoImple = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = stuDaoImple.selectMethod();
        studentList.forEach(stu -> System.out.println(stu));
        System.out.println("==============================");
        //执行插入操作
        Student student = new Student(1006, "zhouJian", 22, "苏州");
        int i = stuDaoImple.insertMethod(student);
        System.out.println(i);
        //更新
        int jjjjj = stuDaoImple.updateMethod(1001, "jjjjj");
        System.out.println(jjjjj);
        sqlSession.close();
    }
}
