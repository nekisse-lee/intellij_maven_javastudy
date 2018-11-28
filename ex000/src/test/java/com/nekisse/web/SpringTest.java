package com.nekisse.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;



import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {/*"file:/Users/nekisse/Documents/intellij_workspace/intellij_maven_javaStudy/ex000/src/main/webapp/WEB-INF/spring/**.xml"*/ "classpath:WEB-INF/spring/**.xml"})
public class SpringTest {

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Autowired
    private WebApplicationContext ac;

    private MockMvc mockMvc;


    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.ac).build();
        logger.info("Before............");
    }

    @Test
    public void test() throws Exception {
        //given
        mockMvc.perform(MockMvcRequestBuilders.get("/doC").param("msg", "Spring jUnit4test"));
        //when
        //then

    }

}