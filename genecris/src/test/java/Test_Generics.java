import com.zj.Generics;

public class Test_Generics {
    public static void main(String[] args) {
//        1.7之后才可以省略new Generics<String>("111");
        Generics<String> stringGenerics = new Generics<>("111");
        String t1 = stringGenerics.getT();
//      规定传递是integer
        Generics<Integer> integerGenerics = new Generics<>();
        Integer t = integerGenerics.getT();
//      都是相同的类
        Class<? extends Generics> aClass = stringGenerics.getClass();
        Class<? extends Generics> aClass1 = integerGenerics.getClass();
        System.out.println(aClass == aClass1);
    }
}
