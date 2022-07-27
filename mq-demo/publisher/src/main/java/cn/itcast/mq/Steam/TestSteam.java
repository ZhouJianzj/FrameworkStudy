package cn.itcast.mq.Steam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.Doc;
import java.util.*;
import java.util.stream.Collectors;

public class TestSteam {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("小一", 10.d));
        list.add(new User("小五", 50.d));
        list.add(new User("小六", 60.d));
        list.add(new User("小6", 60.d));
        list.add(new User("小空", null));
        list.add(new User("小九", 90.d));

//        使用filter过滤掉成绩部位null的user
        List<User> userScoreNotNullList = list.stream()
                .filter(user -> null != user.getScore())
                .collect(Collectors.toList());
        System.out.println(userScoreNotNullList.toString());

//        统计学生成绩不为null的人数
        long count = list.stream()
                .filter(user -> null != user.getScore())
                .count();
        System.err.println("学生成绩不为null的人数为：" + count);


//        将学生成绩映射为一个集合
        List<Double> userScoreList = list.stream()
                .map(user -> user.getScore())
                .collect(Collectors.toList());
        System.out.println(userScoreList.toString());


//       将学生的姓名拼接成一个字符串
        String useNames = list.stream().map(user -> user.getName()).collect(Collectors.joining(","));
        System.out.println(useNames);

//        将学生成绩按照逆序排序,正序排序这不需要reversed方法
        List<User> userScoreReversed = list.stream()
                .filter(user -> null != user.getScore())
                .sorted(Comparator.comparing(User::getScore).reversed())
                .collect(Collectors.toList());
        System.out.println(userScoreReversed.toString());


//        遍历每一个元素修改的换的话会改变原有的list,当原有的list中有null的时候会出现异常
        list.stream()
                .filter(user -> null != user.getScore()).
                forEach(user -> user.setScore(user.getScore() + 10) );
        System.err.println(list.toString());


//      将学生成绩进行归集处理
        System.out.println("按学生成绩归集：");
        Map<Double, List<User>> groupByScoreMap = list.stream().filter(p -> null != p.getScore())
                .collect(Collectors.groupingBy(User::getScore));
        for (Map.Entry<Double, List<User>> entry : groupByScoreMap.entrySet()) {
            System.out.println("成绩：" + entry.getKey() + " 人数：" + entry.getValue().size());
        }

        DoubleSummaryStatistics doubleSummaryStatistics = list.stream()
                .filter(user -> null != user.getScore())
                .mapToDouble(User::getScore).summaryStatistics();
        double max = doubleSummaryStatistics.getMax();
        double min = doubleSummaryStatistics.getMin();
        long count1 = doubleSummaryStatistics.getCount();
        double sum = doubleSummaryStatistics.getSum();
        double average = doubleSummaryStatistics.getAverage();
        System.out.println(max);
        System.out.println(min);
        System.out.println(count1);
        System.out.println(sum);
        System.out.println(average);
    }


}

@Data
@NoArgsConstructor
@AllArgsConstructor
class User{
    private String name;
    private Double score;
}