package com.example.wjm.choosenumber.bean;

/**
 * Created by okbuy on 16-8-22.
 */
public class DLTStrategy implements ILotteryStrategy{

    @Override
    public int getRedCount() {
        return 5;
    }

    @Override
    public int getBlueCount() {
        return 2;
    }

    @Override
    public int getRedMax() {
        return 35;
    }

    @Override
    public int getBlueMax() {
        return 12;
    }
}
