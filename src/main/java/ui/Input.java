package ui;

import exception.InputException;

import java.util.Scanner;

public class Input {

    private final static int MAX_LENGTH = 3;
    private final Scanner sc;

    public Input() {
        sc = new Scanner(System.in);
    }

    public String getNumber() {
        String tempNumber = sc.next();
        if (InputException.lengthCheck(tempNumber)
                || InputException.stringCheck(tempNumber)
                || InputException.zeroCheck(tempNumber)
                || InputException.overlapCheck(tempNumber))
            return getNumber();
        return tempNumber;
    }

    public boolean getRestartOrExit() {
        String answer = sc.next();
        if (answer.equals("y") || answer.equals("Y"))
            return true;
        if (answer.equals("n") || answer.equals("N"))
            return false;
        return getRestartOrExit();
    }
}
