package chap007;

import org.springframework.stereotype.Component;

@Component
public interface Calculator {
    public long factorial(long num);
}
