package com.zj.exception;

/**
 * @author zhoujian
 */
public class ExceptionOne extends Exception{
//    public ExceptionOne(String message) {
//        super(message);
//    }
////
    public ExceptionOne(String message) {
        super(message);

    }
//
//    @Override
//    public String getMessage() {
//        return super.getMessage();
//    }

    public ExceptionOne() {
        System.out.println("ExceptionOne Show!");
    }
}
class main{
    public static void main(String[] args) {
         System.out.println(new ExceptionOne("ExceptionOne").getMessage());
            new main().dodo();
    }
    public void dodo(){
        System.out.println("dodo  Execute!");
        try{
                    int a = 10 / 0;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());

        }

    }
}
