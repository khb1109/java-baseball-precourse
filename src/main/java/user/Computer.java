package user;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private final static int MAXIMUM_LENGTH = 3;

    private final List<Integer> ballList;

    public Computer() {
        ballList = new ArrayList<>();
    }

    public void initBallList() {
        for (int i = 0; i < MAXIMUM_LENGTH; i++) {
            ballList.add(getRandomData());
        }
    }

    public int getStrike() {
        return 1;
    }

    public int getBall() {
        return 1;
    }

    public boolean isNotting() {
        if (getStrike() == 0 && getBall() == 0)
            return true;
        return false;
    }

    private int getRandomData() {
        int tempData = (int) (Math.random() * 9 + 1);
        if (ballList.stream().anyMatch(x -> x == tempData))
            return getRandomData();
        return tempData;
    }
}
