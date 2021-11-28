package com.zhouJian;

public class Sum {
    /**
     * 方法一：
     * 求start 到 end 的累加之后和
     *
     * @param start 开始数字
     * @param end   结束数字
     * @return 累加之和
     */
    public int sum(int start, int end) {
        return ((end - start + 1) * (start + end)) / 2;

    }

    /**
     * 方法二：
     *
     * @param start
     * @param end
     * @return
     */
    public int sumTwo(int start, int end) {
        int sum = 0;
        for (start = 1; start <= end; start++) {
            sum += start;
        }
        return sum;
    }

}
