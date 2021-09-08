package com.zj.extend;

public class ExtSonOne extends ExtFather {
    String address ;
    public ExtSonOne() {
    }

    public ExtSonOne(String zj){
        super(zj);
    }

    @Override
    public void doFOne() {
        super.doFOne();
        System.out.print("-----子类重写过了");
    }

    public void doSOne(){
        System.out.println("子类的方法");
    }

    public static void main(String[] args) {
        ExtSonOne sonOne = new ExtSonOne("zhoujian");
        ExtFather soneTwo = new ExtSonOne();
        soneTwo.doFOne();
//        System.out.println(soneTwo.name);

//        System.out.println(sonOne.name);
    }
}
