package org.zerock.sample;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:org/zerock/config/RootConfig.java")
//@ContextConfiguration("file:/Users/nekisse/Documents/intellij_workspace/intellij_maven_javaStudy/ex00/src/main/java/com/zerock/config/RootConfig.java")
@ContextConfiguration("file:/Users/nekisse/Documents/intellij_workspace/intellij_maven_javaStudy/ex00/src/main/webapp/root-context.xml")
@Log4j
public class SampleTests {

    @Setter(onMethod_ = { @Autowired })
    private Restaurant restaurant;

    @Test
    public void testExist() {

        assertNotNull(restaurant);

        log.info(restaurant);
        log.info("----------------------------------");
        log.info(restaurant.getChef());

    }


}
