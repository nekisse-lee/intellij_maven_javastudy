package config16;

import org.springframework.beans.TypeMismatchException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages = {"controller16"})
public class CommonExceptionHandler {


  @ExceptionHandler(TypeMismatchException.class)
  public String handleTypeMismatchException() {
    return "error/invalidId";
  }

}
