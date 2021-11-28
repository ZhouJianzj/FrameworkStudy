import com.zj.Award;

public class Test_Award {
    public static void main(String[] args) {
        Award<String> stringAward = new Award<>();
        String[] award = {"苹果手机", "华为手机", "扫地机器人", "咖啡机"};
        for (int i = 0; i < award.length; i++) {
            stringAward.add(award[i]);
        }
        System.out.println("恭喜！你抽中了:" + stringAward.get());
    }
}
