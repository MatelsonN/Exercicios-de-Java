package Exercises.exceptionHandling.exception;

public class Domainexception extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public Domainexception(String msg) {
        super(msg);
    }

}
