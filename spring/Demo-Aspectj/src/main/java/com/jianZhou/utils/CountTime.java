package com.jianZhou.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
    public void testAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("++环绕方法执行前");
        //目标对象的方法的返回值
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println(proceed);
        System.out.println("++环绕方法执行后");
    }
}
