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
        String userNumber = new String();
        do {
            Output.printNumberRequest();
            userNumber = input.getNumber();
            Output.printCount(computer, userNumber) ;
        } while (computer.getStrike(userNumber) != MAX_LENGTH);
        gameEnd();
    }
    private void gameEnd() {
        Output.printGameEnd();
        if(input.getRestartOrExit())
            gameStart();
    }
}
