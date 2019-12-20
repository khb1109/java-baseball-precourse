package ui;


import user.Computer;

import java.util.stream.Stream;

public class Output {

    public static void printNumberRequest() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printGameEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void printCount(Computer computer) {
        if (computer.getStrike() > 0)
            System.out.println(computer.getStrike() + "스트라이크 ");
        if (computer.getBall() > 0)
            System.out.println(computer.getBall() + "볼");
        if (computer.isNotting())
            System.out.println("낫싱");
    }
}