package OOPLeason15.Task1;

public class CalcExceptions extends Exception{

    public CalcExceptions() {
    }

    public CalcExceptions(String message) {
        super(message);
    }

    public CalcExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public CalcExceptions(Throwable cause) {
        super(cause);
    }

    public CalcExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


//    CalcExceptions DivisionException = new CalcExceptions("You doesn't division on / null , it is not correct operation");

}
