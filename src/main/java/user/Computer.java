package user;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private final static int MAXIMUM_LENGTH = 3;

    private final List<Character> ballList;

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
            strike += isEqualAdd(userNumber.charAt(i), ballList.get(i));
        }
        return strike;
    }

    private int isEqualAdd(char number1, char number2) {
        if (number1 == number2)
            return 1;
        return 0;
    }

    public int getBall(String userNumber) {
        int ball = 0;
        for (int i = 0; i < MAXIMUM_LENGTH; i++)
            ball += userNumberLoop(userNumber, i);
        return ball;
    }

    private int userNumberLoop(String userNumber, int i) {
        int ballCount = 0;
        for (int j = 0; j < MAXIMUM_LENGTH; j++) {
            ballCount += isBallCountAdd(userNumber.charAt(i), ballList.get(j), i == j);
        }
        return ballCount;
    }

    private int isBallCountAdd(char number1, char number2, boolean eqalIndex) {
        if (eqalIndex)
            return 0;
        if (number1 == number2)
            return 1;
        return 0;
    }

    public boolean isNotting(String userNumber) {
        if (getStrike(userNumber) == 0 && getBall(userNumber) == 0)
            return true;
        return false;
    }

    private char getRandomData() {
        int tempData = (int) (Math.random() * 9 + 1);
        if (ballList.stream().anyMatch(x -> x == tempData))
            return getRandomData();
        return (char) (tempData + '0');
    }
}
