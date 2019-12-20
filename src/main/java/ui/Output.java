package ui;


import user.Computer;

import java.util.stream.Stream;

public class Output {

    public static void printNumberRequest() {
        System.out.println("숫자를 입력해주세요 : ");
    }

    public static void printGameEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void printCount(Computer computer, String userNumber) {
        if (computer.getStrike(userNumber) > 0)
            System.out.print(computer.getStrike(userNumber) + "스트라이크 ");
        if (computer.getBall(userNumber) > 0)
            System.out.print(computer.getBall(userNumber) + "볼");
        if (computer.isNotting(userNumber))
            System.out.print("낫싱");
        System.out.println();
    }
}