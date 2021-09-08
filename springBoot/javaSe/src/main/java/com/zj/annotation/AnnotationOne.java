package com.zj.annotation;

/**
 * @author zhoujian
 */
public class AnnotationOne extends User {
    @MyAnnotation
    public static void main(String[] args) {
        AnnotationOne annotationOne = new AnnotationOne();
        annotationOne.doDo();

    }
    @Deprecated
    @Override
    public void doDo() {
        super.doDo();
    }
}



/**
 * @author zhoujian
 * 自定义的注解
 */
    @interface MyAnnotation{

}
class User{
        public void doDo(){

        }
}
