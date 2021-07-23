package com.jianZhou.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component(value = "countTime")
@Aspect
public class CountTime {
    /**
     * 前置通知
     */
  @Before(value = "execution(void *..SomeServiceImple.doOther())")
    public void cutTime() {
        System.out.println("开始的时间为：" + new Date());
    }

    /**
     * 后置通知
     * @param res
     */
    @AfterReturning(value = "execution(String *..SomeServiceImple.doSome())",returning = "res")
    //里面的参数必须要有，参数名要和returning的参数名字一样
    public void testDoOther(Object res){
        //res就是目标对象方法执行的返回结果
      if (res.equals("aa")){
          System.out.println("为aa");
          System.out.println(res = "111111");
      }else{
//          这里改变了业务方法执行之后的返回值，但是还没真正改变原业务方法的返回值
          res ="aaaaaaaaaaaa";
          System.out.println("不为aa");
      }
    }

    /**
     * 参数获取切入点的一些信息
     * @param joinPoint
     */
    @Before(value = "execution(void *..SomeServiceImple.doJoinPoint(..))")
    public void testDoJoinPoint(JoinPoint joinPoint){
        //得到方法的签名
        System.out.println(joinPoint.getSignature());
        //得到的是方法的参数数组
        Object[] args = joinPoint.getArgs();
        for (Object arg :args){
            System.out.println(arg);
        }
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint
     * @throws Throwable
     */
    @Around(value = "execution(* *..SomeServiceImple.doAround())")
    public Object testAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("++环绕方法执行前");
        //目标对象的方法的返回值
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("++环绕方法执行后");
//        只有在业务方法有返回值的时候切面方法的返回值才会奏效
        return proceed + "++++++++";
    }
    @AfterThrowing( value = "execution(void *..SomeServiceImple.doException())")
    public void testException(){
        System.out.println("异常发生了");
    }

    @After(value = "execution(void *..SomeServiceImple.doAfter())")
    public void testAfter(){
        System.out.println("testAfter执行了");
    }

//    使用pointcut注解

    @Before(value = "doDo()")
    public void testPointCutBefore(){
        System.out.println("testPointCutBefore执行了");
    }
    @After(value = "doDo()")
    public void testPointCutAfter(){
        System.out.println("testPointCutAfter执行了");
    }
    @Pointcut( value = "execution(void *..SomeServiceImple.doPoinCut())")
    public void doDo(){

    }

}
