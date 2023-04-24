
public class InvalidNumberException extends Exception{
    private static String ERROR = "ERROR. NO TO NEGATIVE NUMBERS :P ";
    public InvalidNumberException(String msg) {
        super(msg);
    }
    public InvalidNumberException() {
        super(ERROR);
    }
}