package aspect.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcut {


    @Pointcut("execution(public * chap007..*(..))")
    public void commonTarget() {

    }

}
