import com.zj.Generics;

public class Test_Generics {
    public static void main(String[] args) {
        Generics<String> stringGenerics = new Generics<>("111");
        System.out.println(stringGenerics.getT());
    }
}
