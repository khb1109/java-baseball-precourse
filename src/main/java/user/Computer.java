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
        ballList.clear();
        for (int i = 0; i < MAXIMUM_LENGTH; i++) {
            ballList.add(getRandomData());
        }
    }

    public int getStrike(String userNumber) {
        int strike = 0;
        for (int i = 0; i < MAXIMUM_LENGTH; i++) {
            strike += charEqualInt(userNumber.charAt(i), ballList.get(i));
        }
        return strike;
    }

    private int charEqualInt(char number1, int number2) {
        if ((number1 - '0') == number2)
            return 1;
        return 0;
    }

    public int getBall(String userNumber) {
        int ball = 0;
        return ball;
    }

    public boolean isNotting(String userNumber) {
        if (getStrike(userNumber) == 0 && getBall(userNumber) == 0)
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
