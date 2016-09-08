package com.example.wjm.choosenumber.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by okbuy on 16-8-18.
 */
public class Lottery {
    private List<Integer> redBalls = new ArrayList<>();
    private List<Integer> blueBalls = new ArrayList<>();

    public List<Integer> getRedBalls() {
        return redBalls;
    }

    public void setRedBalls(List<Integer> redBalls) {
        this.redBalls = redBalls;
    }

    public List<Integer> getBlueBalls() {
        return blueBalls;
    }

    public void setBlueBalls(List<Integer> blueBalls) {
        this.blueBalls = blueBalls;
    }

    private String getBallStr(List<Integer> balls) {
        StringBuilder sb = new StringBuilder();
        if (balls != null) {
            for (int i = 0; i < balls.size(); i++) {
                String str;
                int number = balls.get(i);
                if (number < 10) {
                    str = "0" + number;
                } else {
                    str = "" + number;
                }
                if (i != balls.size() - 1) {
                    sb.append(str + "    ");
                } else {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public String getRedBallStr() {
        return getBallStr(redBalls);
    }

    public String getBlueBallStr() {
        return getBallStr(blueBalls);
    }
}
