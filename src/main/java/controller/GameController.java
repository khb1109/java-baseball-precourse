package controller;

import ui.Input;
import ui.Output;
import user.Computer;

public class GameController {

    private final static int MAX_LENGTH = 3;

    private final Computer computer;
    private final Input input;

    public GameController() {
        computer = new Computer();
        input = new Input();
    }

    public void gameStart() {
        computer.initBallList();
        do {
            Output.printNumberRequest();
            String userNumber = input.getNumber();
            Output.printCount(computer);
        } while (computer.getStrike() != MAX_LENGTH);
        gameEnd();
    }
    private void gameEnd() {
        Output.printGameEnd();
        if(input.getRestartOrExit())
            gameStart();
    }
}
