package com.zj.object;

import com.zj.extend.ExtFather;
import com.zj.extend.ExtSonOne;


/**
 * @author zhoujian
 */
public class main {


    public main() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ExtFather f = new ExtSonOne();
        ExtFather extFather = new ExtFather();
        ExtSonOne s = new ExtSonOne();
        System.out.println(f.equals(s));
    }
}
