package com.example.wjm.choosenumber;

import com.example.wjm.choosenumber.bean.DLTStrategy;
import com.example.wjm.choosenumber.bean.SSQStrategy;
import com.example.wjm.choosenumber.biz.LotteryBiz;

import org.junit.Test;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        LotteryBiz lotteryBiz = new LotteryBiz(new SSQStrategy());
        System.out.println(lotteryBiz.generate().getRedBallStr());
        System.out.println(lotteryBiz.generate().getBlueBallStr());
        lotteryBiz = new LotteryBiz(new DLTStrategy());
        System.out.println(lotteryBiz.generate().getRedBallStr());
        System.out.println(lotteryBiz.generate().getBlueBallStr());
    }
}