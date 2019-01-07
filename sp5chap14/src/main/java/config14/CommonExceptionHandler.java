package config14;

import org.springframework.beans.TypeMismatchException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages = {"controller14"})
public class CommonExceptionHandler {


  @ExceptionHandler(TypeMismatchException.class)
  public String handleTypeMismatchException() {
    return "error/invalidId";
  }

}
