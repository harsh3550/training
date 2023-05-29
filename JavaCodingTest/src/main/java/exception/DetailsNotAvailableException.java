package exception;

public class DetailsNotAvailableException extends RuntimeException{
    final String  reason;
    public DetailsNotAvailableException(String reason){
        this.reason = reason;
    }

    @Override
    public String toString(){
        return "Details of the given file is not available: ";
    }
}