package ui;

import java.util.Scanner;

public class Input {

    private final Scanner sc;

    public Input() {
        sc = new Scanner(System.in);
    }

    public int getNumber() {
        String tempNumber = sc.next();
        return Integer.parseInt(tempNumber);
    }

    public boolean getRestartOrExit(){
        String answer = sc.next();
        if(answer.equals("y") || answer.equals("Y"))
            return true;
        if(answer.equals("n") || answer.equals("N"))
            return false;
        return getRestartOrExit();
    }
}
