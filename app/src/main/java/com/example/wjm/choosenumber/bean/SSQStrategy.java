package com.example.wjm.choosenumber.bean;

/**
 * Created by okbuy on 16-8-22.
 */
public class SSQStrategy implements ILotteryStrategy{

    @Override
    public int getRedCount() {
        return 6;
    }

    @Override
    public int getBlueCount() {
        return 1;
    }

    @Override
    public int getRedMax() {
        return 33;
    }

    @Override
    public int getBlueMax() {
        return 16;
    }
}
