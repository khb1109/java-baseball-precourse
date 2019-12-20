package controller;

import ui.Input;
import ui.Output;
import user.Computer;

public class GameController {

    private final static int THREE_STRIKE = 3;

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
            input.getNumber();
            Output.printCount(computer);
        } while (computer.getStrike() != THREE_STRIKE);
        gameEnd();
    }
    private void gameEnd() {
        Output.printGameEnd();
        if(input.getRestartOrExit())
            gameStart();
    }
}
