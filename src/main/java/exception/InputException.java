package exception;

public class InputException {
    private final static int MAX_LENGTH = 3;

    public static boolean lengthCheck(String number) {
        if (number.length() == MAX_LENGTH)
            return false;
        return true;
    }

    public static boolean stringCheck(String number) {
        try {
            Integer.parseInt(number);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public static boolean zeroCheck(String number) {
        if (number.charAt(0) == '0'
                || number.charAt(1) == '0'
                || number.charAt(2) == '0')
            return true;
        return false;
    }

    public static boolean overlapCheck(String number) {
        if(number.charAt(0) == number.charAt(1) || number.charAt(0) == number.charAt(2)
                || number.charAt(1) == number.charAt(2) )
            return true;
        return false;
    }
}
