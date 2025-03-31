import java.util.InputMismatchException;

public class ExceptionInput extends InputMismatchException {
  public ExceptionInput(String message) {
    super(message);
  }
}
