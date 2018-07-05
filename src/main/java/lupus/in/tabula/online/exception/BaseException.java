package lupus.in.tabula.online.exception;

public class BaseException extends Exception{

    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    // fillInStackTrace 에 대한 stack 처리를 하지 않음. 메모리 안정화!
    @Override
    public synchronized Throwable fillInStackTrace() {
        return null;
    }
}
