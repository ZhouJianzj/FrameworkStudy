package com.zj;

public class Test {
    /**
     * 会默认值为0
     */
    int i ;
    public static void main(String[] args) {
//        System.out.println("hello world");
//        new Test().userBreak();
//        new Test().userMethod(90);
//        new Test().userMethod();
//        new Test().userMethod(90,100);
//        System.out.println(new Test().i);
//        System.out.println(new Test(100).i);
        Test.userStatic();
    }
    /**
     * user break in for
     *
     */
    public void userBreak(){
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                break;
            }
            System.out.println(i);
        }
    }
    /**
     * 是由continue继续循环
     */
    public void userContinue(){
        int number = 5;
        myFor:for (int i = 0; i < number ; i++) {
            if (i == 2 ){
                continue myFor;
            }
            System.out.println(i);
        }
    }
    /**
     * 使用静态的方法
     * static method 直接调用无需 new 对象
     */
    public static void userStatic(){
        System.out.println("static method execute!");
    }
    /**
     * use the same method
     */
    public void userMethod(){
        System.out.println("null");
    }
    public void userMethod(int a){
        System.out.println("int a =" + a);
    }
    public void userMethod(int a,int b){
        System.out.println("int a = " + a + "int b = " + b);
    }
    /**
     * none parameter method
     */
    public Test(){

    }
    /**
     * have parameter method
     */
    public Test(int a) {
        this.i = a;
    }
}
