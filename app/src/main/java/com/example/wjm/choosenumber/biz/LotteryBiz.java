package com.example.wjm.choosenumber.biz;

import com.example.wjm.choosenumber.bean.ILotteryStrategy;
import com.example.wjm.choosenumber.bean.Lottery;

import java.util.List;
import java.util.Random;

/**
 * Created by okbuy on 16-8-19.
 */
public class LotteryBiz implements ILotteryBiz {

    /**
     * 红球个数
     */
    private int redCount;
    /**
     * 蓝球个数
     */
    private int blueCount;
    /**
     * 红球最大数字
     */
    private int redMax;
    /**
     * 蓝球最大数字
     */
    private int blueMax;

    public LotteryBiz(int redCount, int blueCount, int redMax, int blueMax) {
        this.redCount = redCount;
        this.blueCount = blueCount;
        this.redMax = redMax;
        this.blueMax = blueMax;
    }

    public LotteryBiz(ILotteryStrategy strategy) {
        this(strategy.getRedCount(), strategy.getBlueCount(), strategy.getRedMax(), strategy.getBlueMax());
    }

    @Override
    public Lottery generate() {
        Lottery lottery = new Lottery();
        // 生成红球
        generate(redCount, redMax, lottery.getRedBalls());
        // 生成蓝球
        generate(blueCount, blueMax, lottery.getBlueBalls());
        return lottery;
    }

    /**
     * 根据个数，最大值，集合，生成符合要求的球
     *
     * @param count
     * @param max
     * @param list
     */
    private void generate(int count, int max, List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int temp = random.nextInt(max) + 1;
            while (inList(temp, list)) {
                temp = random.nextInt(max) + 1;
            }
            list.add(temp);
        }
        // 按从小到大排序所有球
        sort(list);
    }

    private void sort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    private boolean inList(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (number == list.get(i)) {
                return true;
            }
        }
        return false;
    }
}
