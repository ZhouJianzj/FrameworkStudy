package com.jianZhou.service;

public interface SomeServices {
    void doOther();
    String  doSome();
    void doJoinPoint(String string ,Integer integer);
    void doAround();
    void  doException();
    void  doAfter();
    void doPoinCut();
}
